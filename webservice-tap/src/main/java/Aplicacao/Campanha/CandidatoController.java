package Aplicacao.Campanha;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/candidato")
public class CandidatoController {

	@RequestMapping(method = RequestMethod.GET)
	public String listarTodosCandidatos() {
		return "Todos os Candidatos";
	}

	@RequestMapping(value="/{identificador}", method = RequestMethod.GET)
	public String obterInformacaoCandidato(@PathVariable String identificador) {
		return "Candidato com o ID = " + identificador;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String criarCandidato(@RequestBody Candidato candidato) {

		try {
			System.out.println(candidato);
			return "foi persistido o Candidato: " + candidato;

		} catch (Exception e) {
			return "problema";
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public String alterarCandidato(@RequestBody Candidato candidato) {

		try {
			System.out.println(candidato);
			return "Foi alterado o Candidato: " + candidato;

		} catch (Exception e) {
			return "problema";
		}
	}

	@RequestMapping(value="/{identificador}", method = RequestMethod.DELETE)
	public String excluirCandidatoPorId(@PathVariable String identificador) {
		return "Candidato que possui o ID = " + identificador;
	}

}
