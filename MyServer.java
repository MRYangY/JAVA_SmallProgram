import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	private static ServerSocket serverSocket;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			serverSocket = new ServerSocket(7788);
			while(true){
				Socket socket=serverSocket.accept();
				handleSocket(socket);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				serverSocket.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	public static void handleSocket(Socket socket){
		try {
			String hostAddress=socket.getInetAddress().getHostAddress();
			System.out.println(hostAddress);
			InputStream inputStream=socket.getInputStream();
			int available=inputStream.available();
			byte[] buff=new byte[available];
			inputStream.read(buff);
			inputStream.close();
			socket.close();
			System.out.println(new String(buff));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
