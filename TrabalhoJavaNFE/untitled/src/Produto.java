public class Produto {

    private int idProduto;
    private String descricao;
    private String cst;
    private double valorUnitario;

    public Produto(int idProduto, String descricao,
                   String cst, double valorUnitario) {
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.cst = cst;
        this.valorUnitario = valorUnitario;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCst() {
        return cst;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }
}