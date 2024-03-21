import javax.swing.JOptionPane;

public class Questao9 {

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

        int num1, i, resultado = 1;

        num1 = leiaInt("Insira um número: ");

        for (i = 1; i <= num1; i++) {
            resultado = resultado * i;
        }
        escreva(String.valueOf(resultado));
    }
}
