package Pages;

import Base.BaseLib;
import Base.ElementParams;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Base.ElementParams.*;


public class HomePage extends BaseLib {
    private static WebDriver webDriver;
    ElementParams elementParams = new ElementParams();
    public static void setDriver(WebDriver driver){
        webDriver=driver;
    }

    @When("Username is filled: {string}")
    public HomePage usernameSet(String text){
        webDriver.findElement(By.name("username")).sendKeys(text);

        return this;
    }
    @When("Password is filled: {string}")
    public HomePage passwordSet(String pass){
        webDriver.findElement(By.name("password")).sendKeys(pass);

        return this;
    }
    @When("Click on the login button")
    public HomePage loginClick(){
        webDriver.findElement(By.cssSelector("#loginPanel > form > div:nth-child(5) > input")).click();

        return this;
    }
    @Then("Login Error text check: {string}")
    public HomePage loginErrorTextCheck(String text){
        String loginErrorText = webDriver.findElement(By.cssSelector("#rightPanel > p")).getText();
        Assert.assertEquals(loginErrorText,text);
        Allure.addAttachment(text+ ": error message displayed","#rightPanel > p");

        return this;
    }

    // feature dosyası içinde element gönderme
    @When("{string} click on the element: {string}")
    public HomePage cssSelectorClick(String fieldName , String cssSelectorelement){
        webDriver.findElement(By.cssSelector(cssSelectorelement)).click();
        return this;
    }
    @When("{string} click on the element")
    public HomePage cssSelectorClick(String fieldName){
        webDriver.findElement(By.cssSelector(elementParams.paramsRead(fieldName))).click();
        //webDriver.findElement(By.cssSelector(registerCSS)).click();
        return this;
    }



    @When("{string} Text is entered in the field: {string}")
    public HomePage idFillElement(String fieldName, String text){
        webDriver.findElement(By.id(elementParams.paramsRead(fieldName))).sendKeys(text);
        return this;
    }

    @Then("Successful register text check")
    public HomePage successfulRegisterTextCheck(){
        webDriver.findElement(By.cssSelector(registerSuccessfulText)).getText();
        return this;
    }
    @Then("Successful login text check")
    public HomePage successfulLoginTextCheck(){
        webDriver.findElement(By.cssSelector(loginSuccessfulText)).getText();
        return this;
    }


/* @When("{String} Text is entered in the field: {string}")
    public HomePage idFillElements(String fieldName, String text){
        webDriver.findElement(By.id(registerFirstName)).sendKeys(text);
        return this;
    }*/


   /* public HomePage topPanelCaption(String text){
        String topPanelCaptionCheck = webDriver.findElement(By.className("caption")).getText();
        Assert.assertEquals(topPanelCaptionCheck,text);

        return this;
    }
    public HomePage customerLogin(String text){
        String customerLoginTextCheck = webDriver.findElement(By.cssSelector("#leftPanel > h2")).getText();
        Assert.assertEquals(customerLoginTextCheck,text);

        return this;
    }*/

}
