public class Produto {
    private Integer idProduto;
    private String descricaoProduto;

	public Produto(Integer idProduto, String descricaoProduto) {
		this.idProduto = idProduto;
		this.descricaoProduto = descricaoProduto;
	}

	public String getDescricaoProduto() {
        return descricaoProduto;
    }
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    public Integer getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }
}
