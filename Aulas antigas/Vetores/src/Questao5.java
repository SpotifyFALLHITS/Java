public class Questao5 {
    public static void main(String[] args) {
      int[] A = new int[10];
      int[] B = new int[10];
      int[] C = new int[10];
      int i;
      
      for(i = 0; i < A.length; i++ ) {
         A[i] = (int)(Math.random()*10);
         B[i] = (int)(Math.random()*10);
         C[i] = A[i] * i; 
      }
     System.out.println("Vetor A");
          for(i = 0; i < A.length; i++){
              System.out.print(A[i] + " ");
          }
          
          System.out.println("\nVetor B");
          for(i = 0; i < A.length; i++){
              System.out.print(B[i] + " ");
          }
          
          System.out.println("\nVetor C");
          for(i = 0; i < A.length; i++){
              System.out.print(C[i] + " ");
          }
        }
    }