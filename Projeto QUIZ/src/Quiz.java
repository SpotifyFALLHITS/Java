import java.util.*;

public class Quiz {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        try {
            String[][] ranking = new String[100][2];
            int jogadores = 0;
            String[][] perguntas = {
                {"1) Uma das principais leis de trânsito quando o assunto é a segurança. Entretanto, apenas 20% de todos os pai\ns ou responsáveis fazem o transporte de crianças seguindo essa norma. Todas as crianças de até 7 anos e meio\nque devem ser transportadas em um equipamento de segurança, de acordo com toda a proteção indicada. Dito isso\n, quais são as medidas preventivas para assegurar a proteção de uma criança conforme lei?", "A) bebe conforto", "B) assentos de elevação", "C) banco traseiro", "D) cadeirinhas", "E) Todas as anteriores", "E"}, 
                {"2) Todos os condutores brasileiros têm total conhecimento sobre essa lei, mas muitas infrações cometidas no t\nrânsito estão relacionadas à ela. Nos últimos anos, essa fiscalização se tornou ainda mais forte e eficaz, co\nm blitz e a Lei seca para apreender os motoristas que trafegam com esse motivo pelas vias públicas do país. C\nolocando não somente sua vida em perigo, como das demais pessoas, qual é o motivo?", "A) Condução sem CNH", "B) Menor conduzindo o veículo", "C) Condução Embriagada", "D) Condução sem cinto de segurança", "E) Nenhuma das anteriores", "C"}, 
                {"3) Embora muitas pessoas negligenciam o seu uso, ainda mais aquelas que vão no banco traseiro de um veículo,\na simples responsabilidade de usar pode salvar vidas. De acordo com a Sociedade Brasileira de Ortopedia e Tra\numatologia, apenas 3% de todos os adultos utilizam quando andam no banco de trás. Sendo uma ideia extremament\ne equivocada que ele é apenas necessário quando andamos no banco da frente.", "A) Cinto de segurança", "B) Sapatos", "C) Documentos", "D) Acessórios(óculos, brincos, etc.)", "E) Todas as anteriores", "A"}, 
                {"4) Caso você se envolva em um acidente, é fundamental que você atenda as vítimas. Pois, se isso não for reali\nzado o quê pode acontecer com aquele cujo não atendeu as vítimas? Marque a alternativa correta conforme de ac\nordo com o que está determinado no artigo 177 do CTB.", "A) Perde pontos da carteira na CNH", "B) Multa de natureza leve", "C) Multa de natureza grave", "D) Multa de natureza média", "E) Nenhuma das anteriores", "C"}, 
                {"5) Caso você seja um consultor que necessite do auxílio de óculos, aparelhos auditivos ou próteses para que p\nossa dirigir, não pode deixar de utilizar sempre que estiver circulando nas vias públicas do país. Isso porque, além do risco que o não uso pode causar em sua condução, se o condutor for parado em uma fiscalização, o r\nesultado pode ser qual? Isso segundo o artigo 162 do CTB.", "A) Pontos na carteira", "B) Multa média", "C) Cancelamento da CNH", "D) Multa gravíssima", "E) Nenhuma das anteriores", "D"}, 
                {"6) Quando um condutor está dirigindo sem possuir uma habilitação, sem portar o documento físico consigo, além\nde estar com ela cessada ou vencida, o resultado será a aplicação de qual procedimento? Todas essas medidas estão presentes nos incisos I, II, III e V do artigo 12 do CTB.", "A) Multa de natureza média", "B) Apreensão do veículo", "C) Multa de natureza gravíssima", "D) Cancelamento da CNH", "E) Todas as anteriores", "C"}, 
                {"7) O uso do farol baixo durante o dia nas estradas não é mais obrigatório, de acordo com o CTB. Em janeiro de\n2023, a regra passou a valer apenas para rodovias de pista simples. No caso dos motoristas que possuem veícu\nlos com DRL (luz diurna), não é necessário ligar o farol baixo em qualquer situação. Com base na nova lei, qu\nem não respeitar o uso pode receber:", "A) Apenas multa em dinheiro.", "B) Infração média de 4 pontos na CNH e boleto no valor de R$ 130,16 ", "C) Infração grave de 10 pontos na CNH e boleto no valor de R$ 330,78 ", "D) Apenas pontos na CNH", "E) Nenhuma das anteriores.", "B"}, 
                {"8) Dois anos depois do congelamento de prazos por causa da pandemia, a renovação da Carteira Nacional de Habi\nlitação (CNH) volta a ser de quantos dias? Tendo em mente que  a prorrogação excepcional dos prazos foi feita\nlogo no início de quarentena, em 2020.", "A) 1 dia", "B) 7 dias", "C) 45 dias", "D) 15 dias", "E) 30 dias", "E"}, 
                {"9) Além da dor de cabeça causada pela falta do combustível, ficar parado na estrada por falta de combustível e não houver um posto por perto para que possa abastecer o carro, isso pode render ao motorista flagrado em uma situação cujo a gasolina acabou, uma série de penalidades, as quais são essas...", "A) Pontos na CNH", "B) Uma multa", "C) Remoção do veículo", "D) Todas as anteriores", "E) Nenhuma das anteriores", "D"}, 
                {"10) Uma prática bem corriqueira que ocorre bastante no Brasil, na verdade, é uma infração média. Se flagrado, motorista que leva objetos, compras ou caixas no colo, entre as pernas ou à esquerda pode receber quais penalidades?", "A) Multa e pontuação na carteira", "B) Apenas pontuação na carteira", "C) Apenas multa grave", "D) Cancelamento da CNH", "E) Todas as anteriores", "A"} }; 

            while (true) {
                limparTerminal(); //Essa função serve para limpar o terminal
                System.out.println("Bem-vindo ao Quiz do Código de Trânsito Brasileiro!");
                System.out.print("Informe seu nome: ");
                String jogador = ler.nextLine();
                int pontuacao = 0;

                for (int i = 0; i < perguntas.length; i++) {
                    System.out.println("Bem-vindo ao Quiz do Código de Trânsito Brasileiro!");
                    System.out.println(perguntas[i][0]);

                    for (int j = 1; j <= 5; j++) {
                        System.out.println(perguntas[i][j]);
                    }

                    System.out.print("Escolha a opção correta (A, B, C, D ou E): ");
                    String resposta;
                    while (true) {
                        resposta = ler.next().toUpperCase();
                        if (resposta.matches("[A-E]")) {
                            break;
                        } else {
                            System.out.println("Entrada inválida. Insira a resposta novamente.");
                        }
                    }

                    limparTerminal();
                    if (resposta.equals(perguntas[i][perguntas[i].length - 1])) {
                        System.out.println("Resposta correta! +1 ponto\n");
                        pontuacao++;
                    } else {
                        System.out.println("Resposta incorreta. A resposta correta era: " + perguntas[i][perguntas[i].length - 1] + "\n");
                    }
                }

                ranking[jogadores][0] = jogador;
                ranking[jogadores][1] = Integer.toString(pontuacao);
                jogadores++;

                    limparTerminal();
                System.out.print("Deseja encerrar o jogo? ('S' para sim, 'N' para não): ");
                String sair;
                while (true) {
                    sair = ler.next().toUpperCase();
                    if (sair.equals("S") || sair.equals("N")) {
                        break;
                    } else {
                        System.out.println("Entrada inválida. Por favor, insira 'S' para sim ou 'N' para não.");
                    }
                }

                if (sair.equals("S")) {
                    break;
                }
                ler.nextLine();
                System.out.println();
            }

            for (int i = 0; i < jogadores - 1; i++) {
                for (int j = 0; j < jogadores - i - 1; j++) {
                    if (Integer.parseInt(ranking[j][1]) < Integer.parseInt(ranking[j + 1][1])) {
                        String[] temp = ranking[j];
                        ranking[j] = ranking[j + 1];
                        ranking[j + 1] = temp;
                    }
                }
            }

            System.out.println("\nRanking:");
            for (int i = 0; i < jogadores; i++) {
                System.out.println(ranking[i][0] + ": " + ranking[i][1] + " ponto(s)");
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado. Encerrando o programa.");
        }
    }

    public static void limparTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
