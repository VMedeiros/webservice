package Aplicacao.Produto;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/produto")
public class ProdutoController {

	@RequestMapping(method = RequestMethod.GET)
	public String listarTodosProdutos() {
		return "Todos os Produtos";
	}

	@RequestMapping(value="/{identificador}", method = RequestMethod.GET)
	public String obterInformacaoProduto(@PathVariable String identificador) {
		return "Produto que possui o ID = " + identificador;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String criarProduto(@RequestBody Produto produto) {

		try {
			System.out.println(produto);
			return "Foi criado o Produto " + produto;

		} catch (Exception e) {
			return "problema";
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public String alterarProduto(@RequestBody Produto produto) {

		try {
			System.out.println(produto);
			return "Foi alterado o Produto " + produto;

		} catch (Exception e) {
			return "problema";
		}
	}

	@RequestMapping(value="/{identificador}", method = RequestMethod.DELETE)
	public String excluirProdutoPorId(@PathVariable String identificador) {
		return "Excluido Produto que possui o ID = " + identificador;
	}
}
