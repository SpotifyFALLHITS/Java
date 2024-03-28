public class Questao1 {
    
    public static void main(String args[]) {
      
      double[] A = new double[5];
      double[] B = new double[5];
      int i;
      
      for(i = 0; i < A.length; i++ ) {
          A[i] = (Math.floor(Math.random() * 100));
          B[i] = A[i];
      }
      
      System.out.println(A[0] + " " + A[1] + " " + A[2] + " " + A[3] + " " + A[4]);
      System.out.println(B[0] + " " + B[1] + " " + B[2] + " " + B[3] + " " + B[4]);
    }
}
