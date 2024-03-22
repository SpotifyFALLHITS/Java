import javax.swing.JOptionPane;

public class Questao7 {

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
        int idade1, idade2, idade3, soma = 0, media;
        int i = 0;
        idade1 = leiaInt("Insira a idade da pessoa 1");
        idade2 = leiaInt("Insira a idade da pessoa 2");
        idade3 = leiaInt("Insira a idade da pessoa 3");
        
        if (idade1 >= 18){
            soma = soma + idade1;
            i++;
        }

        if (idade2 >= 18){
            soma = soma + idade2;
            i++;
        }

       if (idade3 >= 18){
            soma = soma + idade3;
            i++;
        }
            
        media = soma/i;
        escreva ("A soma é"+ " "+ soma);
        escreva("A media das pessoas maiores de 18 anos é: "+ " "+ media);
    }
    }