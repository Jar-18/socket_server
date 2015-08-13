import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Agent {
	public static int port = 18336;
	
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(port);
			while(true) {
				Socket socket = serverSocket.accept();
				System.out.println("Socket connected.");
				InputStream is = socket.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				OutputStream os = socket.getOutputStream();
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
				while(true) {
					Thread.sleep(5000);
					System.out.println("heihei");
					bw.write("fasf;dfadf;df");
					bw.flush();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
