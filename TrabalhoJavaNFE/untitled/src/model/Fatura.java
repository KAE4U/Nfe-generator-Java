package model;

public class Fatura {

    private String numero;
    private double valor;

    public Fatura(String numero, double valor) {
        this.numero = numero;
        this.valor = valor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Fatura Nº: " + numero +
                " | Valor: R$ " + valor;
    }
}