package CodingAssingment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookStoreTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qabookstorepage.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement el1=driver.findElement(By.xpath("//div[@class='popular-book-short-details-container']/button"));
        el1.click();
        WebElement el2=driver.findElement(By.xpath("//div[@id='sectionWingsOfFireBookDetails']/div/button[1]"));
        el2.click();
        WebElement el3=driver.findElement(By.xpath("//div[@id='sectionBookStoreHome']/div/div[2]/div/button"));
        el3.click();
        WebElement el4=driver.findElement(By.xpath("//div[@id='sectionTheThreeMistakesOfMyLifeBookDetails']/div/button[1]"));
        el4.click();
        WebElement el5=driver.findElement(By.xpath("//*[@id='sectionBookStoreHome']/div/div[3]/div/button"));
        el5.click();
        WebElement el6=driver.findElement(By.xpath("//*[@id='sectionHarryPotterBookDetails']/div/button[1]"));
        el6.click();
       driver.quit();
    }
}
