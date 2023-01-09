import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int number = userInput.nextInt();

        System.out.println("Tabela de multiplicação de " + number);
        for(int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + number + " = " + number * i);
        }
    }
}
