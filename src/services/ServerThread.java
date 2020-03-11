package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerThread extends Thread {

	private String message;
	private Socket s;
	

	@Override
	public void run() {
		
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
		while ((message = input.readLine())!= null){
			
			System.out.println("client> "+ message);
			
		}
		s.close();
	
			
	} catch (IOException e) {
		
		System.out.println("SERVER>"+e.getMessage());
	}

	}

}
