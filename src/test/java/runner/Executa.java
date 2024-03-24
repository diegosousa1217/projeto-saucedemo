package runner;

import org.junit.runner.RunWith;

/***
 * classe para definir a execução e planejamento dos testes do cucumber,
 * infomando aqui as opções que serão rodadas com o cucumber.
 * 
 * @author diegosousa.adv@hhotmail.com
 */

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		tags = "@login",
		dryRun = false,
		monochrome = true,
		glue = "steps",
		plugin = {"pretty", "html:target/cucumber-reports.html"},
		snippets = SnippetType.CAMELCASE)
public class Executa {

}
