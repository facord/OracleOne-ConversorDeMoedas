package br.com.alura.conversorDeMoedas.principal;

import br.com.alura.conversorDeMoedas.modelos.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //print da tela inicial
        String textoInicial = """ 
                *****************************************
                Seja bem-vindo/a ao Conversor de Moeda =] \n
                1) Peso Colombiano =>> Peso Argentino
                2) Peso Argentino =>> Peso Colombiano 
                3) Dólar =>> Real Brasileiro 
                4) Real Brasileiro =>> Dólar 
                5) Boliviano boliviano =>> Peso Chileno
                6) Peso Chileno ==> Boliviano boliviano
                7) Personalizado 
                8) Sair  \n
                Escolha uma opção válida: 
                ***************************************** \n
                """;

        System.out.print(textoInicial);
        try {
            Scanner leitura = new Scanner(System.in);
            int opcao = leitura.nextInt();
            while (opcao != 8) {
                switch (opcao) {
                    case 1:
                        System.out.print("1) Peso Colombiano =>> Peso Argentino \n Digite o valor a ser convertido: ");
                        String moeda_original = "BOB";
                        String moeda_conversao = "ARS";
                        Scanner leituraValor = new Scanner(System.in);
                        double valor = leituraValor.nextInt();
                        ConverterTaxa converterTaxa = new ConverterTaxa();
                        Conversao conversao = converterTaxa.ConversaoMoedas(moeda_original, moeda_conversao, valor);
                        System.out.print("Valor convertido " + conversao.conversion_result() + "\n \n");
                        break;
                    case 2:
                        System.out.print("2) Peso Argentino =>> Peso Colombiano \n Digite o valor a ser convertido: ");
                        String moeda_original2 = "ARS";
                        String moeda_conversao2 = "BOB";
                        Scanner leituraValor2 = new Scanner(System.in);
                        double valor2 = leituraValor2.nextInt();
                        ConverterTaxa converterTaxa2 = new ConverterTaxa();
                        Conversao conversao2 = converterTaxa2.ConversaoMoedas(moeda_original2, moeda_conversao2, valor2);
                        System.out.print("Valor convertido " + conversao2.conversion_result() + "\n \n");
                        break;
                    case 3:
                        System.out.print("3) Dólar =>> Real Brasileiro  \n Digite o valor a ser convertido: ");
                        String moeda_original3 = "USD";
                        String moeda_conversao3 = "BRL";
                        Scanner leituraValor3 = new Scanner(System.in);
                        double valor3 = leituraValor3.nextInt();
                        ConverterTaxa converterTaxa3 = new ConverterTaxa();
                        Conversao conversao3 = converterTaxa3.ConversaoMoedas(moeda_original3, moeda_conversao3, valor3);
                        System.out.print("Valor convertido " + conversao3.conversion_result() + "\n \n");
                        break;
                    case 4:
                        System.out.print("4) Real Brasileiro =>> Dólar \n Digite o valor a ser convertido: ");
                        String moeda_original4 = "BRL";
                        String moeda_conversao4 = "USD";
                        Scanner leituraValor4 = new Scanner(System.in);
                        double valor4 = leituraValor4.nextInt();
                        ConverterTaxa converterTaxa4 = new ConverterTaxa();
                        Conversao conversao4 = converterTaxa4.ConversaoMoedas(moeda_original4, moeda_conversao4, valor4);
                        System.out.print("Valor convertido " + conversao4.conversion_result() + "\n \n");
                        break;
                    case 5:
                        System.out.print("5) Boliviano boliviano =>> Peso Chileno  \n Digite o valor a ser convertido: ");
                        String moeda_original5 = "BOB";
                        String moeda_conversao5 = "CLP";
                        Scanner leituraValor5 = new Scanner(System.in);
                        double valor5 = leituraValor5.nextInt();
                        ConverterTaxa converterTaxa5 = new ConverterTaxa();
                        Conversao conversao5 = converterTaxa5.ConversaoMoedas(moeda_original5, moeda_conversao5, valor5);
                        System.out.print("Valor convertido " + conversao5.conversion_result() + "\n \n");
                        break;
                    case 6:
                        System.out.print("6) Peso Chileno ==> Boliviano boliviano \n Digite o valor a ser convertido: ");
                        String moeda_original6 = "CLP";
                        String moeda_conversao6 = "BOB";
                        Scanner leituraValor6 = new Scanner(System.in);
                        double valor6 = leituraValor6.nextInt();
                        ConverterTaxa converterTaxa6 = new ConverterTaxa();
                        Conversao conversao6 = converterTaxa6.ConversaoMoedas(moeda_original6, moeda_conversao6, valor6);
                        System.out.print("Valor convertido " + conversao6.conversion_result() + "\n \n");
                        break;
                    case 7:
                        String codigoBase, codigoTarget;
                        do {
                            System.out.print("""
                                    7) Personalizado
                                    Opções de código de moedas:  
                                        1) ARS - Peso argentino
                                        2) BOB - Boliviano boliviano
                                        3) BRL - Real brasileiro
                                        4) CLP - Peso chileno
                                        5) COP - Peso colombiano
                                        6) USD - Dólar americano 
                                    Digite o número do código escolhido para a moeda original: 
                                    """);
                            Scanner leituraCodigoOrigem = new Scanner(System.in);
                            int codigoOrigem = leituraCodigoOrigem.nextInt();

                            if (codigoOrigem == 1) {
                                codigoBase = "ARS";
                                break;
                            } else if (codigoOrigem == 2) {
                                codigoBase = "BOB";
                                break;
                            } else if (codigoOrigem == 3) {
                                codigoBase = "BRL";
                                break;
                            } else if (codigoOrigem == 4) {
                                codigoBase = "CLP";
                                break;
                            } else if (codigoOrigem == 5) {
                                codigoBase = "COP";
                                break;
                            } else if (codigoOrigem == 6) {
                                codigoBase = "USD";
                                break;
                            } else {
                                System.out.print("Sua escolha não é válida, tente novamente! \n");
                            }
                        } while (true);

                        do {
                            System.out.print("""
                                    Opções de código de moedas:  
                                        1) ARS - Peso argentino
                                        2) BOB - Boliviano boliviano
                                        3) BRL - Real brasileiro
                                        4) CLP - Peso chileno
                                        5) COP - Peso colombiano
                                        6) USD - Dólar americano 
                                    Digite o número do código escolhido para a moeda final: 
                                    """);
                            Scanner leituraCodigoFinal = new Scanner(System.in);
                            int codigoFinal = leituraCodigoFinal.nextInt();

                            if (codigoFinal == 1) {
                                codigoTarget = "ARS";
                                break;
                            } else if (codigoFinal == 2) {
                                codigoTarget = "BOB";
                                break;
                            } else if (codigoFinal == 3) {
                                codigoTarget = "BRL";
                                break;
                            } else if (codigoFinal == 4) {
                                codigoTarget = "CLP";
                                break;
                            } else if (codigoFinal == 5) {
                                codigoTarget = "COP";
                                break;
                            } else if (codigoFinal == 6) {
                                codigoTarget = "USD";
                                break;
                            } else {
                                System.out.print("Sua escolha não é válida, tente novamente! \n");
                            }
                        } while (true);

                        System.out.print("Digite o valor a ser convertido: ");
                        Scanner leituraValor7 = new Scanner(System.in);
                        double valor7 = leituraValor7.nextInt();
                        ConverterTaxa converterTaxa7 = new ConverterTaxa();
                        Conversao conversao7 = converterTaxa7.ConversaoMoedas(codigoBase, codigoTarget, valor7);
                        System.out.print("Valor convertido " + conversao7.conversion_result() + "\n \n");
                        break;
                    default:
                        System.out.print("Você não escolheu uma opção válida! Tente novamente. \n\n");
                        break;
                }

                System.out.print(textoInicial);
                Scanner leituraNova = new Scanner(System.in);
                opcao = leituraNova.nextInt();
            }
            System.out.print("Você optou por sair do sistema. \n \n");

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Erro! Finalizando a aplicação.");
        }
    }
}