package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLogin {


    ChromeDriver driver;

    public PageLogin (ChromeDriver driver){


        this.driver=driver;



    }

    public void login(String username, String password){

        driver.findElement(By.xpath("//a[@class='ct-account-item']")).click();
        driver.findElement(By.id("username")).sendKeys("amira");
        driver.findElement(By.id("password")).sendKeys("amirabenahmed01"+ Keys.ENTER);

    }

}
