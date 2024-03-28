import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o preço da gasolina: R$ ");
        double precoGasolina = ler.nextDouble();

        System.out.print("Digite o preço do etanol: R$ ");
        double precoEtanol = ler.nextDouble();

        double percentualEtanol = (precoEtanol / precoGasolina) * 100;

        System.out.println("O preço do etanol representa " + percentualEtanol + "% em relação à gasolina.");
    }
}
