package lzx.Learn_TCPSocket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		try {
			
			ServerSocket ss = new ServerSocket(6666);
			while(true) {
				Socket s = ss.accept();
				System.out.println("A socket connected!");
				DataOutputStream dos = new DataOutputStream(s.getOutputStream());
				dos.writeUTF("hello clinet" + s.getInetAddress());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
