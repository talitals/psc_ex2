import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = console.nextInt();
        
        System.out.println("O número digitado foi " + numero);

        console.close();
        
    }
}
