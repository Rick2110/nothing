import java.util.*;

/*Nome:Henrique Oliveira da Silva*/

public class exercicios {
        public static void main(String[] args) {
                /*double[] alturas = {1.80, 1.60, 1.75, 1.55, 1.82, 1.73, 1.69, 1.58, 1.90, 1.65};
                String[] sexos = {"M", "F", "M", "F", "M", "M", "F", "F", "M", "F"};

                double maioralt = alturas[0];
                double somaaltM = 0;
                int countM = 0;
                int countF = 0;

                for (int i = 0; i < alturas.length; i++) {
                        if (alturas[i] > maioralt) {
                                maioralt = alturas[i];
                        }

                        if (sexos[i].equalsIgnoreCase("M")) {
                                somaaltM += alturas[i];
                                countM++;
                        }

                        if (sexos[i].equalsIgnoreCase("F")) {
                                countF++;
                        }
                }

                double mediaM = (countM > 0) ? somaaltM / countM : 0;

                System.out.printf("Maior altura do grupo: %.2f metros%n", maioralt);
                System.out.printf("Média de altura dos homens: %.2f metros%n", mediaM);
                System.out.printf("Número de mulheres: %d%n", countF);*/

                /*Scanner sc = new Scanner(System.in);
                double altura,comprimento,latas,tamanho;
                latas = 0;

                System.out.println("Qual a altura da parede:");
                altura = sc.nextInt();

                System.out.println("Qual o comprimento da parede:");
                comprimento = sc.nextInt();

                tamanho = altura * comprimento;

                for (int i = 1; i < tamanho;) {
                        tamanho = tamanho - 1.6;
                        latas = latas + 1;
                }
                System.out.println("São necessarios em "+latas+" latas");*/

                /*Scanner scanner = new Scanner(System.in);

                System.out.print("Digite um texto: ");
                String texto = scanner.nextLine();

                String corrigido = texto.replace("ponbas", "pombas");

                System.out.println("Texto corrigido: " + corrigido);*/

                /*double[] alturas = new double[1000];
                Random random = new Random();
                double soma = 0;

                for (int i = 0; i < alturas.length; i++) {
                        alturas[i] = Math.round((random.nextDouble() * 3 + 2) * 100.0) / 100.0;
                        soma += alturas[i];
                }

                double media = soma / alturas.length;

                Arrays.sort(alturas);
                double mediana;
                if (alturas.length % 2 == 0) {
                        mediana = (alturas[alturas.length / 2 - 1] + alturas[alturas.length / 2]) / 2;
                } else {
                        mediana = alturas[alturas.length / 2];
                }

                double somaQuadrados = 0;
                for (double altura : alturas) {
                        somaQuadrados += Math.pow(altura - media, 2);
                }
                double desvioPadrao = Math.sqrt(somaQuadrados / alturas.length);

                System.out.printf("Média: %.2f\n", media);
                System.out.printf("Mediana: %.2f\n", mediana);
                System.out.printf("Desvio padrão: %.2f\n", desvioPadrao);*/

                /*Scanner scanner = new Scanner(System.in);
                ArrayList<Double> notas = new ArrayList<>();
                double soma = 0;
                double nota;

                while (true) {
                        System.out.print("Digite uma nota (ou -1 para finalizar): ");
                        nota = scanner.nextDouble();

                        if (nota == -1) {
                                break;
                        }

                        notas.add(nota);
                        soma += nota;
                }

                double media = (notas.size() > 0) ? soma / notas.size() : 0;
                System.out.printf("Média das notas: %.2f\n", media);*/
        }
}
