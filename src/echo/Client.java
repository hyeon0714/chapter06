package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) throws IOException {
		
		//소켓객체생성
		Socket a=new Socket();
		System.out.println("클라이언트 시작");
		
		//접속
		a.connect(new InetSocketAddress("192.168.0.22", 10001));
		
		//로직+메세지 보내기
		OutputStream os=a.getOutputStream();
		OutputStreamWriter ow=new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw=new BufferedWriter(ow);
		
		InputStream b=a.getInputStream();
		InputStreamReader ir=new InputStreamReader(b, "UTF-8");
		BufferedReader br=new BufferedReader(ir);
		/*
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		*/
		bw.write("안녕하세요");
		bw.newLine();
		bw.flush();
		
		String msg=br.readLine();
		System.out.println(msg);
		
		//sc.close();
		br.close();
		bw.close();
		a.close();
	}
}
