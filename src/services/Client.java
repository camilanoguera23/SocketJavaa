package services;

import java.io.DataOutputStream;

import java.io.IOException;


public class Client extends Connection
{

	public Client() throws IOException {
		super("Client");
		
	}
	public void onClient(String client) {
		System.out.println(client+ "running...");
		try {
		outputServer = new DataOutputStream(s.getOutputStream());
		System.out.println("cient> sending data to server...");
		for(int i =0; i < 2; i++)
		{
			
			outputServer.writeUTF(client+ ">mensaje numero " + (i+1) + "\n");
		}
		System.out.println(client+">data sent...");
		
		
		
		s.close();
		System.out.println(client+ "> Stop...");
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}

}
}