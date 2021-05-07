
public class HttpServer{

	public static void main(String[] args){
		HttpServer.start();
	}
	
	public void start() throws IOException  {
		ServerSocket socket = new ServerSocket(port);
		System.out.println("Listening on port " + port);
		Socket client;
		while ((client = socket.accept()) != null)  {
		  System.out.println("Received connection from " + client.getRemoteSocketAddress().toString());
		  SocketHandler handler = new SocketHandler(client, handlers);
		  Thread t = new Thread(handler);
		  t.start();
		}
  }
}