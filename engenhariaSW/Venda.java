import java.util.List;
import java.util.ArrayList;

public class Venda {
    private List<Cliente> listClientes = new ArrayList<Cliente>();
    private List<Produto> listProdutos = new ArrayList<Produto>();

    public void cadastrarCliente (Cliente cliente){
        listClientes.add(cliente);
    }

    public void cadastrarProduto (Produto produto){
        listProdutos.add(produto);
    }

    public boolean verificarCliente(Cliente cliente){
        for(Cliente clientinho:listClientes){
            if (clientinho.getCpf().equals(cliente.getCpf())&&clientinho.getNome().equals(cliente.getNome())) {
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }

    public boolean verificarProduto (Produto produto){
        for (Produto produtinho:listProdutos){
            if (produtinho.getDescricaoProduto().equals(produto.getDescricaoProduto())&& produtinho.getIdProduto().equals(produto.getIdProduto())) {
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }

    public boolean venderProduto(Cliente cliente, Produto produto){
        boolean verificacaoCliente = verificarCliente(cliente);
        boolean verificacaoProduto = verificarProduto(produto);
        if (verificacaoCliente == true && verificacaoProduto == true) {
            System.out.println("Produto vendido!");
            return true;
        }
        else if (verificacaoCliente == false) {
            System.out.println("Por favor, cadastre o cliente para efetivar a compra.");
            return false;
        }
        else if (verificacaoProduto == false) {
            System.out.println("Produto não encontrado, revise o código ou descricao.");
            return false;   
        }
            return false;
        
    }

	public List<Cliente> getListClientes() {
		return listClientes;
	}

	public void setListClientes(List<Cliente> listClientes) {
		this.listClientes = listClientes;
	}

	public List<Produto> getListProdutos() {
		return listProdutos;
	}

	public void setListProdutos(List<Produto> listProdutos) {
		this.listProdutos = listProdutos;
	}
}


