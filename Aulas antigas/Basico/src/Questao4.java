import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        double velocidadeCarroX = 60.0;
        double velocidadeCarroY = 90.0;

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a distância entre os carros (em Km): ");
        double distancia = ler.nextDouble();

        double velocidadeC = velocidadeCarroY - velocidadeCarroX;

        double tempoH = distancia / velocidadeC;

        double tempoM = tempoH * 60;

        System.out.println("Tempo necessário para o carro Y alcançar o carro X: " + tempoM + " minutos");
    }
}
