package model;

public class Cliente {

    private String nome;
    private String cpfCnpj;
    private String cidade;
    private String estado;

    public Cliente(String nome, String cpfCnpj,
                   String cidade, String estado) {

        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                " | CPF/CNPJ: " + cpfCnpj +
                " | Cidade: " + cidade +
                " | Estado: " + estado;
    }
}