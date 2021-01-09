package StepDefinitions;

import Pages.Dialog;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Steps {

    WebDriver driver;
    Dialog dialog = new Dialog();
    Select selects;

    @Given("^Navigate to International Game College$")
    public void navigateToInternationalGameCollege() {

        driver = Driver.getDriver();
        driver.get("https://igamecollege.com/");

    }

    @Then("^Click Grants$")
    public void clickGrants() {

        dialog.findElementAndClickFunction("grant");
    }

    @Then("^Click Apply For a Our Scholarship$")
    public void clickApplyForAOurScholarship() {

        dialog.findElementAndClickFunction("scholarshipBtn");
        dialog.findElementAndClickFunction("cookie");
    }

    @Then("^Write Personal Info$")
    public void writePersonalInfo() {
        dialog.findElementAndClickFunction("name");
        dialog.findElementAndSendKeysFunction("name", "Hans");
        dialog.findElementAndClickFunction("surname");
        dialog.findElementAndSendKeysFunction("surname", " Müller");
        dialog.findElementAndClickFunction("email");
        dialog.findElementAndSendKeysFunction("email", "abc@gmx.de");
        dialog.findElementAndClickFunction("country");
        dialog.findElementAndSendKeysFunction("country", " Germany");
        dialog.findElementAndClickFunction("city");
        dialog.findElementAndSendKeysFunction("city", "Köln");
        dialog.findElementAndClickFunction("phone");
        dialog.findElementAndSendKeysFunction("phone", "0123456789");
        selects = new Select(dialog.getselect("day"));
        selects.selectByVisibleText("2");
        selects = new Select(dialog.getselect("month"));
        selects.selectByVisibleText("2");
        selects = new Select(dialog.getselect("year"));
        selects.selectByVisibleText("2000");


    }

    @Given("^Siblings Info$")
    public void siblingsInfo() {
        selects = new Select(dialog.getselect("siblings"));
        selects.selectByVisibleText("Yes");
        selects = new Select(dialog.getselect("siblingsNum"));
        selects.selectByVisibleText("2");
        dialog.findElementAndSendKeysFunction("sibling1","20");
        dialog.findElementAndSendKeysFunction("sibling2","22");
        selects = new Select(dialog.getselect("student"));
        selects.selectByVisibleText("1");
        selects = new Select(dialog.getselect("scholarship"));
        selects.selectByVisibleText("Yes");
        dialog.findElementAndSendKeysFunction("siblingsName","Ali, Veli, Cetin");
    }

    @Then("^Write Income Info$")
    public void writeIncomeInfo() {

        dialog.findElementAndSendKeysFunction("income","100.000");
    }

    @Then("^School Info$")
    public void schoolInfo() throws InterruptedException {

        selects = new Select(dialog.getselect("otherSchool"));
        selects.selectByVisibleText("Yes");
        dialog.findElementAndSendKeysFunction("otherSchollName", "Diger Lise");
        dialog.findElementAndSendKeysFunction("secondary", "Ortaokul");
        selects= new Select(dialog.getselect("graduaDay"));
        selects.selectByVisibleText("16");
        selects= new Select(dialog.getselect("graduaMonth"));
        selects.selectByVisibleText("6");
        selects= new Select(dialog.getselect("graduaYear"));
        selects.selectByVisibleText("2014");
        dialog.findElementAndSendKeysFunction("graduaScore", "75");
        dialog.findElementAndSendKeysFunction("dateiDiploma", "C:\\Users\\Bekir Canverdi\\Desktop\\IGameCollage\\test.png");
    }

    @Then("^Contact Info$")
    public void contactInfo() throws InterruptedException {

        selects = new Select(dialog.getselect("contact"));
        selects.selectByVisibleText("Email");
        dialog.findElementAndSendKeysFunction("email2", "abc@gmx.de");
        dialog.findElementAndClickFunction("submit");
    }
}
