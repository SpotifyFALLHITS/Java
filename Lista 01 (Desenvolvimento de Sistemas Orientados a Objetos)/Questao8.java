import javax.swing.JOptionPane;

public class Questao8 {

    public static String leia(String msg) {
        return JOptionPane.showInputDialog(msg);
    }

    public static void escreva(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static int leiaInt(String msg) {
        String teste = JOptionPane.showInputDialog(msg);
        int valor = Integer.parseInt(teste);
        return valor;
    }

    public static void main(String[] args) {

        int num1, num2, i = 0;

        num1 = leiaInt("Insira o 1 número: ");
        num2 = leiaInt("Insira o 2 número: ");

        if(num1 > num2) {
        for (i = num2 + 2; i < num1; i++ ) {
            if (i % 2 == 0){
            System.out.println(i);
            }
        }
        
    }if(num2 > num1) {
        for (i = num1 + 2; i < num2; i++ ) {
            if (i % 2 == 0){
            System.out.println(i);
                }
            }
        }
    }
}


