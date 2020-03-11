package services;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServerThread {
	public static void main(String[] args) throws IOException{
		System.out.println("Server>Running...");
		ServerSocket ss= new ServerSocket (8090);
		while(true) {
			System.out.println("Server>Waiting...");
			Socket s= new Socket();
			s=ss.accept();
			
			ServerThread ServerThread= new ServerThread();
			ServerThread.start();
			
		}
	}

}
