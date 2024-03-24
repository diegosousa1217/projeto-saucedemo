package elementos;

import org.openqa.selenium.By;

public class ElementosLogin {
	
   /*** Elementos da página de login
    * 
    * @author diegosousa.adv@hotmail.com
    */
  
	
	public static By userName = By.xpath("//input[@id='user-name']");
	public static By password = By.id("password");
	public static By btnLogin = By.id("login-button");
	public static By msgErro = By.xpath("//h3[@data-test='error']");

}
