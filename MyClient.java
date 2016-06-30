import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket socket=new Socket("localhost", 7788);
			OutputStream outputStream=socket.getOutputStream();
			outputStream.write("你好啊，我是客户端".getBytes());
			outputStream.close();
			socket.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
