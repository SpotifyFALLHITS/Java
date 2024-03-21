import javax.swing.JOptionPane;

public class Questao4 {

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

        int num1, num2;

        num1 = leiaInt("Insira o 1 número: ");
        num2 = leiaInt("Insira o 2 número: ");

        if (num1 > num2) {
            escreva("O primeiro é o maior número");
        } else {
            escreva("O segundo é o maior número");
        }
    }
}
