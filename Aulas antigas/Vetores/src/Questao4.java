import java.util.*;

public class Questao4 {
    
    public static void main(String[] args) {
        
      Scanner ler = new Scanner (System.in);
      double[] A = new double[15];
      double[] B = new double[15];
      int i;
      
      System.out.println("Informe 15 Numeros aleatorios: ");
      
      for(i = 0; i < A.length; i++ ) {
       A[i] = ler.nextDouble();
         B[i]= Math.sqrt(A[i]);
      }
      
      System.out.println(A[0] + " " + A[1] + " " + A[2] + " " + A[3] + " " + A[4] + " " + A[5] + " " + A[6] + " " + A[7] + " " + A[8] + " " + A[9] + " " + A[10] + " " + A[11] + " " + A[12] + " " + A[13] + " " + A[14]);
      System.out.println(B[0] + " " + B[1] + " " + B[2] + " " + B[3] + " " + B[4] + " " + B[5] + " " + B[6] + " " + B[7] + " " + B[8] + " " + B[9] + " " + B[10] + " " + B[11] + " " + B[12] + " " + B[13] + " " + B[14]);
    } 
}