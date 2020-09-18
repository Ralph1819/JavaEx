package com.javaex.network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) {
		//	서버 소켓
		ServerSocket serverSocket = null;
		
		try {
			//	바인드 : 주소 , 포트 연결
			serverSocket = new ServerSocket();
			InetSocketAddress local = new InetSocketAddress("127.0.0.1", 10000);
			serverSocket.bind(local);
			
			System.out.println("<서버 시작>");
			System.out.println("[서버:  연결을 기다립니다.]");
			
			while(true) {
			//	대기 및 통신용 소케 얻어오기
			Socket socket = serverSocket.accept();	//	대기 상태
			//	서버 쓰레드 생성
			Thread thread = new ServerThread(socket);
			thread.start();
			//	---	서버 쓰레드가 담당해야 할 부분 
			//	클라이언트 접속시 처리
			InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
			
			System.out.println("[서버: 클라이언트가 연결되었습니다.]");
			System.out.println("접속 클라이언트 정보:" + socketAddress.getAddress() + ":" + socketAddress.getPort());
		
		
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//	소켓 닫기
			
			try {
				serverSocket.close();
				
			}catch(IOException e) {
				
			}
		}

	}

}
