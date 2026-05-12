package util;

import model.*;

import java.util.Random;

public class FakerDados {

    static Random random = new Random();

    static String[] nomes = {
            "Pedro",
            "Lucas",
            "Maria",
            "João",
            "Carlos",
            "Fernanda",
            "Julia",
            "Ricardo",
            "Marcos",
            "Ana"
    };

    static String[] cidades = {
            "Bauru",
            "São Paulo",
            "Campinas",
            "Marília",
            "Lins"
    };

    static String[] estados = {
            "SP",
            "RJ",
            "MG",
            "PR",
            "SC"
    };

    static String[] transportadoras = {
            "Trans BR",
            "Rápido Sul",
            "Carga Express",
            "Log Mais",
            "Brasil Transportes"
    };

    public static NFe gerarNFe(int numero) {

        Cliente cliente = new Cliente(
                nomes[random.nextInt(nomes.length)],
                gerarCpf(),
                cidades[random.nextInt(cidades.length)],
                estados[random.nextInt(estados.length)]
        );

        Fatura fatura = new Fatura(
                String.valueOf(random.nextInt(9999)),
                random.nextDouble() * 5000
        );

        Imposto imposto = new Imposto(
                random.nextDouble() * 20,
                random.nextDouble() * 10
        );

        Transportadora transportadora = new Transportadora(
                transportadoras[random.nextInt(transportadoras.length)],
                gerarPlaca()
        );

        double valorTotal = random.nextDouble() * 10000;

        return new NFe(
                numero,
                cliente,
                fatura,
                imposto,
                transportadora,
                valorTotal
        );
    }

    public static String gerarCpf() {

        return String.valueOf(
                100000000 + random.nextInt(999999999)
        );
    }

    public static String gerarPlaca() {

        char letra1 = (char) ('A' + random.nextInt(26));
        char letra2 = (char) ('A' + random.nextInt(26));
        char letra3 = (char) ('A' + random.nextInt(26));

        int numeros = 1000 + random.nextInt(9000);

        return "" + letra1 + letra2 + letra3 + numeros;
    }
}