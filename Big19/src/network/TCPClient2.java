package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient2 {

	public static void main(String[] args) throws Exception {
		
		// 1. 서버 소켓에 연결 요청
		Socket socket = new Socket("localhost", 9100);
		// 2. 승인되면 전송용 소켓을 확보
		// => 연결이 됨.
		System.out.println("1. 9100 서버로 연결");
		
		// 3. 2번에서 만들어진 연결을 가지고 테이터 전송
		BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String data = input.readLine();
		System.out.println("서버로 부터 전송된 데이터");
		System.out.println("=======================================");
		System.out.println(data);

	}

}
