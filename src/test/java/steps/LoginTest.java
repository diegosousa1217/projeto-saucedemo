package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navegadores.Navegadores;
import pages.LoginPages;

public class LoginTest {

	/***
	 * Classe de teste da página de login
	 * 
	 * @author diegosousa.adv@hotmail.com
	 */

	LoginPages loP = new LoginPages();

	@Before
	public void incializarTest() {
		Navegadores.iniciarTeste("edge", "https://www.saucedemo.com");
	}

	@After
	public void fecharNavegador() {
		Navegadores.finalizarTest();
	}

	@Given("acesse o site do sauce demo")
	public void acesseOSiteDoSauceDemo() {
		loP.acesseSiteSauceDemo("https://www.saucedemo.com/");

	}

	@When("informo os dados validos")
	public void informoOsDadosValidos() {
		loP.informarDados("standard_user", "secret_sauce");

	}

	@When("e clico no botao login")
	public void eClicoNoBotaoLogin() {
		loP.clicarBotaoLogin();
	}

	@Then("realizo login com sucesso")
	public void realizoLoginComSucesso() {
		loP.realizarLogin("https://www.saucedemo.com/inventory.html");

	}

	@When("informo dados invalidos")
	public void informoDadosInvalidos() {
		loP.informarDados("Jonathan Calleri", "12345678");
	}

	@When("nao informo os dados de acesso")
	public void naoInformoOsDadosDeAcesso() {
		loP.informarDados("", "");
	}

	@When("clico no botao login")
	public void clicoNoBotaoLogin() {
		loP.clicarBotaoLogin();
	}

	@Then("valido mensagens de erro")
	public void validoMensagensDeErro() {
		loP.validoMensagensErro("Epic sadface: Username and password do not match any user in this service");
	}

	@Then("valido mensagens de campos obrigatorios")
	public void validoMensagensDeCamposObrigatorios() {
		loP.validoMensagensErro("Epic sadface: Username is required");
	}

}