import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class B_Signup {

    private WebDriver driver;
    public B_Signup(WebDriver driver) {
        this.driver = driver;

    }
        public void firstname() {
        WebElement firstname = driver.findElement(By.name("firstname"));

        firstname.sendKeys("Dr");
    }
    public void lastname() {
        WebElement lastname = driver.findElement(By.name("lastname"));

        lastname.sendKeys("No");
    }
    public void phone() {
        WebElement phone = driver.findElement(By.name("phone"));

        phone.sendKeys("666999666");
    }
        public void email() {
            WebElement email = driver.findElement(By.name("email"));
            email.sendKeys("13@go.pl");
            /*for (int i = 10; i < 20; i++) {

                email.sendKeys("1" + i + "@go.pl");
                email.sendKeys(Keys.ENTER);
            }*/
        }
            public void password() {
                WebElement password = driver.findElement(By.name("password"));

                password.sendKeys("123456");
            }
                public void confirmpassword() {
                    WebElement confirmpassword = driver.findElement(By.name("confirmpassword"));

                    confirmpassword.sendKeys("123456");
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    js.executeScript("window.scrollBy(0,250)", "");
                }
                    public void buttonsignup() {
                        WebElement buttonsignup = driver.findElement(By.xpath("//button[@class =('signupbtn btn_full btn btn-success btn-block btn-lg')]"));
                        buttonsignup.click();
                    }

    }
