package com.tests.easyges.step_definitions;

import com.tests.easyges.actions.SeleniumUtils;
import com.tests.easyges.page_objects.LoginPage;
import com.tests.easyges.utils.ConfigFileReader;
import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Etantdonnéque;
import io.cucumber.java.fr.Quand;
import org.junit.Assert;

public class LoginStepDefinition {

    private final SeleniumUtils seleniumUtils;
	private final ConfigFileReader configFileReader;

	public LoginStepDefinition() {
        LoginPage loginPage = new LoginPage();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
	}

	/* TC_01 */
	@Etantdonnéque("Je suis sur la page de connexion de l'application automationexercise")
	public void iAmOnTheLoginPage() throws InterruptedException {
		seleniumUtils.get(configFileReader.getProperty("home.d"));
		Thread.sleep(3000);
	}
	@Quand("Je saisis une adresse mail {string}")
	public void iFillAUserName(String email) {
		seleniumUtils.writeText(LoginPage.getUsername(), email);
	}

	@Quand("Je saisis un mot de passe {string}")
	public void iFillAPassword(String password) {
		seleniumUtils.writeText(LoginPage.getPasswordField(), password);
	}

	@Quand("Je clique sur le bouton Log in")
	public void iClickOnTheLoginButton() {
		seleniumUtils.click(LoginPage.getBtnLogin());
	}


	@Alors("Je suis redirigé vers la page d'accueil avec existance de mot Logout")
	public void jeSuisRedirigéVersLaPageDAccueilAvecExistanceDeMotLogout() throws InterruptedException {
	Assert.assertTrue("Logout existe dans la page home",LoginPage.getBtnLogout().isDisplayed());
		Thread.sleep(3000);
	}
}
