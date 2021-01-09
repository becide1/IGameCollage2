package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Dialog extends Parent{

    WebElement myElement;

    public Dialog() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[text()='Grants'])[2]")
    private WebElement grant;

    @FindBy(xpath = "//a[contains(@title,'Apply For a Scholarship')]")
    private WebElement scholarshipBtn;

    @FindBy(css = "a[id='cn-accept-cookie']")
    private WebElement cookie;

    @FindBy(css = "input[name='your-name']")
    private WebElement name;

    @FindBy(css = "input[name='surname']")
    private WebElement surname;

    @FindBy(css = "input[name='your-email']")
    private WebElement email;

    @FindBy(css = "input[name='country']")
    private WebElement country;

    @FindBy(css = "input[name='state-city']")
    private WebElement city;

    @FindBy(css = "input[name='phone']")
    private WebElement phone;

    @FindBy(css = "select[name='brthday']")
    private WebElement day;

    @FindBy(css = "select[name='brthmonth']")
    private WebElement month;

    @FindBy(css = "select[name='brthyear']")
    private WebElement year;

    @FindBy(css = "select[name='siblings']")
    private WebElement siblings;

    @FindBy(css = "select[name='siblingshave']")
    private WebElement siblingsNum;

    @FindBy(css = "input[name='sibling21old']")
    private WebElement sibling1;

    @FindBy(css = "input[name='sibling22old']")
    private WebElement sibling2;

    @FindBy(css = "select[name='siblingsmany2']")
    private WebElement student;

    @FindBy(css = "select[name='scholarshipwe2']")
    private WebElement scholarship;

    @FindBy(css = "input[name='siblings2name']")
    private WebElement siblingsName;

    @FindBy(css = "input[name='imcome-family']")
    private WebElement income;

    @FindBy(css = "select[name='enrolledschool-select']")
    private WebElement otherSchool;

    @FindBy(css = "input[name='enrolledschool-another']")
    private WebElement otherSchollName;

    @FindBy(css = "input[name='secondary-school']")
    private WebElement secondary;

    @FindBy(css = "select[name='graduatedate']")
    private WebElement graduaDay;

    @FindBy(css = "select[name='datemount']")
    private WebElement graduaMonth;

    @FindBy(css = "select[name='dateyear']")
    private WebElement graduaYear;

    @FindBy(css = "input[name='graduation-score']")
    private WebElement graduaScore;

    @FindBy(css = "input[id='diploma']")
    private WebElement dateiDiploma;

    @FindBy(css = "select[name='contactmethod']")
    private WebElement contact;

    @FindBy(css = "input[name='email']")
    private WebElement email2;

    @FindBy(xpath = "//input[@value='Submit']")
    private WebElement submit;


    public void findElementAndClickFunction(String ElementName) {
        switch (ElementName) {
            case "grant"          : myElement = grant          ; break;
            case "scholarshipBtn" : myElement = scholarshipBtn ; break;
            case "cookie"         : myElement = cookie         ; break;
            case "name"           : myElement = name           ; break;
            case "surname"        : myElement = surname        ; break;
            case "email"          : myElement = email          ; break;
            case "country"        : myElement = country        ; break;
            case "city"           : myElement = city           ; break;
            case "phone"          : myElement = phone          ; break;
            case "submit"         : myElement = submit         ; break;
        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String ElementName, String value){
        switch (ElementName){
            case "name"            : myElement = name           ; break;
            case "surname"         : myElement = surname        ; break;
            case "email"           : myElement = email          ; break;
            case "country"         : myElement = country        ; break;
            case "city"            : myElement = city           ; break;
            case "phone"           : myElement = phone          ; break;
            case "sibling1"        : myElement = sibling1       ; break;
            case "sibling2"        : myElement = sibling2       ; break;
            case "siblingsName"    : myElement = siblingsName   ; break;
            case "income"          : myElement = income         ; break;
            case "otherSchollName" : myElement = otherSchollName; break;
            case "secondary"       : myElement = secondary      ; break;
            case "graduaScore"     : myElement = graduaScore    ; break;
            case "dateiDiploma"    : myElement = dateiDiploma   ; break;
            case "email2"          : myElement = email2         ; break;
        }
        sendKeysFunction(myElement, value);
    }

    public WebElement getselect(String ElementName){
        switch (ElementName){
            case "day"         : return day;
            case "month"       : return month;
            case "year"        : return year;
            case "siblings"    : return siblings;
            case "siblingsNum" : return siblingsNum;
            case "student"     : return student;
            case "scholarship" : return scholarship;
            case "otherSchool" : return otherSchool;
            case "graduaDay"   : return graduaDay;
            case "graduaMonth" : return graduaMonth;
            case "graduaYear"  : return graduaYear;
            case "contact"     : return contact;
        }
        return null;
    }

}
