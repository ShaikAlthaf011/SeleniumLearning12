package CodingAssingment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorldCloudTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qawordcloud.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement el1=driver.findElement(By.xpath("/html/body/div/div/div/input"));
        el1.sendKeys("light");
        WebElement el2=driver.findElement(By.xpath("/html/body/div/div/div/button"));
        el2.click();
        WebElement el3=driver.findElement(By.xpath("/html/body/div/div/div/input"));
        el3.sendKeys("flight");
        WebElement el4=driver.findElement(By.xpath("/html/body/div/div/div/button"));
        el2.click();
        driver.quit();
    }
}
