import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        double pi = 3.14;

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double A = ler.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B = ler.nextDouble();

        System.out.print("Digite o valor de C: ");
        double C = ler.nextDouble();

        double areaTriangulo = (A * C) / 2;

        double areaCirculo = pi * Math.pow(C, 2);

        double areaTrapezio = ((A + B) * C) / 2;

        double areaQuadrado = Math.pow(B, 2);

        double areaRetangulo = A * B;

        System.out.println("Triângulo: " + areaTriangulo);
        System.out.println("Círculo: " + areaCirculo);
        System.out.println("Trapézio: " + areaTrapezio);
        System.out.println("Quadrado: " + areaQuadrado);
        System.out.println("Retângulo: " + areaRetangulo);
    }
}