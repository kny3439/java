package multiclient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Sender extends Thread{

	
	private Socket socket;
	
	public Sender(Socket socket) {
		this.socket=socket;
	}
	
	@Override
	public void run() {
		
		// 사용자에게 입력 받아서, 서버로 output 함
		
		try {
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in,"UTF-8"));
			// 서버로 전송 할 output
			PrintWriter out=new PrintWriter(socket.getOutputStream());
			
			while(true) {
				String message=br.readLine(); // 입력
				
				if(message.equals("exit")) {
					break;
				}
				
				out.println(message); // 소캣에 메세지 전송
				out.flush();
			}
			
			br.close();
			out.close();
			socket.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
