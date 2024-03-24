package metodos;

import static org.junit.Assert.assertEquals;

/***
 * classe  de métodos genéricos de testes.
 * 
 * @author diegosousa.adv@hotmail.com
 */

import org.openqa.selenium.By;

import Drivers.Driver;

public class MetodosDeTest extends Driver{
	
	/***
	 * metodo para preencher um campo, devendo informar na assinatura os parametros
	 * By elemento e uma String texto.
	 * 
	 * @param elemento
	 * @param texto
	 * 
	 * @author diegosousa.adv@hotmail.com
	 */
	public static void preencher(By elemento, String texto) {
		
		driver.findElement(elemento).sendKeys(texto);
	}
	
	/***
	 * método para clicar em um determinado elemento, devendo o usuário informar
	 * o paramentro By elemento.
	 * 
	 * @param elemento
	 */
	public static void clicar(By elemento) {
		
		driver.findElement(elemento).click();
	}
	/***
	 * método para validar um determinado texto que seja apresentado na tela,
	 * devendo o usuário informar o By elemento do texto, e uma String com o texto que espera.
	 * 
	 * @param elemento
	 * @param textoEsperado
	 */
	public static void validarTexto(By elemento, String textoEsperado) {
		
		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoCapturado, textoEsperado);
	}
	/***
	 * metodo para validar uma determinada url, devendo o usuário informar uma String com a url 
	 * que esperar receber.
	 * 
	 * @param UrlEsperada
	 */
	public static void validarUrl(String UrlEsperada) {
		String urlCapturada = driver.getCurrentUrl();
		assertEquals(urlCapturada, UrlEsperada);
	}
}
