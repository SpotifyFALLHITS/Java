public class Calculadora {

    public float soma(float a, float b){
        return a + b;
    }

    public float subtracao(float a, float b){
        return a - b;
    }

    public float multiplicacao(float a, float b){
        return a * b;
    }

    public float divisao(float a, float b){
        return a / b;
    }

    public double raiz (double a){
        return Math.sqrt(a);
    }
    
    public double porcentagem(double a, double b){
        return b/100 * a;
    }

    public double potenciacao(double a, double b){
        return Math.pow(a, b);
    }
}
