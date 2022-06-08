import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SecondTest extends Config {

    @Test
    public void createAssignment() throws InterruptedException {
        driver.navigate().to("https://easyoffice-frontend-develop.azurewebsites.net");
        WebElement loginInput = driver.findElement(By.xpath("//input[@name='email']"));
        loginInput.click();
        loginInput.sendKeys("m.logornii@easyworx.nl");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vfrcbv1326");
        driver.findElement(By.xpath("//button[@data-cy='submit']")).click();
        driver.findElement(By.xpath("//a[@href='/jobs']")).click();
        driver.findElement(By.xpath("//a[@href='/jobs/create']")).click();
        driver.findElement(By.xpath("//label[@for='hirer']/following-sibling::div")).click();
        driver.findElement(By.xpath("//div[@data-cy='hirer']//input[@id]")).sendKeys("ruf12");
        driver.findElement(By.xpath("//div[contains(@class, 'react-select__option')][text()='ruf12']")).click();
        driver.findElement(By.xpath("//label[@for='worker']/following-sibling::div")).click();
        driver.findElement(By.xpath("//div[@data-cy='worker']//input[@id]")).sendKeys("ruf1");
        driver.findElement(By.xpath("//div[contains(@class, 'react-select__option')][text()='R.U.F.1. Ruf1']")).click();
        driver.findElement(By.xpath("//label[@for='sectorId']/following-sibling::div")).click();
        driver.findElement(By.xpath("//div[contains(@class, 'react-select__option')][text()='Technisch']")).click();
        driver.findElement(By.xpath("//label[@for='caocodeId']/following-sibling::div")).click();
        driver.findElement(By.xpath("//div[@data-cy='caocodeId']//input[@id]")).sendKeys("Besloten busvervoer");
        driver.findElement(By.xpath("//div[contains(@class, 'react-select__option')][text()='Besloten busvervoer']")).click();
        driver.findElement(By.xpath("//label[@for='functionDescription']/following-sibling::div")).click();
        driver.findElement(By.xpath("//div[contains(@class, 'react-select__option')][text()='- Schaal I']")).click();
        driver.findElement(By.xpath("//label[@for='assignmentNiveauId']/following-sibling::div")).click();
        driver.findElement(By.xpath("//div[contains(@class, 'react-select__option')][text()='I']")).click();
        driver.findElement(By.xpath("//input[@name='monthsOfExperience.years']")).sendKeys("11");
        driver.findElement(By.xpath("//input[@name='monthsOfExperience.months']")).sendKeys("11");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//textarea[@name='workDescription']")).sendKeys("This is test description");
        driver.findElement(By.xpath("//textarea[@name='eformRemark']")).sendKeys("This is test description");
        driver.findElement(By.xpath("//input[@name='relevantCertificates']")).click();
        driver.findElement(By.xpath("//textarea[@name='relevantCertificatesRemark']")).sendKeys("This is test description");
        driver.findElement(By.xpath("//input[@name='followingCourse']")).click();
        driver.findElement(By.xpath("//textarea[@name='followingCourseRemark']")).sendKeys("This is test description");
        driver.findElement(By.xpath("//input[@name='purchaseGuarantee']")).click();
        driver.findElement(By.xpath("//input[@name='hasExtraTerritorialRegulation']")).click();
        driver.findElement(By.xpath("//input[@name='isConstruction']")).click();
        driver.findElement(By.xpath("//label[@for='costCenter']/following-sibling::div")).click();
        driver.findElement(By.xpath("//div[contains(@class, 'react-select__option')][text()='N.v.t.']")).click();
        driver.findElement(By.xpath("//label[@for='contractTypeId']/following-sibling::div")).click();
        driver.findElement(By.xpath("//div[contains(@class, 'react-select__option')][text()='Fase A met uitzendbeding 26-06-2023']")).click();
        driver.findElement(By.xpath("//button[@data-cy='wizard-next-step']")).click();
        driver.findElement(By.xpath("//input[@data-cy='VariableHours-true']")).click();
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("11");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@data-cy='wizard-next-step']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[@for='flexassignmentcompensation[0].componentUnitTypeId']/following-sibling::div")).click();
        driver.findElement(By.xpath("//div[contains(@class, 'react-select__option')][text()='Km']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@data-cy='btn-remove-flexassignmentcompensation-1']")).click();
        driver.findElement(By.xpath("//input[@data-cy='flexassignmentcompensation[0].Wage']")).sendKeys("15");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@data-cy='wizard-next-step']")).click();
        driver.findElement(By.xpath("//button[@data-cy='wizard-next-step']")).click();
        Thread.sleep(3000);
        WebElement browse = driver.findElement(By.xpath("//input[@id='privateLeaseCarFileId']"));
        //click on ‘Choose file’ to upload the desired file
        browse.sendKeys("C://Max//test.png");
        Thread.sleep(3000);
        WebElement upload = driver.findElement(By.xpath("//input[@id='trainingAgreementFileId']"));
        upload.sendKeys("C://Max//test.png");
        driver.findElement(By.xpath("//button[@data-cy='wizard-next-step']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@data-cy='wizard-submit']")).click();
        //git test


    }

}
