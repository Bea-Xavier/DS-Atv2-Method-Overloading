import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorTemperatura ConvTemp = new ConversorTemperatura();

        System.out.println("\nSeja bem-vindo! Você está em um programa de transformação de temperatura!\n");
        System.out.println("1- Conversão de Celsius para Fahrenheit.");
        System.out.println("2- Conversão de Fahreinheit para Celsius.");
        System.out.println("3- Conversão de Celsius para Fahrenheit com ajuste adicional.");
        System.out.println("4- Conversão de várias temperaturas simultaneamente.");
        System.out.println("5- Sair.");

        int op;
        double ajuste;
        int Celsius;
        double Fahreinheit;

        do {
            System.out.println("Escolha uma opção: ");

            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite a temperatura em Celsius: ");
                    Celsius = scanner.nextInt();

                    System.out.println(Celsius + "°C equivale a " + ConvTemp.converta(Celsius) + "°F.");
                    break;

                case 2:
                    System.out.println("Digite a temperatura em Fahreinheit: ");
                    Fahreinheit = scanner.nextDouble();

                    System.out.println(Fahreinheit + "°F equivale a " + ConvTemp.converta(Fahreinheit) + "°C.");
                    break;

                case 3:
                    System.out.println("Digite a temperatura em Celsius: ");
                    Celsius = scanner.nextInt();
                    System.out.println("Digite a quantidade do ajuste da temperatura: ");
                    ajuste = scanner.nextDouble();

                    System.out.println(Celsius + "°C com o ajuste de " + ajuste + "° equivale a " + ConvTemp.converta(Celsius, ajuste) + "°F.");
                    break;

                case 4:
                    System.out.println("Quantas temperaturas você quer converter?");
                    int tamanho = scanner.nextInt();

                    int[] arrayCelsius = new int[tamanho];
                    double[] arrayFahrenheit = new double[tamanho];

                    System.out.println("Ao trabalhar com um conjunto de temperaturas você quer...");
                    System.out.println("1- Converter Celsius para Fahrenheit.");
                    System.out.println("2- Converter Fahrenheit para Celsius.");
                    System.out.println("3- Converter Celsius para Fahrenheit com um ajuste cada temperatura.");
                    System.out.println("Escolha: ");

                    op = scanner.nextInt();

                    switch (op) {
                        case 1:
                            for (int i = 0; i < arrayCelsius.length; i++) {
                                System.out.println("Digite a temperatura em Celsius: ");
                                arrayCelsius[i] = scanner.nextInt();

                                System.out.println(arrayCelsius[i] + "°C equivale a " + ConvTemp.converta(arrayCelsius[i]) + "°F.");
                            }

                            break;

                        case 2:
                            for (int i = 0; i < arrayFahrenheit.length; i++) {
                                System.out.println("Digite a temperatura em Fahrenheit: ");
                                arrayFahrenheit[i] = scanner.nextDouble();

                                System.out.println(arrayFahrenheit[i] + "°F equivale a " + ConvTemp.converta(arrayFahrenheit[i]) + "°C.");
                            }
                            break;

                        case 3:
                            for (int i = 0; i < arrayCelsius.length; i++) {

                                System.out.println("Digite a temperatura em Celsius: ");
                                arrayCelsius[i] = scanner.nextInt();
                                System.out.println("Digite a quantidade do ajuste da temperatura: ");
                                ajuste = scanner.nextDouble();

                                System.out.println(
                                        arrayCelsius[i] + "°C com o ajuste de " + ajuste + "° equivale a " + ConvTemp.converta(arrayCelsius[i], ajuste) + "°F.");
                            }
                            break;

                        default:

                            if (op < 1 || op > 3) {
                                System.out.println("Erro! Opção inválida, tente novamente...");
                                op = scanner.nextInt();
                            }
                            break;
                    }

                    break;

                default:
                    if (op < 1 || op > 5) {
                        System.out.println("Erro! Opção inválida, tente novamente...");
                        op = scanner.nextInt();
                    }
                    break;
            }

        } while (op != 5);

        System.out.println("\nPrograma encerrado com sucesso! Obrigada pela escolha.\n");

        scanner.close();
    }

}
