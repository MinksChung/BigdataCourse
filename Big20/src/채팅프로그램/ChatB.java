package 채팅프로그램;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.apache.tomcat.jni.Socket;

public class ChatB extends JFrame {
	public JTextField input;
	public JButton send;
	public JTextArea list;
	public JScrollPane scroll;

	public ChatB() throws Exception {
		setTitle("채팅 프러그램 B");
		setSize(500, 500);
		getContentPane().setLayout(null);

		input = new JTextField();
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.append("게스트 : " + input.getText() + "\n");
				list.setLineWrap(true);
				try {
					DatagramSocket socket = new DatagramSocket();
					byte[] data = input.getText().getBytes();
//					ip = InetAddress.getByName("172.20.10.9");
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 6000);

					socket.send(packet);
					socket.close();

				} catch (Exception e2) {
					e2.printStackTrace();
				}
				input.setText(null);
			}
		});
		input.setFont(new Font("굴림", Font.PLAIN, 20));
		input.setBounds(12, 422, 354, 29);
		getContentPane().add(input);
		input.setColumns(10);

		send = new JButton("전송");
		send.setFont(new Font("굴림", Font.PLAIN, 20));
		send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.append("게스트 : " + input.getText() + "\n");
				list.setLineWrap(true);
				try {
					DatagramSocket socket = new DatagramSocket();
					byte[] data = input.getText().getBytes();
//					ip = InetAddress.getByName("172.20.10.9");
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 6000);

					socket.send(packet);
					socket.close();

				} catch (Exception e2) {
					e2.printStackTrace();
				}
				input.setText(null);
			}
		});
		send.setBounds(375, 422, 97, 30);
		getContentPane().add(send);

		list = new JTextArea();
		list.setEditable(false);
		list.setFont(new Font("Dialog", Font.PLAIN, 30));
		list.setBounds(12, 10, 460, 406);
		getContentPane().add(list);

		scroll = new JScrollPane(list);
		scroll.setBounds(12, 10, 460, 406);
		getContentPane().add(scroll);

		setVisible(true);
	}

	public void process() {
		try {
			DatagramSocket socket = new DatagramSocket(5000);
			while (true) {
				byte[] data = new byte[256];
				DatagramPacket packet = new DatagramPacket(data, data.length);
				socket.receive(packet);
				list.append("병수 : " + new String(data) + "\n");
				list.setLineWrap(true);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {

		ChatB chat = new ChatB();
		chat.process();

	}
}
