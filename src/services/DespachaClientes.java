package services;

import java.net.Socket;

public class DespachaClientes extends Thread {
	   static long clientesAtendidos = 0;
	   static long hilosActivos1 = 0;
	   Socket socket;

	   public DespachaClientes(Socket socket) {
	        this.socket = socket;
	   }


	   synchronized long clientesAtendidos() {
	       return clientesAtendidos;
	   }
	   synchronized long hilosActivos {
	       return hilosActivos1;
	   }        
	   synchronized void iniciando() {
	       clientesAtendidos++;
	       hilosActivos1++;
	   }
	   synchronized void terminando() {
	       hilosActivos1--;
	   }

	    public void run() {
	         iniciando();
	         try {
	            despacha();
	         }
	         catch (Exception e) {
	            //aqui manejas la excepción 
	            e.printStackTrace(System.err);
	         }
	         finally {
	            terminando();
	         }
	   }
	   protected void despacha() throws Exception {

	       Client++;  //etc etc
	       //aquí tienes el Socket con el que estás conectado al cliente para comunicarte
	       //con el cliente
	       //...
	       socket.close();
	    }
	  }
