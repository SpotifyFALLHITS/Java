import javax.swing.JOptionPane;

public class Questao5 {

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

        int num1;

        num1 = leiaInt("Insira um número: ");

        if (num1%2 == 0) {
            escreva ("Par");
        }else{
            escreva ("Ímpar");
        }
    }
}