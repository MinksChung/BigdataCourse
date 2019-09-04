package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MessengerC {

	public static void main(String[] args) throws Exception {
		
		// 1. UDP용 socket 필요
		DatagramSocket socket = new DatagramSocket();
		System.out.println("1. 송신 socket 생성");
		
		// 2. UDP용 packet 필요
		// 데이터(byte[]) + 주소(ip+port)
		// ip 객체화(InetAddress
		String input = "I'm a C programmer!";
		byte[] data = input.getBytes();
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		int port = 8000;
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, port);
		System.out.println("2. 송신 패킷 생성");
		
		// 3. socket 이용해서 packet 전송
		socket.send(packet);		
		System.out.println("3. 패킷 송신 완료");
		socket.close();
		System.out.println("4. C socket close.");
		
	}

}
