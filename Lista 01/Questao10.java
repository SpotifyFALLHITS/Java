import javax.swing.JOptionPane;

public class Questao10 {

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

        int num1, num2, i, resultado = 1, resultado1 = 1, resultadofinal;

        num1 = leiaInt("Insira o valor de A: ");
        num2 = leiaInt("Insira o valor de B: ");

        for (i = 1; i <= num1; i++) {
            resultado = resultado * i;
        }
        for (i = 1; i <= num2; i++) {
            resultado1 = resultado1 * i;
        }

        resultadofinal = resultado / resultado1;

        escreva(String.valueOf(resultado));
        escreva(String.valueOf(resultado1));
        escreva(String.valueOf(resultadofinal));
    }
}
