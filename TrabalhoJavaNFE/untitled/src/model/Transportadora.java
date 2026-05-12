package model;

public class Transportadora {

    private String nome;
    private String placa;

    public Transportadora(String nome, String placa) {
        this.nome = nome;
        this.placa = placa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Transportadora: " + nome +
                " | Placa: " + placa;
    }
}