import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MainTest extends Config {
    @Test
    public void loginCheck() {
        driver.navigate().to("https://easyoffice-frontend-develop.azurewebsites.net");
        WebElement loginInput = driver.findElement(By.xpath("//input[@name='email']"));
        loginInput.click();
        loginInput.sendKeys("m.logornii@easyworx.nl");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vfrcbv1326");
        driver.findElement(By.xpath("//button[@data-cy='submit']")).click();
        driver.findElement(By.xpath("//a[@class='nav-link' and @href='/jobs']"));
    }
}
