import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        startServer2();
    }

    public static void startServer(){
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server start");
            Socket socket = serverSocket.accept();
            System.out.println("Get request ..... ");
            while (true){
                int n=socket.getInputStream().read();
                if(n==-1){
                    break;
                } else {
                    System.out.print((char)n);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void startServer2(){
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server start");
            Socket socket = serverSocket.accept();
            System.out.println("Get request ..... ");
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            do {
                String s= is.readLine();
                if(s.equals("")){
                    break;
                } else{
                    System.out.println(s);
                }
            } while (true);
            sendResponse(socket, "200 OK", "text/html", "<h1>hello from server</h1>".getBytes());
            is.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private  static void  sendResponse(Socket socket, String status, String contentType, byte[] content) throws IOException {
        OutputStream clientOutputStream = socket.getOutputStream();
        clientOutputStream.write("HTTP/1.1 200 OK \r\n".getBytes());
        clientOutputStream.write(("ContentType: "+ contentType + "\r\n").getBytes() );
        clientOutputStream.write("\r\n".getBytes());
        clientOutputStream.write(content);
        clientOutputStream.write("\r\n\r\n".getBytes());
        clientOutputStream.flush();


    }


}