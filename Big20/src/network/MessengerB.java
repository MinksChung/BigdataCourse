package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class MessengerB {

	public static void main(String[] args) throws Exception {
		
		// 1. UDP socket 필요.
		DatagramSocket socket = new DatagramSocket(8000);
		System.out.println("1. 8000 port 소켓 생성");
		
		// 2. packet을 받아줌.
		byte[] data = new byte[256];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		while(true) {
		socket.receive(packet);
		System.out.println("2. 데이터 수신");
		
		// 3. byte[]로 들어온 것 화면에 프린트
		System.out.println("3. 데이터 출력 : "+new String(data));
		socket.close();
		System.out.println("4. B socket close.");
		}
		
	}

}
