package Aplicacao.Usuario;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/usuario")
public class UsuarioController {

	@RequestMapping(method = RequestMethod.GET)
	public String listarTodosUsuarios() {
		return "Todos os Usuários";
	}

	@RequestMapping(value="/{identificador}", method = RequestMethod.GET)
	public String obterInformacaoUsuario(@PathVariable String identificador) {
		return "Ola, Meu Amigo Desenrolado que possui o ID = " + identificador;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String criarUsuario(@RequestBody Usuario usuario) {

		try {
			System.out.println(usuario);
			return "Foi criado o usuario " + usuario;

		} catch (Exception e) {
			return "problema";
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public String alterarUsuario(@RequestBody Usuario usuario) {

		try {
			System.out.println(usuario);
			return "Foi alterado o usuario " + usuario;

		} catch (Exception e) {
			return "problema";
		}
	}

	@RequestMapping(value="/{identificador}", method = RequestMethod.DELETE)
	public String excluirUsuarioPorId(@PathVariable String identificador) {
		return "Excluido Usuario que possui o ID = " + identificador;
	}
}