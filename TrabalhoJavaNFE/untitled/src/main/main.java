package main;

import model.*;
import service.NFeService;
import util.FakerDados;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        NFeService service = new NFeService();

        // Gera 10 NF-e automáticas
        for (int i = 1; i <= 10; i++) {

            service.adicionar(FakerDados.gerarNFe(i));
        }

        int opcao;

        do {

            System.out.println("\n===== MENU NF-e =====");
            System.out.println("1 - Incluir NF-e");
            System.out.println("2 - Alterar NF-e");
            System.out.println("3 - Excluir NF-e");
            System.out.println("4 - Consultar NF-e");
            System.out.println("5 - Listar por intervalo");
            System.out.println("6 - Listar todas");
            System.out.println("7 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    try {

                        System.out.print("Número da NF-e: ");
                        int numero = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nome do Cliente: ");
                        String nome = sc.nextLine();

                        Cliente cliente = new Cliente(
                                nome,
                                "00000000000",
                                "Bauru",
                                "SP"
                        );

                        Fatura fatura = new Fatura(
                                "100",
                                1500
                        );

                        Imposto imposto = new Imposto(
                                18,
                                5
                        );

                        Transportadora transportadora =
                                new Transportadora(
                                        "Transportadora BR",
                                        "ABC1234"
                                );

                        NFe nfe = new NFe(
                                numero,
                                cliente,
                                fatura,
                                imposto,
                                transportadora,
                                1500
                        );

                        service.adicionar(nfe);

                    } catch (Exception e) {

                        System.out.println("Erro ao cadastrar NF-e.");
                    }

                    break;

                case 2:

                    try {

                        System.out.print("Digite o número da NF-e: ");
                        int numeroAlterar = sc.nextInt();

                        NFe nfe = service.buscarPorNumero(numeroAlterar);

                        if (nfe != null) {

                            System.out.println("1 - Alterar Cliente");
                            System.out.println("2 - Alterar Fatura");
                            System.out.println("3 - Alterar Imposto");
                            System.out.println("4 - Alterar Transportadora");

                            int alterar = sc.nextInt();
                            sc.nextLine();

                            switch (alterar) {

                                case 1:

                                    System.out.print("Novo nome do cliente: ");
                                    String novoNome = sc.nextLine();

                                    nfe.getCliente().setNome(novoNome);

                                    break;

                                case 2:

                                    System.out.print("Novo valor da fatura: ");
                                    double valor = sc.nextDouble();

                                    nfe.getFatura().setValor(valor);

                                    break;

                                case 3:

                                    System.out.print("Novo ICMS: ");
                                    double icms = sc.nextDouble();

                                    nfe.getImposto().setIcms(icms);

                                    break;

                                case 4:

                                    sc.nextLine();

                                    System.out.print("Nova transportadora: ");
                                    String trans = sc.nextLine();

                                    nfe.getTransportadora().setNome(trans);

                                    break;

                                default:

                                    System.out.println("Opção inválida.");
                            }

                            System.out.println("NF-e alterada com sucesso!");

                        } else {

                            System.out.println("NF-e não encontrada.");
                        }

                    } catch (Exception e) {

                        System.out.println("Erro ao alterar NF-e.");
                    }

                    break;

                case 3:

                    System.out.print("Digite o número da NF-e: ");
                    int excluir = sc.nextInt();

                    service.excluir(excluir);

                    break;

                case 4:

                    System.out.println("\n===== CONSULTAS =====");
                    System.out.println("1 - Buscar por número");
                    System.out.println("2 - Buscar por nome");
                    System.out.println("3 - Buscar por CPF/CNPJ");
                    System.out.println("4 - Buscar por valor");

                    int consulta = sc.nextInt();
                    sc.nextLine();

                    switch (consulta) {

                        case 1:

                            System.out.print("Número da NF-e: ");
                            int buscarNumero = sc.nextInt();

                            NFe encontrada =
                                    service.buscarPorNumero(buscarNumero);

                            if (encontrada != null) {

                                System.out.println(encontrada);

                            } else {

                                System.out.println("NF-e não encontrada.");
                            }

                            break;

                        case 2:

                            System.out.print("Nome do cliente: ");
                            String nomeBusca = sc.nextLine();

                            service.buscarPorNome(nomeBusca);

                            break;

                        case 3:

                            System.out.print("CPF/CNPJ: ");
                            String cpfBusca = sc.nextLine();

                            service.buscarPorCpf(cpfBusca);

                            break;

                        case 4:

                            System.out.print("Valor total: ");
                            double valorBusca = sc.nextDouble();

                            service.buscarPorValor(valorBusca);

                            break;

                        default:

                            System.out.println("Opção inválida.");
                    }

                    break;

                case 5:

                    System.out.print("Número inicial: ");
                    int inicio = sc.nextInt();

                    System.out.print("Número final: ");
                    int fim = sc.nextInt();

                    service.listarIntervalo(inicio, fim);

                    break;

                case 6:

                    service.listar();

                    break;

                case 7:

                    System.out.println("Sistema encerrado.");

                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 7);

        sc.close();
    }
}