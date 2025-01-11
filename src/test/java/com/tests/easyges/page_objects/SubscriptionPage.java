package com.tests.easyges.page_objects;

import com.tests.easyges.actions.SeleniumUtils;
import com.tests.easyges.base.BasePage;
import com.tests.easyges.hooks.Setup;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SubscriptionPage extends BasePage {

    private static SeleniumUtils seleniumUtils;

    @FindBy(how = How.ID, using = "userNameInput")
    private static WebElement usernameGRPM;

    @FindBy(how = How.ID, using = "passwordInput")
    private static WebElement passwordGRPM;

    @FindBy(how = How.ID, using = "submitButton")
    private static WebElement btnConnexion;

    @FindBy(how = How.ID, using = "onetrust-reject-all-handler")
    private static WebElement rejectCookies;

    @FindBy(how = How.XPATH, using = "//span[@class='icon icon-burger']")
    private static WebElement iconBurger;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Administration IGES']")
    private static WebElement administrationIGES;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Utilisateurs']")
    private static WebElement subMenuUsers;

    @FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'Rechercher')]")
    private static WebElement searchField;

    @FindBy(how = How.NAME, using = "switchUser")
    private static WebElement switchUser;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Réaliser une souscription']")
    private static WebElement performASubscription;

    @FindBy(how = How.ID, using = "CreateSubscriptionStep1_legalIdentifier")
    private static WebElement numSIRET;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Valider']")
    private static WebElement btnValidate;

    @FindBy(how = How.ID, using = "CreateSubscriptionStep1_overallWorkforce")
    private static WebElement totalWorkforce;

    @FindBy(how = How.ID, using = "CreateSubscriptionStep1_employeeNumber")
    private static WebElement employeeNumber;

    @FindBy(how = How.ID, using = "CreateSubscriptionStep1_legalStatusLabel")
    private static WebElement legalForm;

    @FindBy(how = How.ID, using = "CreateSubscriptionStep1_closingMonth")
    private static WebElement closingMonth;

    @FindBy(how = How.ID, using = "CreateSubscriptionStep1_representative_civility")
    private static WebElement civility;

    @FindBy(how = How.ID, using = "CreateSubscriptionStep1_representative_lastname")
    private static WebElement lastname;

    @FindBy(how = How.ID, using = "CreateSubscriptionStep1_representative_firstname")
    private static WebElement firstname;

    @FindBy(how = How.ID, using = "CreateSubscriptionStep1_representative_inChargeOf")
    private static WebElement position;

    @FindBy(how = How.ID, using = "CreateSubscriptionStep1_representative_status")
    private static WebElement status;

    @FindBy(how = How.ID, using = "CreateSubscriptionStep1_representative_phoneNumber")
    private static WebElement phoneNumber;

    @FindBy(how = How.ID, using = "CreateSubscriptionStep1_representative_email")
    private static WebElement email;

    @FindBy(how = How.ID, using = "next-btn")
    private static WebElement nextBtn;

    @FindBy(how = How.XPATH, using = "//label[@for='CreateSubscriptionStep2_giveMandateImmediately_0']//span[@class='custom-control-label'][normalize-space()='Oui']")
    private static WebElement radioOui;

    @FindBy(how = How.ID, using = "CreateSubscriptionStep3_IBAN")
    private static WebElement createIBAN;

    @FindBy(how = How.ID, using = "CreateSubscriptionStep3_BIC")
    private static WebElement createBIC;

    @FindBy(how = How.ID, using = "sign-btn")
    private static WebElement signBtn;

    @FindBy(how = How.XPATH, using = "(//button[normalize-space()='CONTINUER'])[1]")
    private static WebElement btnContinuerUserGuide;

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Je reconnais avoir préalablement reçu, pris connai')]")
    private static WebElement convention;

    @FindBy(how = How.XPATH, using = "//span[@class='ng-binding'][normalize-space()='Continuer']")
    private static WebElement btnContinuerConvention;

    @FindBy(how = How.ID, using = "bottom-valid")
    private static WebElement btnValidPage;

    @FindBy(how = How.XPATH, using = "//span[@class='ng-isolate-scope']")
    private static WebElement clauseCheckbox_0;

    @FindBy(how = How.XPATH, using = "//a[@class='btn btn-std pull-right btnMainAction ng-binding']")
    private static WebElement btnValidDocument;

    @FindBy(how = How.NAME, using = "otp")
    private static WebElement codeOTP;

    @FindBy(how = How.XPATH, using = "//div[@id='bottom-button-single-otp']//a[@class='btn btn-std pull-right btnMainAction ng-binding'][normalize-space()='Signer mon contrat']")
    private static WebElement signContract;

    public SubscriptionPage() {
        super(Setup.getDriver());
        seleniumUtils = new SeleniumUtils();
    }

    public static WebElement getUserNameInput() {
        waitForElementToBeVisible(usernameGRPM);
        return usernameGRPM;
    }

    public static WebElement getPasswordInput() {
        waitForElementToBeVisible(passwordGRPM);
        return passwordGRPM;
    }

    public static WebElement getSubmitButton() {
        waitForElementToBeVisible(btnConnexion);
        return btnConnexion;
    }

    public static WebElement getRejectCookies() {
        waitForElementToBeVisible(rejectCookies);
        return rejectCookies;
    }

    public static WebElement getIconBurger() {
        waitForElementToBeClickable(iconBurger);
        return iconBurger;
    }

    public static WebElement getAdministrationIGES() {
        waitForElementToBeVisible(administrationIGES);
        return administrationIGES;
    }

    public static WebElement getSubMenuUsers() {
        waitForElementToBeVisible(subMenuUsers);
        return subMenuUsers;
    }

    public static WebElement getSearchField() {
        waitForElementToBeVisible(searchField);
        return searchField;
    }

    public static WebElement getSwitchUser() {
        waitForElementToBeVisible(switchUser);
        return switchUser;
    }

    public static WebElement getPerformASubscription() {
        waitForElementToBeVisible(performASubscription);
        return performASubscription;
    }

    public static WebElement getNumSIRET() {
        waitForElementToBeVisible(numSIRET);
        return numSIRET;
    }

    public static WebElement getBtnValidate() throws InterruptedException {
        Thread.sleep(300);
        waitForElementToBeClickable(btnValidate);
        JavascriptExecutor js = (JavascriptExecutor) Setup.getDriver();
        js.executeScript("window.scrollBy(0,1000)");
        return btnValidate;
    }

    public static WebElement getTotalWorkforce() {
        waitForElementToBeClickable(totalWorkforce);
        return totalWorkforce;
    }

    public static WebElement getEmployeeNumber() {
        waitForElementToBeClickable(employeeNumber);
        return employeeNumber;
    }

    public static WebElement getLegalForm() {
        waitForElementToBeClickable(legalForm);
        return legalForm;
    }

    public static WebElement getClosingMonth() {
        waitForElementToBeClickable(closingMonth);
        return closingMonth;
    }

    public static WebElement getCivility() {
        waitForElementToBeClickable(civility);
        return civility;
    }

    public static WebElement getLastname() {
        waitForElementToBeClickable(lastname);
        return lastname;
    }

    public static WebElement getFirstname() {
        waitForElementToBeClickable(firstname);
        return firstname;
    }

    public static WebElement getPosition() {
        waitForElementToBeClickable(position);
        return position;
    }

    public static WebElement getStatus() {
        waitForElementToBeClickable(status);
        return status;
    }

    public static WebElement getPhoneNumber() {
        waitForElementToBeClickable(phoneNumber);
        return phoneNumber;
    }

    public static WebElement getEmail() {
        waitForElementToBeClickable(email);
        return email;
    }

    public static WebElement getNextBtn() {
        waitForElementToBeClickable(nextBtn);
        return nextBtn;
    }

    public static WebElement getRadioOui() throws InterruptedException {
        Thread.sleep(3000);
        waitForElementToBeClickable(radioOui);
        seleniumUtils.scrollDownIntoViewElement(radioOui);
        return radioOui;
    }

    public static WebElement getCreateIBAN() throws InterruptedException {
        Thread.sleep(3000);
        waitForElementToBeClickable(createIBAN);
        seleniumUtils.scrollDownIntoViewElement(createIBAN);
        return createIBAN;
    }

    public static WebElement getCreateBIC() {
        waitForElementToBeClickable(createBIC);
        return createBIC;
    }

    public static WebElement getSignBtn() throws InterruptedException {
        Thread.sleep(3000);
        waitForElementToBeClickable(signBtn);
        seleniumUtils.scrollDownIntoViewElement(signBtn);
        return signBtn;
    }

    public static WebElement getBtnContinuerUserGuide() {
        waitForElementToBeClickable(btnContinuerUserGuide);
        return btnContinuerUserGuide;
    }

    public static WebElement getConvention() {
        waitForElementToBeClickable(convention);
        return convention;
    }

    public static WebElement getBtnContinuerConvention() {
        waitForElementToBeClickable(btnContinuerConvention);
        return btnContinuerConvention;
    }

    public static WebElement getBtnValidPage() throws InterruptedException {
        Thread.sleep(5000);
        waitForElementToBeClickable(btnValidPage);
        Thread.sleep(5000);
        seleniumUtils.scrollDown();
        Thread.sleep(5000);
        seleniumUtils.scrollDownIntoViewElement(btnValidPage);
        return btnValidPage;
    }

    public static WebElement geClauseCheckbox() throws InterruptedException {
        Thread.sleep(5000);
        waitForElementToBeClickable(clauseCheckbox_0);
        seleniumUtils.scrollDownIntoViewElement(clauseCheckbox_0);
        return clauseCheckbox_0;
    }

    public static WebElement getBtnValidDocument() {
        waitForElementToBeClickable(btnValidDocument);
        return btnValidDocument;
    }

    public static WebElement getCodeOTP() {
        waitForElementToBeClickable(codeOTP);
        return codeOTP;
    }

    public static WebElement getBtnSignContract() {
        waitForElementToBeClickable(signContract);
        return signContract;
    }

}
