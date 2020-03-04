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

	
	public void onServer() {
		System.out.println("Server> Running...");
		
		try {
			System.out.println("Server> waiting...");
			s = ss.accept();
			System.out.println("client online...");
			
			outputClient = new DataOutputStream(s.getOutputStream());
			outputClient.writeUTF("petition received");
			BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
			while ((message = input.readLine())!= null){
				
				System.out.println("client> "+ message);
				
			}
			
			System.out.println("cliente offline...");
			while(true)
			{
				 System.out.println("Esperando..."); 
				 // Esperando conexión
			      Socket cs = ss.accept();
			      //aquí se conecta un cliente al server socket y muestra
			      //el mensaje que se ha conectado un cliente, y despacha
			      //al cliente en un hilo individual (DespachaClientes)
			      Client++;
			      System.out.println("Cliente " + Client + " en línea");

			      DespachaClientes hilo = new DespachaClientes(cs);
			      hilo.start();
			      System.out.println("clientes atendidos:"+hilo.clientesAtendidos());
			      System.out.println("hilos de clientes activos:"+hilo.hilosActivos1());
			  }
			
			 
			ss.close();
			System.out.println("server stop....");
			
		} catch (IOException e) {
			
			System.out.println("SERVER>"+e.getMessage());
		}
	}
}
