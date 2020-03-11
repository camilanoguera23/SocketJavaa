package services;

import java.io.IOException;

public class MainClient {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		for (int i=0; i<1; i++) {
		Client cliente=new Client();
		cliente.onClient("Client new"+i);
	}
	}
}
