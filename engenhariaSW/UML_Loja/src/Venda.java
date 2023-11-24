import java.util.List;
import java.util.ArrayList;

public class Venda {
    private List<Cliente> listClientes = new ArrayList<Cliente>();
    private List<Produto> listProdutos = new ArrayList<Produto>();

    public void cadastrarCliente (Cliente cliente){
        listClientes.add(cliente);
        System.out.println("Cliente "+cliente.getNome()+" cadastrado com sucesso!");
        System.out.println("-------------------------------------------+++---");
    }

    public void cadastrarProduto (Produto produto){
        listProdutos.add(produto);
        System.out.println("Produto: "+ produto.getDescricaoProduto() +" cadastrado com sucesso!");
        System.out.println("----------------------------------------------+++");
    }

    public boolean verificarCliente(Cliente cliente){
        for(Cliente clientinho:listClientes){
            if (clientinho.getNome().equals(cliente.getNome()) && clientinho.getCpf().equals(cliente.getCpf())) {
                return true;
            }
        }
        return false;
    }

    public boolean verificarProduto (Produto produto){
        for (Produto produtinho:listProdutos){
            if (produtinho.getDescricaoProduto().equals(produto.getDescricaoProduto())&& produtinho.getIdProduto().equals(produto.getIdProduto())) {
                return true;
            }
        }
        return false;
    }

    public boolean venderProduto(Cliente cliente, Produto produto){
        boolean verificacaoCliente = verificarCliente(cliente);
        boolean verificacaoProduto = verificarProduto(produto);
        if (verificacaoCliente == true && verificacaoProduto == true) {
            System.out.println("Produto vendido!");
            System.out.println("Cliente: "+cliente.getNome());
            System.out.println("CPF: "+cliente.getCpf());
            System.out.println("ID Produti: "+produto.getIdProduto());
            System.out.println("Produto: "+produto.getDescricaoProduto());
            System.out.println("-------------------------------------------------");
            return true;
        }
        else if (verificacaoCliente == false) {
        	System.out.println("ERRO:");
            System.out.println("Por favor, cadastre o cliente para efetivar a compra.");
            System.out.println("----------------------------------------------xxx");
            return false;
        }
        else if (verificacaoProduto == false) {
        	System.out.println("ERRO:");
        	System.out.println("Produto não encontrado, revise o código ou descricao.");
            System.out.println("----------------------------------------------xxx");
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


