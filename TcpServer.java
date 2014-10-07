import java.io.*;
import java.net.*;
public class TcpServer {
  public static void main(String argv[]) throws Exception {
          System.out.println("=======Hello========");
	  String fromClientSentence;
	  String toClientSentence;
	  ServerSocket welcomeSocket = new ServerSocket(5000);
	  BufferedReader inFromServer = new BufferedReader(new InputStreamReader(System.in));
          Socket connectionSocket = welcomeSocket.accept();
	  while(true){
		  BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
		  DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
		  fromClientSentence = inFromClient.readLine();
		  System.out.printf("User:%s\n",fromClientSentence);
                  System.out.printf("Server > ");
		  toClientSentence = inFromServer.readLine();
		  outToClient.writeBytes(toClientSentence + "\n");
                  System.out.printf("\n");
	  }
  }
}
