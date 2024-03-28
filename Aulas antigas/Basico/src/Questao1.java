import java.util.*;

public class Questao1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = ler.nextLine();

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = ler.nextDouble();

        System.out.print("Digite o total de vendas efetuadas pelo vendedor: ");
        double totalVendas = ler.nextDouble();

        double comissao = totalVendas * 0.15;

        double salarioTotal = salarioFixo + comissao;

        System.out.println("O vendedor " + nomeVendedor + " receberá no final do mês: R$" + salarioTotal);

    }
}
