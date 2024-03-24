package pages;

import elementos.ElementosLogin;
import metodos.MetodosDeTest;

/***
 * metodos e ações exclusivas da pägina de login
 * 
 * @author diegosousa.adv@hotmail.com
 */
public class LoginPages {

	
	
	/***
	 * metodo para garantir que estamos na página de login do sauce demo
	 * devendo o autor informar a string que espera receber, e demonstre que esteja na página de login.
	 * 
	 * @param urlEsperada
	 */
	public void acesseSiteSauceDemo(String urlEsperada) {
		
		MetodosDeTest.validarUrl(urlEsperada);
	}

	/***
	 * método para preencher os campos e efetuar o login,
	 * devendo o usuário informar as Strings username e password.
	 * 
	 * @param userName
	 * @param password
	 */
	public void informarDados(String userName, String password) {
		MetodosDeTest.preencher(ElementosLogin.userName, userName);
		MetodosDeTest.preencher(ElementosLogin.password, password);
	}

	/***
	 * metódo para clicar no botao de login, o usuário ao utilizar esse método não necessita
	 * passar qualquer paramentro na assinatura do método.
	 */
	public void clicarBotaoLogin() {
		MetodosDeTest.clicar(ElementosLogin.btnLogin);
	}

	/***
	 * método usado para validar que o login foi realizado com sucesso
	 * o usuaário ao utilizar esse metodo deve informar a url do direcionamento 
	 * que garante que o login foi realizado com sucesso.
	 * 
	 * @param urlEsperada
	 */
	public void realizarLogin(String urlEsperada) {
		MetodosDeTest.validarUrl(urlEsperada);

	}
	
	/***
	 * método usado para validar as mensagens de erro ao logar no sistema.
	 * O usuário ao utilizar o método deve informar uma String com a mensagem de erro desejada.
	 * 
	 * @param msgEsperada
	 */
	public void validoMensagensErro(String msgEsperada) {
		MetodosDeTest.validarTexto(ElementosLogin.msgErro, msgEsperada);
	}

}

