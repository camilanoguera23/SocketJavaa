package services;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Server extends Connection {

	public Server( ) throws IOException {
		super("Server");
		// TODO Auto-generated constructor stub
	}

	
	public void onServer() throws ClassNotFoundException,IOException  {
		System.out.println("Server> waiting...");
		s = ss.accept();
		try {
				while (true){
					
					System.out.println("Server> Waiying... ");
					s = ss.accept();
					System.out.println("client online...");
			
		
					BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
				
				
			
			
			while ((message = input.readLine())!= null){
				
				System.out.println("client> "+ message);
				
			}
			
		
			System.out.println("client offline...");
				} 
		
			
			
		} catch (IOException e) {
			
			ss.close();
			
			System.out.println("SERVER>"+e.getMessage());
		}
	

	
		}
}


		
