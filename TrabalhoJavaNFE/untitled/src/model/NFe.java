package model;

public class NFe {

    private int numero;
    private Cliente cliente;
    private Fatura fatura;
    private Imposto imposto;
    private Transportadora transportadora;
    private double valorTotal;

    public NFe(int numero,
               Cliente cliente,
               Fatura fatura,
               Imposto imposto,
               Transportadora transportadora,
               double valorTotal) {

        this.numero = numero;
        this.cliente = cliente;
        this.fatura = fatura;
        this.imposto = imposto;
        this.transportadora = transportadora;
        this.valorTotal = valorTotal;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    public Imposto getImposto() {
        return imposto;
    }

    public void setImposto(Imposto imposto) {
        this.imposto = imposto;
    }

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {

        return "\n===========================" +
                "\nNF-e Nº: " + numero +
                "\n" + cliente +
                "\n" + fatura +
                "\n" + imposto +
                "\n" + transportadora +
                "\nValor Total: R$ " + valorTotal +
                "\n===========================";
    }
}