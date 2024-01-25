package CodingAssingment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PodcastTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qapodcastpage.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement el1=driver.findElement(By.xpath("//*[@id='sectionHomePage']/div[2]/div[1]/div[1]/img"));
        el1.click();
        List<WebElement> list1=driver.findElements(By.xpath("//div[@class='podcast-episode-container']"));
        if(list1.size()==4){
            System.out.println("All Four Episodes Found");
        }else{
            System.out.println("Only Episodes Found");
        }
        WebElement el2=driver.findElement(By.xpath("//button[@class='button']"));
        el2.click();
        WebElement el3=driver.findElement(By.xpath("//*[@id='sectionHomePage']/div[2]/div[1]/div[2]/img"));
        el3.click();
        List<WebElement> list2=driver.findElements(By.xpath("//div[@class='podcast-episode-container']"));
      if(list2.size()==4){
          System.out.println("All Four Episodes Found");
      }else{
          System.out.println("Only Episodes Found");
      }
      driver.findElement(By.xpath("//button[@class='button']")).click();
      driver.findElement(By.xpath("//div[@class='podcasts-row d-flex flex-row']/div[1]/img")).click();
      List<WebElement> elementList = driver.findElements(By.xpath("//div[@class='podcast-episode-container']"));
      if(elementList.size()==4){
          System.out.println("All Four Episodes Found");
      }else{
          System.out.println("Only Episodes Found");
      }
      driver.findElement(By.xpath("//button[@class='button']")).click();
      driver.findElement(By.xpath("//div[@class='podcasts-row d-flex flex-row']/div[2]/img")).click();
    List<WebElement> lis=driver.findElements(By.xpath("//div[@class='podcast-episode-container']"));
    if(lis.size()==4){
        System.out.println("All Four Episodes Found");
    }else{
        System.out.println("Only Episodes Found");
    }
    driver.findElement(By.xpath("//button[@class='button']"));
    driver.quit();
    }
}
