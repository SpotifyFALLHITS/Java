import java.util.*;
public class Questao2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        try {
            int A;
            System.out.print("Insira um valor inteiro para A: ");
            A = ler.nextInt();
            System.out.print("O valor inserido é um inteiro");
            
        } catch (InputMismatchException e) {
            System.out.println("O valor inserido não é um valor inteiro");
        }
    }
}
