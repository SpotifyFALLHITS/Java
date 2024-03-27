import java.util.*;
public class Questao1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
 
        try {
            System.out.print("Insira valor de A: ");
            int A = ler.nextInt();
            
            System.out.print("Insira o valor de B: ");
            int B = ler.nextInt();
            
            System.out.println("Resultado: " + (A / B));
            
        } catch (ArithmeticException e) {
            System.out.println("Impossivel dividir por zero!");
 
        } catch (InputMismatchException e) {
            System.out.println("Os valores inseridos não são valores numéricos!");
        }
    }
}