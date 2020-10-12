import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;


public class C_Myprofile {
    private WebDriver driver;
    public C_Myprofile(WebDriver driver) {
        this.driver = driver;

    }


    public void myprofile ()

    {
        //WebElement myprofile = driver.findElement(By.xpath("//*[@class='menu-vertical-01']/li[2]/a/span"));


        WebElement myprofile = driver.findElement(By.xpath("//a[contains(text(), \'My Profile\')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", myprofile);


        //myprofile.click();
    }
public void address1 ()
        {
        WebElement address1 = driver.findElement(By.name("address1"));
        address1.sendKeys("Dworcowa 34/34");
    }
public void city ()
        {
        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("Toruń");
    }

public void state ()
{
    WebElement state = driver.findElement(By.name("state"));
    state.sendKeys("Kujawsko-Pomorskie");
}
    public void zip ()
    {
        WebElement zip = driver.findElement(By.name("zip"));
        zip.sendKeys("87-100");
    }
    public void country ()
    {
        WebElement country = driver.findElement(By.xpath("//span[contains (text(), \"Select Country\")]"));
        country.click();
    }
    public void selectcountry ()
    {
        WebElement selectcountry = driver.findElement(By.xpath("//input[@class ='chosen-search-input']"));
        selectcountry.sendKeys("Poland");
        selectcountry.sendKeys(Keys.ENTER);
       // Select dropdown = new Select(selectcountry);
       // dropdown.selectByVisibleText("Poland");
            }
            public void submit ()
            {
                WebElement submit = driver.findElement(By.xpath("//button[contains (text(), \"Submit\")]"));
                submit.click();
                WebElement element = driver.findElement(By.tagName("header"));

                JavascriptExecutor js = (JavascriptExecutor)driver;
                js.executeScript("arguments[0].scrollIntoView();", element);
            }








}
