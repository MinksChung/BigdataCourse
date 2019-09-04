package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MessengerA {

	public static void main(String[] args) throws Exception {
		
		// 1. UDP용 socket 필요
		DatagramSocket socket = new DatagramSocket();
		System.out.println("1. 송신 socket 생성");
		
		// 2. UDP용 packet 필요
		// 데이터(byte[]) + 주소(ip+port)
		// ip 객체화(InetAddress
		String input = "데이터 간다~~~~";
		byte[] data = input.getBytes();
		InetAddress ip = InetAddress.getByName("172.20.10.9");
		int port = 5000;
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, port);
		System.out.println("2. 송신 패킷 생성");
		
		// 3. socket 이용해서 packet 전송
		socket.send(packet);		
		System.out.println("3. 패킷 송신 완료");
		socket.close();
		System.out.println("4. A socket close.");
		
	}

}
