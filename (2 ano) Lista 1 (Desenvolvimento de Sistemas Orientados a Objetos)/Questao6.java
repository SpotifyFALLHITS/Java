import javax.swing.JOptionPane;

public class Questao6 {

    public static String leia(String msg) {
        return JOptionPane.showInputDialog(msg);
    }

    public static void escreva(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static void main(String[] args) {

        String nome, sexo;
        
        nome = leia("Insira o nome: ");
        sexo = leia("Insira o sexo (F ou M): ");

        if(sexo.equals("F")){
            escreva ("Ilmo. Sra."+ " "+ nome);
        }else if(sexo.equals("M")){
            escreva ("Ilmo. Sr."+ " "+ nome);
        }else{
            escreva ("Sexo inválido");
        }
        }
    }

    