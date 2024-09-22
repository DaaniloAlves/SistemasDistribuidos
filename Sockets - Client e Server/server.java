
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
    public static void main(String[] args) {
        int port = 1234;
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        Scanner scanner = null;

        // inicialização
        try {
            System.out.println("Inicializando o server");
            serverSocket = new ServerSocket(port);
        } catch (Exception e) {
            System.out.println("Conexão falhou");
        }


        // aceitação e comunicação
        try {
            System.out.println("Tentando conexão...");
            clientSocket = serverSocket.accept();
            System.out.println("Conexão foi um sucesso");
            scanner = new Scanner(clientSocket.getInputStream());
            String mensagem = scanner.nextLine();
            System.out.println(mensagem);
        } catch (Exception e) {
            System.out.println("Falha na comunicação");
        }


        // fechamento
        try {
            clientSocket.close();
            serverSocket.close();
            scanner.close();
        } catch (Exception e) {
        }


    }    
}
