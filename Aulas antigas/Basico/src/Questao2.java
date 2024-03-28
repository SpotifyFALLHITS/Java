import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        double consumo = 12.0;

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempoViagem = ler.nextDouble();

        System.out.print("Digite a velocidade média durante a viagem (em Km/h): ");
        double velocidadeMedia = ler.nextDouble();

        double distanciaPercorrida = tempoViagem * velocidadeMedia;

        double litrosCombustivel = distanciaPercorrida / consumo;

        System.out.println("Quantidade de litros de combustível gastos: " + litrosCombustivel + " litros");
    }
}
