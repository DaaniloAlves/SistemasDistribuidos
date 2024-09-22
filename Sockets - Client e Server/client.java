
import java.io.PrintStream;
import java.net.Socket;

public class client {
    public static void main(String[] args) {
        int port = 1234;
        String ip = "localhost";
        Socket socket = null;


        // inicialização
        try {
            System.out.println("Tentando conexão com o servidor...");
            socket = new Socket(ip, port);
            System.out.println("Conexão foi um sucesso");
        } catch (Exception e) {
            System.out.println("Conexão falhou");
        }


        // comunicação
        try {
            PrintStream printStream = new PrintStream(socket.getOutputStream());
            printStream.println("Testando.....................");
            
        } catch (Exception e) {
            System.out.println("Comunicação falhou");
        }


        // fechamento
        try {
            socket.close();
        } catch (Exception e) {
            System.out.println("Erro no fechamento");
        }
        


    }
}
