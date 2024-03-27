import java.util.*;
public class Questao4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
 
        try {
            System.out.print("Insira o valor de A: ");
            int A = ler.nextInt();
 
            System.out.print("Insira o valor de B: ");
            int B = ler.nextInt();
 
            System.out.print("Insira o valor de C: ");
            int C = ler.nextInt();
 
            int menor = Math.min (A, Math.min(B, C));
            int medio = A + B + C - menor - Math.max(A, Math.max(B, C));
            int maior = Math.max(A, Math.max(B, C));
 
            System.out.println("\nOs Valores informados são: " + A + " " + B + " " + C);
            System.out.println("Os Valores ordenados são: " + menor + " " + medio + " " + maior);
 
        } catch (InputMismatchException e) {
            System.out.println("O valor inserido não é um valor inteiro");
        }
    }
}
