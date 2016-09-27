package Aplicacao.Carro;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/carro")
public class CarroController {

	@RequestMapping(method = RequestMethod.GET)
	public String listarTodosCarros() {
		return "Todos os Carros";
	}

	@RequestMapping(value="/{identificador}", method = RequestMethod.GET)
	public String obterInformacaoCarro(@PathVariable String identificador) {
		return "Carro que possui o ID = " + identificador;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String criarCarro(@RequestBody Carro carro) {

		try {
			System.out.println(carro);
			return "foi persistido o usuario " + carro;

		} catch (Exception e) {
			return "problema";
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public String alterarCarro(@RequestBody Carro carro) {

		try {
			System.out.println(carro);
			return "Foi alterado o Carro " + carro;

		} catch (Exception e) {
			return "problema";
		}
	}

	@RequestMapping(value="/{identificador}", method = RequestMethod.DELETE)
	public String excluirCarroPorId(@PathVariable String identificador) {
		return "Carro que possui o ID = " + identificador;
	}
}
