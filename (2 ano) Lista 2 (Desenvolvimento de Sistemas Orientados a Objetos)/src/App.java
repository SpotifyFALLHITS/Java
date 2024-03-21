public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calcular = new Calculadora();

        System.out.println(calcular.soma(4, 5));

        System.out.println(calcular.subtracao(4, 5));

        System.out.println(calcular.multiplicacao(4, 5));

        System.out.println(calcular.divisao(4, 5));

        System.out.println(calcular.raiz(20));

        System.out.println(calcular.porcentagem(4, 5));

        System.out.println(calcular.potenciacao(4, 5));
    }
}
