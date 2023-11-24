import static org.junit.Assert.*;
import org.junit.Test;


public class VendaTest {
	Venda venda = new Venda();
	Produto produto = new Produto(null, null);
	Cliente cliente = new Cliente(null,null);
	@Test
	public void test() {
		//Teste 1: Para testar tamanho inicial das listas de produto e cliente igual a 0:
		assertEquals(venda.getListProdutos().size(),0);
		assertEquals(venda.getListClientes().size(),0);
		
		//Cadastro de 1 cliente e 1 produto:
		venda.cadastrarCliente(new Cliente("Pedro",123456789));
		venda.cadastrarProduto(new Produto(1,"Porca"));
		
		//Teste 2: Testar tamanho atual da lista:
		assertEquals(venda.getListClientes().size(),1);
		assertEquals(venda.getListProdutos().size(),1);
		
		//Teste 3: Verificação de cliente:
		assertEquals(venda.verificarCliente(new Cliente("Pedro",123456789)),true);
		assertEquals(venda.verificarCliente(new Cliente("Caio",1526374859)),false);
		
		//Teste 4: Verificação de produto:
		assertEquals(venda.verificarProduto(new Produto(1,"Porca")),true);
		assertEquals(venda.verificarProduto(new Produto(2,"Parafuso")),false);
		
		//Teste 5: Vender produto:
		assertEquals(venda.venderProduto(new Cliente("Pedro",123456789),new Produto(1,"Porca")),true);
		assertEquals(venda.venderProduto(new Cliente("Pedro",123456789),new Produto(2,"Porco")),false);
		assertEquals(venda.venderProduto(new Cliente("Caio",1526374859),new Produto(1,"Porca")),false);

		//Teste 6: Cadastrar mais clientes:
		venda.cadastrarCliente(new Cliente("Paulo",1112223334));
		venda.cadastrarCliente(new Cliente("Ana",1112223335));
		venda.cadastrarCliente(new Cliente("Gabriel",1112223336));
		
		//Teste 7: Cadastrar mais produtos:
		venda.cadastrarProduto(new Produto(2,"Parafuso"));
		venda.cadastrarProduto(new Produto(3,"Prego"));;
		venda.cadastrarProduto(new Produto(4,"Arruela"));
		
		//Teste 8: Conferir tamanhos de listas:
		assertEquals(venda.getListClientes().size(),4);
		assertEquals(venda.getListProdutos().size(),4);
		
		//Teste 9: Verificar todos cadastros feitos:
		//Clientes: 
		assertEquals(venda.verificarCliente(new Cliente("Paulo",1112223334)),true);
		assertEquals(venda.verificarCliente(new Cliente("Ana",1112223335)),true);
		assertEquals(venda.verificarCliente(new Cliente("Gabriel",1112223336)),true);
		assertEquals(venda.verificarCliente(new Cliente("Ana",1112223336)),false);		
		//Produtos: 
		assertEquals(venda.verificarProduto(new Produto(2,"Parafuso")),true);
		assertEquals(venda.verificarProduto(new Produto(3,"Prego")),true);
		assertEquals(venda.verificarProduto(new Produto(4,"Arruela")),true);
		assertEquals(venda.verificarProduto(new Produto(2,"Arruela")),false);
		
		//Teste 10: Vender todos produtos:
		assertEquals(venda.venderProduto(new Cliente("Paulo",1112223334),new Produto(2,"Parafuso")),true);
		assertEquals(venda.venderProduto(new Cliente("Ana",1112223335),new Produto(3,"Prego")),true);
		assertEquals(venda.venderProduto(new Cliente("Gabriel",1112223336),new Produto(4,"Arruela")),true);
		assertEquals(venda.venderProduto(new Cliente("Paulo",1112223335),new Produto(4,"Parafuso")),false);
		assertEquals(venda.venderProduto(new Cliente("Gabriel",1112223335),new Produto(3,"Prego")),false);
		assertEquals(venda.venderProduto(new Cliente("Gabriel",1112223336),new Produto(5,"Arruela")),false);
	}

}
