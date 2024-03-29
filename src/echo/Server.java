package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) throws IOException {
		
		//서버소켓생성
		ServerSocket a =new ServerSocket();
		
		//바인딩
		a.bind(new InetSocketAddress("192.168.0.22", 10001));//ip주소 + 포트 번호(확인은 cmd에서 ipconfig)
		
		//서버시작
		System.out.println("<서버시작>");
		
		//클라이언트가 접속하면 accept()가 실행
		//소켓 객체생성
		Socket socket=a.accept();
		System.out.println("클라이언트 연결");
		
		//로직
		InputStream b=socket.getInputStream();
		InputStreamReader ir=new InputStreamReader(b, "UTF-8");
		BufferedReader br=new BufferedReader(ir);
		
		OutputStream os=socket.getOutputStream();
		OutputStreamWriter ow=new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw=new BufferedWriter(ow);
		
		//반복문
		while(true) {
			String msg=br.readLine();
			if(msg==null) {//null은 주소이기 때문에 == 가 들어간다
				break;
			}
			
			System.out.println(msg);
		
			bw.write("반갑습니다");
			bw.newLine();
			bw.flush();
		}
		System.out.println("========");
		bw.close();
		br.close();
		socket.close();
		a.close();
	}
}
