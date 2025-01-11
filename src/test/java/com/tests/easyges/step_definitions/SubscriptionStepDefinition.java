package com.tests.easyges.step_definitions;

import com.tests.easyges.actions.SelectFromListUtils;
import com.tests.easyges.actions.SeleniumUtils;
import com.tests.easyges.page_objects.SubscriptionPage;
import com.tests.easyges.utils.ConfigFileReader;
import com.tests.easyges.utils.GetMyOTPHelper;
import io.cucumber.java.fr.Etantdonnéque;
import io.cucumber.java.fr.Quand;

public class SubscriptionStepDefinition {

    private final SubscriptionPage subscriptionPage;
    private final SeleniumUtils seleniumUtils;
    private final ConfigFileReader configFileReader;
    private final SelectFromListUtils selectFromListUtils;

    public SubscriptionStepDefinition() {
        seleniumUtils = new SeleniumUtils();
        configFileReader = new ConfigFileReader();
        subscriptionPage = new SubscriptionPage();
        selectFromListUtils = new SelectFromListUtils();
    }

    @Etantdonnéque("Je suis sur la page de l'application Gessousl")
    public void iAmOnThePageGessousl() throws InterruptedException {
        seleniumUtils.get(configFileReader.getProperty("gessousl.d"));
        Thread.sleep(5000);
    }

    @Quand("Je saisis une adresse mail groupama {string}")
    public void iFillAddressMail(String email) {
        seleniumUtils.writeText(SubscriptionPage.getUserNameInput(), email);
    }
    @Quand("Je saisis un mot de passe groupama {string}")
    public void iFillAPassword(String password) {
        seleniumUtils.writeText(SubscriptionPage.getPasswordInput(), password);
    }
    @Quand("Je clique sur le bouton Connexion")
    public void iClicOnBtnConnexion() {
        seleniumUtils.click(SubscriptionPage.getSubmitButton());
    }
    @Quand("Je continue sans accepter les cookies")
    public void jeContinueSansAccepterLesCookies() {
        seleniumUtils.click(SubscriptionPage.getRejectCookies());
    }

    @Quand("Je clique sur le menu burger")
    public void jiClicOnMenuBurger() {
        seleniumUtils.click(SubscriptionPage.getIconBurger());
    }
    @Quand("Je clique sur Administration IGES")
    public void iClicOnAdministrationIGES() {
        seleniumUtils.click(SubscriptionPage.getAdministrationIGES());
    }
    @Quand("Je clique sur Utilisateurs")
    public void iClicOnUsers() {
        seleniumUtils.click(SubscriptionPage.getSubMenuUsers());
    }

    @Quand("Je saisis un nom d'utilisateur {string}")
    public void iSearchForUserName(String name) {
        seleniumUtils.writeText(SubscriptionPage.getSearchField(), name);
        seleniumUtils.enterKeyboard(SubscriptionPage.getSearchField());
    }

    @Quand("Je clique sur voir la vue")
    public void iClicOnSwitchUser() {
        seleniumUtils.click(SubscriptionPage.getSwitchUser());
    }

    @Quand("Je clique sur Réaliser une souscription")
    public void iClicOnPerformASubscription() {
        seleniumUtils.scrollDown();
        seleniumUtils.click(SubscriptionPage.getPerformASubscription());
    }

    @Quand("Je saisis un numero de SIRET Entreprise {string}")
    public void iFillNumSIRET(String numSIRET) {
        seleniumUtils.writeText(SubscriptionPage.getNumSIRET(), numSIRET);
    }

    @Quand("Je clique sur le bouton Valider")
    public void iClicOnBtnValidate() throws InterruptedException {
        seleniumUtils.click(SubscriptionPage.getBtnValidate());
    }

    @Quand("Je remplis le formulaire Entreprise Effectif global {string} Nombre de salariés {string} Forme Juridique {string} Mois de clôture {string} Civilité {string} Nom {string} Prénom {string} Fonction {string} Statut {string} Téléphone {string} Email {string}")
    public void iFillOutTheCompanyForm(String totalWorkforce, String employeeNumber, String legalForm, String closingMonth, String civility, String lastname, String firstname, String position, String status, String phoneNumber, String email) {
        seleniumUtils.writeText(SubscriptionPage.getTotalWorkforce(), totalWorkforce);
        seleniumUtils.writeText(SubscriptionPage.getEmployeeNumber(), employeeNumber);
        selectFromListUtils.selectDropDownListByVisibleText(SubscriptionPage.getLegalForm(), legalForm);
        selectFromListUtils.selectDropDownListByVisibleText(SubscriptionPage.getClosingMonth(), closingMonth);
        selectFromListUtils.selectDropDownListByVisibleText(SubscriptionPage.getCivility(), civility);
        seleniumUtils.writeText(SubscriptionPage.getLastname(), lastname);
        seleniumUtils.writeText(SubscriptionPage.getFirstname(), firstname);
        selectFromListUtils.selectDropDownListByVisibleText(SubscriptionPage.getPosition(), position);
        selectFromListUtils.selectDropDownListByVisibleText(SubscriptionPage.getStatus(), status);
        seleniumUtils.writeText(SubscriptionPage.getPhoneNumber(), phoneNumber);
        seleniumUtils.writeText(SubscriptionPage.getEmail(), email);
    }

    @Quand("Je clique sur le bouton Continuer")
    public void iClicOnContinuer() {
        seleniumUtils.scrollDown();
        seleniumUtils.click(SubscriptionPage.getNextBtn());
    }

    @Quand("Je clique Oui sur Accompagnement à la réalisation d’un versement collectif")
    public void iClicRadioYes() throws InterruptedException {
        seleniumUtils.click(SubscriptionPage.getRadioOui());
    }

    @Quand("Je saisis un IBAN {string} et un BIC {string}")
    public void iFillIBANAndBIC(String iban, String bic) throws InterruptedException {
        seleniumUtils.writeText(SubscriptionPage.getCreateIBAN(), iban);
        seleniumUtils.writeText(SubscriptionPage.getCreateBIC(), bic);
    }

    @Quand("Je clique sur Valider et signer tout de suite")
    public void iClicOnValidateAndSign() throws InterruptedException {
        seleniumUtils.click(SubscriptionPage.getSignBtn());
    }

    @Quand("Je clique sur le button Continuer de la page mode d'emploi")
    public void iClicOnUserGuide(){
        seleniumUtils.click(SubscriptionPage.getBtnContinuerUserGuide());
    }

    @Quand("Je j'accepte la convention de preuve")
    public void iClicOnContinuerConvention(){
        seleniumUtils.click(SubscriptionPage.getConvention());
        seleniumUtils.click(SubscriptionPage.getBtnContinuerConvention());
    }

    @Quand("Je valide la page")
    public void iValidPage() throws InterruptedException {
        seleniumUtils.click(SubscriptionPage.getBtnValidPage());
    }

    @Quand("J'accepte les documents contractuels")
    public void iAcceptTheDocuments() throws InterruptedException {
        seleniumUtils.scrollDown();
        seleniumUtils.click(SubscriptionPage.geClauseCheckbox());
        seleniumUtils.click(SubscriptionPage.getBtnValidDocument());
    }

    @Quand("Je signe mon contrat")
    public void iSignMyContract() {
        GetMyOTPHelper otpAutomation = new GetMyOTPHelper();
        String otpCode = otpAutomation.retrieveOTPCode();
        seleniumUtils.writeText(SubscriptionPage.getCodeOTP(), otpCode);
       // seleniumUtils.click(SubscriptionPage.getBtnSignContract());
    }
}
