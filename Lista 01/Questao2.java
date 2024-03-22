import javax.swing.JOptionPane;

        public class Questao2{

            public static String leia(String msg) {
                return JOptionPane.showInputDialog(msg);
            }

        public static void escreva (String msg) {
            JOptionPane.showMessageDialog(null, msg);
        }

        public static int leiaInt (String msg) {
            String teste = JOptionPane.showInputDialog(msg);
            int valor = Integer.parseInt(teste);
            return valor;
        }
                public static void main(String[] args) {
                    int opcao = leiaInt("Escolha uma opção\n1-Domingo\n2-Segunda\n3-Terça\n4-Quarta\n5-Quinta\n6-Sexta\n7-Sábado");

                    switch (opcao) {
                        case 1:
                            escreva ("Domingo");
                            break;

                        case 2:
                        escreva ("Segunda");
                        break;

                        case 3:
                        escreva ("Terça");
                        break;

                        case 4:
                        escreva ("Quarta");
                        break;

                        case 5:
                        escreva ("Quinta");

                        case 6:
                        escreva ("Sexta");
                        break;

                        case 7:
                        escreva ("Sábado");
                        break;

                        default:
                        escreva ("Dia inválido");
                            break;
                    }
                }
            }