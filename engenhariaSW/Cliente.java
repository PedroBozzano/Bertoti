public class Cliente {
    private String nome;
    private Integer cpf;

    public Cliente(String nome, Integer cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	public Integer getCpf() {
        return cpf;
    }
    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
