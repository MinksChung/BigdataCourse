package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class DnsToIP {

	public static void main(String[] args) {
		
		String dns = "www.daum.net";
		
		try {
			InetAddress ip = InetAddress.getByName(dns);
			System.out.println(ip);
			System.out.println(ip.getHostAddress());
			System.out.println(ip.getHostName());
		} catch (UnknownHostException e) {
			System.out.println(dns + "알 수 없음");
		}finally {
			// 에러 발생여부와 상관없이 꼭 실행 시키고 싶은 내용
			System.out.println("dns 서비스 받음");
		}

	}

}
