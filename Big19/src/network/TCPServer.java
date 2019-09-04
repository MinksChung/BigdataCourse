package network;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	static int cnt;
	
	public static void main(String[] args) throws Exception {
		
		// 1. 연결만 담당하는 서버소켓 필요
		ServerSocket server = new ServerSocket(9100);
		System.out.println("1. 9100번 서버 소켓 생성");
		System.out.println("2. 클라이언트의 요청을 기다리는 중");
		
		// 2. 연결을 승인
		// 3. 승인한 경우 데이터 전송용 소켓 확보
		while(true) {
		Socket socket =  server.accept();
		System.out.println("3. 클라이언트의 요청을 승인");
		cnt++;
		System.out.println(cnt);
		
		// 4. 3번에서 확보한 소켓을 통해 데이터 전송
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		out.println("i'm a java programmer");
		}

	}

}
