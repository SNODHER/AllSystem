import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);s
    public static void main(String[] args) {
        menu();

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                converterpolegadas();
                break;
            case 2:
                Vidade();
                break;

            case 3:
                medias();
                break;

            case 4:
                salario();
                break;

            case 5:
                porcentagemAPI();
                break;

            case 6:
                calcularFatorial();
                break;

            case 7:
                calculoAltura();
                break;

            case 8:
                mensalidadeFacudade();

            default:
                System.out.println("Opção inválida!");
                scanner.close();
        }
    }

    private static void menu() {
        System.out.println("""
                Opções:
                1 - Sistema de conversão de polegadas para metros.
                2 - Sistema de idade.
                3 - Sistema de média das médias.
                4 - Sistema de Salário.
                5 - Sistema de porcentagem IPI.
                6 - Sistema de Calcular fatorial.
                7 - Sistema de calculos por altura.
                8 - Sistema de mensalidade faculdade.
                """);
    }

    private static void converterpolegadas() {
        System.out.println("Digite a polegada.");
        double polegadas = scanner.nextDouble();
        double metrosResult = polegadas * 0.0254;

        System.out.println(polegadas + " polegadas correspondem a " + metrosResult + " metros.");
    }

    private static void Vidade() {
        System.out.println("Digite sua idade.");
        int idade = scanner.nextInt();
        int meses = idade * 12;
        int dias = idade * 365;
        System.out.println("Você tem " + idade + " anos, " + meses + " meses e " + dias + " dias.");
    }

    private static void medias() {
        System.out.println("Digite três números para a primeira média:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        double resultadoMnum1 = (num1 + num2 + num3) / 3.0;

        System.out.println("Digite três números para a segunda média:");
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        int num6 = scanner.nextInt();
        double resultadoMnum2 = (num4 + num5 + num6) / 3.0;

        double resultadoMedias = (resultadoMnum1 + resultadoMnum2) / 2.0;
        System.out.println("A média das médias é igual a: " + resultadoMedias);
    }

    private static void salario() {
        System.out.println("Digite seu salário: ");
        double salario = scanner.nextDouble();
        System.out.println("Seu salário de " + salario + " mais 1% resulta em: " + (salario * 1.01));
    }

    private static void porcentagemAPI() {
        System.out.println("Digite o código do produto 1:");
        int codigoP1 = scanner.nextInt();
        System.out.println("Digite o valor do produto 1:");
        double valorUni1 = scanner.nextDouble();
        System.out.println("Digite a quantidade do produto 1:");
        int quantidadeP1 = scanner.nextInt();

        System.out.println("Digite o código do produto 2:");
        int codigoP2 = scanner.nextInt();
        System.out.println("Digite o valor do produto 2:");
        double valorUni2 = scanner.nextDouble();
        System.out.println("Digite a quantidade do produto 2:");
        int quantidadeP2 = scanner.nextInt();

        System.out.println("Qual a porcentagem a acrescentar aos produtos?");
        double PorcIPI = scanner.nextDouble();

        double resultado = (valorUni1 * quantidadeP1 + valorUni2 * quantidadeP2) * (PorcIPI / 100 + 1);
        int quantidadeTotal = quantidadeP1 + quantidadeP2;

        System.out.println("A quantidade total dos produtos é: "
                + quantidadeTotal + ", e o valor total dos produtos é igual a " + resultado);
    }

    private static void calcularFatorial() {
        System.out.println("Digite o número fatorial (!)");
        int fatorial = scanner.nextInt();
        int calFat = 1;
        for (int i = 1; i <= fatorial; i++) {
            calFat *= i;
        }
        System.out.println("O fatorial de " + fatorial + " é igual a: " + (long) calFat);
    }

    private static void calculoAltura() {
        int sexo, qtMulheres = 0, qtHomens = 0;
        float altura, somaH = 0, mediaHomens, maior = 0, menor = Float.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.print("Escolha o sexo da pessoa (1-Mulher, 2-Homem): ");
            sexo = scanner.nextInt();
            System.out.print("Digite a altura: ");
            altura = scanner.nextFloat();
            if (sexo == 1) {
                qtMulheres++;
            } else if (sexo == 2) {
                qtHomens++;
                somaH = somaH + altura;
                if (altura > maior) {
                    maior = altura;
                }
                if (altura < menor) {
                    menor = altura;
                }
            } else {
                System.out.println("Opção sexo inválido!");
            }
        }
        if (qtHomens != 0) {
            mediaHomens = somaH / qtHomens;
        } else {
            mediaHomens = 0;
        }

        System.out.println("A maior altura do grupo é de " + maior + " m, e a menor é de " + menor + " m");
        System.out.println("A média de altura dos homens é " + mediaHomens + " m");
        System.out.println("O número de mulheres é " + qtMulheres);
    }

    private static void mensalidadeFacudade() {
        System.out.println("Digite quanto você paga de mensalidade:");
        double mensalidade = scanner.nextDouble();
        System.out.println("Digite quantos anos você fará de faculdade:");
        int Qanos = scanner.nextInt();
        double SomaAnosMensalidade = 0;

        SomaAnosMensalidade += mensalidade * 12;

        for (int i = 2; i <= Qanos; ++i) {
            System.out.println("Qual a porcentagem a pagar no ano " + i + "? ");
            double porcentagem = scanner.nextDouble() / 100;
            double result = mensalidade * (1 + porcentagem) * 12;
            SomaAnosMensalidade += result;
        }

        System.out.println("Sua mensalidade corresponde a: " + mensalidade
                + " Você pagará " + (mensalidade * 12) + " em 12 meses.");
        System.out.println("Em " + Qanos + " anos você pagará " + (float) SomaAnosMensalidade);
    }
}
