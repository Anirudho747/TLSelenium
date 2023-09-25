
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgnmnt {

    public static void main(String[] args)
    {
        ChromeDriver driver  = new ChromeDriver();

        driver.get("http://leaftaps.com/opentaps/control/main");

        driver.findElement(By.xpath("//*[contains(@id,'user')]")).sendKeys("DemoSalesManager");
        driver.findElement(By.xpath("//*[contains(@id,'pass')]")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[contains(@value,'Log')]")).click();

        driver.findElement(By.xpath("(//img[contains(@src,'opentaps')])[2]")).click();

        driver.findElement(By.xpath("//a[text()='Leads']")).click();
        driver.findElement(By.xpath("(//div[@class='x-grid3-hd-inner x-grid3-hd-partyId']/following::a[@class='linktext'])[1]")).click();
        driver.findElement(By.xpath("//a[text()='Delete']")).click();

    }
}
