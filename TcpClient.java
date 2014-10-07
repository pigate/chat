import java.io.*;
import java.net.*;

public class TcpClient
{
        public static void run() {
                  try {
                                        /* Create Input Stream */
                          /* takes user input from System.in */
                          BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
                          /* Create client socket */
                          Socket socket = new Socket("192.168.10.194", 5000);
                          //"192.168.10.194", 5000);
                                                  /*  Create output stream attached to socket*/
                          /* holds message from user to server */
                          DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
                                                   /* Create input stream attached to socket */
                          /* holds message from server to user */
                          BufferedReader inFromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                          System.out.printf("User >");
                          /* get user input */
                          String sentence = inFromUser.readLine();
                          System.out.printf("\n");
                          while (sentence != "q"){
                            /* Send line to server */
                            outToServer.writeBytes(sentence + '\n');
                            /* Read line from server */
                            String serverOutput = inFromServer.readLine();
                            System.out.println("SERVER: "+ serverOutput + "\n");
                            System.out.println("User > ");
                            sentence = inFromUser.readLine();
                            System.out.println("\n");
                          }
                          socket.close();
                  } catch (IOException e){
                          System.out.println("Server shut down with error:" + e);
                  }

                 }
 public static void main(String argv[]) throws Exception
 {
        String hi = "--------Hello----\n";
    System.out.println(hi);
    run();
 }

}

