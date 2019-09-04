package 채팅프로그램;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatA extends JFrame {
	public JTextField input;
	public JButton send;
	public JTextArea list;
	public JScrollPane scroll;

	public ChatA() throws Exception {
		setTitle("채팅 프러그램 A");
		setSize(500, 500);
		getContentPane().setLayout(null);

		input = new JTextField();
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.append("병수 : " + input.getText() + "\n");
				list.setLineWrap(true);

				try {
					// 보내 줄 데이터 패킷을 담을 소켓 객체 생성
					DatagramSocket socket = new DatagramSocket();
					// 이제 패킷을 만들건데, 패킷에 들어갈 데이터 타입이 byte[] 타입이라서 byte[]타입의 변수 선언
					byte[] data = input.getText().getBytes(); // 텍스트 필드에 있는 데이터를 byte[] 타입으로 변환
//					InetAddress ip = InetAddress.getByName("172.20.10.9");
					// 데이터를 받을 ip 객체 생성(근데 내컴퓨터 내에서 할꺼니까 내ip)
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					// 데이터를 담을 패킷 생성해서 파라미터 값 입력
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 5000);

					// 패킷을 위에서 생성한 소켓 타입으로 전송(전송 위치는 패킷에 들어있는 ip와 port번호)
					socket.send(packet);
					// 버튼 누를 때마다 소켓이 생성 되니까 닫아줌(프로그램 퍼포먼스를 위함)
					socket.close();

				} catch (Exception e2) {
					e2.printStackTrace();
				}
				// 텍스트 필드를 비워주는 건데, 데이터 전송 후 비워줌
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
				list.append("병수 : " + input.getText() + "\n");
				list.setLineWrap(true);
				try {
					DatagramSocket socket = new DatagramSocket();
					byte[] data = input.getText().getBytes();
//					InetAddress ip = InetAddress.getByName("172.20.10.9");
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 5000);

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
			// 5000번 port로 보내는 데이터를 받아 줄 소켓 객체를 생성하
			DatagramSocket socket = new DatagramSocket(6000);
			// 한번만 보내고 끝내지 않도록 무한루프 돌림.
			while (true) {
				// byte[] 타입의 객체를 받기 위해 byte[] 타입의 변수 선언
				byte[] data = new byte[256];
				// 받은 데이터를 담아줄 패킷 그릇 객체 생성
				DatagramPacket packet = new DatagramPacket(data, data.length);
				// 5000번 포트 소켓으로 들어오는 데이터 패킷을 받아줌.
				socket.receive(packet);
				list.append("갑동 : " + new String(data) + "\n");
				list.setLineWrap(true);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {

		ChatA chat = new ChatA();
		chat.process();

	}
}
