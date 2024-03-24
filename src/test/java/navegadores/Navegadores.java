package navegadores;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import Drivers.Driver;

public class Navegadores extends Driver{
	
	/***
	 * * Este método inicia o teste com o browser de sua escolha
	 * bastando informar a opção desejada.
	 * 
	 * @author diegosousa.adv@hotmail.com
	 * 
	 * @param browser = chrome, firefox, edge e safari
	 * por default será aberto o browser safari.
	 * @param url = informar o site que deseja acessar.
	 */
	
	public static void iniciarTeste(String browser, String url) {
		
		switch (browser) {
		
		case "chrome":
			
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
			break;
			
		case "firefox":
			
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
			break;
			
		case "edge":
			
			driver = new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
			break;

		default:
			
			driver = new SafariDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
			break;
		}
		
		
	}
	/***
	 * Esre método encerra o navegador aberto
	 * 
	 * @author diegosousa.adv@hotmail.com
	 */
	
	public static void finalizarTest() {
		driver.quit();
	}

}
