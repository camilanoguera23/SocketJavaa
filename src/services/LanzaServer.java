package services;

import java.io.IOException;

public class LanzaServer {

    public static class ConexionCliente extends Connection {
        public ConexionCliente() throws IOException {
           super("client");
        }
    }

    public static void main(String[] args) throws Exception {
       for (int cliente = 0; cliente <8; cliente++) {
          Runnable runnable = new Runnable() {
            public void run() {
                try {
                    ConexionCliente conexion = new ConexionCliente();
                }catch (Exception e) {
                    e.printStackTrace(System.err);
                }            
            }
           };
           Thread thread = new Thread(runnable);
           thread.start();
       }
       MainServer ms = new MainServer();
       ms.startServer();
    }
}