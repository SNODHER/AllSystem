import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Opções:
                1 - Sistema de conversão de polegadas para metros.
                2 - Sistema de idade.
                3 - Sistema de média das médias.
                4 - Sistema de Salário.
                5 - Sistema de porcentagem IPI.
                6 - Sistema de Calcular fatorial.
                7 - Sistema de calculos por altura.
                """);
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite a polegada.");
                double polegadas = scanner.nextDouble();
                double metrosResult = polegadas * 0.0254;

                System.out.println(polegadas + " polegadas correspondem a " + metrosResult + " metros.");
                break;

            case 2:
                System.out.println("Digite sua idade.");
                int idade = scanner.nextInt();
                int meses = idade * 12;
                int dias = idade * 365;
                System.out.println("Você tem " + idade + " anos, " + meses + " meses e " + dias + " dias.");
                break;

            case 3:
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
                break;

            case 4:
                System.out.println("Digite seu salário: ");
                double salario = scanner.nextDouble();
                System.out.println("Seu salário de " + salario + " mais 1% resulta em: " + (salario * 1.01));
                break;

            case 5:
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

                System.out.println("A quantidade total dos produtos é: " + quantidadeTotal + ", e o valor total dos produtos é igual a " + resultado);
                break;

            case 6:
                System.out.println("Digite o número fatorial (!)");
                int fatorial = scanner.nextInt();
                int calFat = 1;
                for (int i = 1; i <= fatorial; i++) {
                    calFat *= i;
                }
                System.out.println("O fatorial de " + fatorial + " é igual a: " + (long) calFat);
                break;

            case 7:
                int sexo, qtMulheres=0, qtHomens=0;
                float altura, somaH=0, mediaHomens, maior=0, menor=0;

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
                    } else {
                        System.out.println("Opção sexo inválido!");
                    }
                    if (altura > maior) {
                        maior = altura;
                    } else if (altura < menor) {
                        menor = altura;
                    }
                }
                mediaHomens = somaH / qtHomens;

                System.out.println("A maior altura do grupo é de " + maior + " m, e a menor é de " + menor + " m");
                System.out.println("A média de altura dos homens é " + mediaHomens + " m");
                System.out.println("O número de mulheres é " + qtMulheres);

            case 8:

        scanner.close();
    }
}
}
