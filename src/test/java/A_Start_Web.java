import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;


public class A_Start_Web {

    private WebDriver driver;
    @BeforeMethod
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.phptravels.net");
    }
    private void sleep () {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test
            public void A_Start_WeB () {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement myaccount = driver.findElement(By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']/*[@class='btn btn-text-inherit btn-interactive']"));

        webDriverWait.until(ExpectedConditions.visibilityOf(myaccount));
        myaccount.click();


        WebElement signup = driver.findElement(By.linkText("Sign Up"));
        webDriverWait.until(ExpectedConditions.visibilityOf(signup));
        signup.click();
sleep();
        B_Signup Singup = new B_Signup(driver);
        Singup.firstname();
        Singup.lastname();
        Singup.phone();
        Singup.email();
        Singup.password();
        Singup.confirmpassword();
        js.executeScript("window.scrollBy(0,250)", "");

        Singup.buttonsignup();


        js.executeScript("window.scrollBy(0,-450)", "");
        sleep();

        C_Myprofile Myprofile = new C_Myprofile(driver);

        Myprofile.myprofile();
        js.executeScript("window.scrollBy(0,600)", "");
        Myprofile.address1();
        Myprofile.city();
        Myprofile.state();
        Myprofile.zip();
        Myprofile.country();
        sleep();
        Myprofile.selectcountry();
        sleep();
        Myprofile.submit();
        sleep();
    }

    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
    }
};






