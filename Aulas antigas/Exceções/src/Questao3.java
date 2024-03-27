import java.util.*;
public class Questao3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
 
        try {
            System.out.print("Insira o nome do aluno: ");
            String NomeAluno = ler.nextLine();
            if (NomeAluno.isEmpty()) throw new IllegalArgumentException("O nome não foi informado.");
 
            System.out.print("Insira a média do aluno: ");
            double MediaAluno = ler.nextDouble();
 
            System.out.print("Insira o percentual de faltas do aluno: ");
            double FaltasAluno = ler.nextDouble();
 
            System.out.println("Nome do aluno: " + NomeAluno);
            System.out.println("Média do aluno: " + MediaAluno);
            System.out.println("Percentual de faltas: " + FaltasAluno);
 
        } catch (InputMismatchException e) {
            System.out.println("O valor inserido não é um valor numérico");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
