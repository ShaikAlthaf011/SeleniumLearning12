package CodingAssingment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationFormTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaregform.ccbp.tech");
        driver.manage().window().maximize();
        WebElement el1=driver.findElement(By.xpath("//input[@id='firstName']"));
        el1.sendKeys("John");
        WebElement el2=driver.findElement(By.xpath("//input[@id='lastName']"));
        el2.sendKeys("Deo");
        WebElement el3=driver.findElement(By.xpath("//button[@type='submit']"));
        el3.submit();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='view-container']/p")));
        WebElement el4=driver.findElement(By.xpath("//div[@class='view-container']/p"));
        String str1=el4.getText();
        String Str2="Submitted Successfully";
        if(str1.equals(Str2)){
            System.out.println("Registration Successful");
        }
        WebElement el5=driver.findElement(By.xpath("//button[@type='button']"));
        el5.click();
        driver.quit();
    }
}
