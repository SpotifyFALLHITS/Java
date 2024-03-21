import javax.swing.JOptionPane;

public class Questao1{

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
        
        int nota1, nota2, nota3, nota4, soma, media;

        nota1 = leiaInt("Insira a nota 1");
        nota2 = leiaInt("Insira a nota 2");
        nota3 = leiaInt("Insira a nota 3");
        nota4 = leiaInt("Insira a nota 4");

        soma = nota1 + nota2 + nota3 + nota4;
        media = soma/4;

       escreva("A soma é: "+ soma);
       escreva("A média é: "+ media);
    }
    }