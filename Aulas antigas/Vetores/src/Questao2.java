import java.util.*;
public class Questao2 {
    
    public static void main(String[] args) {
        
      Scanner ler = new Scanner (System.in);
      double[] A = new double[8];
      double[] B = new double[8];
      int i;
      
      System.out.println("Informe 8 Numeros aleatorios: ");
      
      for(i = 0; i < A.length; i++ ) {
       A[i] = ler.nextDouble();
         B[i] = A[i] * 2;
      }
      
      System.out.println(A[0] + " " + A[1] + " " + A[2] + " " + A[3] + " " + A[4] + " " + A[5] + " " + A[6] + " " + A[7]);
      System.out.println(B[0] + " " + B[1] + " " + B[2] + " " + B[3] + " " + B[4] + " " + B[5] + " " + B[6] + " " + B[7]);
    }
}