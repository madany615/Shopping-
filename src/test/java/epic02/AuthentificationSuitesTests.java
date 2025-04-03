package epic02;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PageLogin;

public class AuthentificationSuitesTests {




@Test
    public void authentification_identifiants_valides(){


        ChromeDriver driver = new ChromeDriver();
    PageLogin pl = new PageLogin(driver);


        driver.get("https://shop-in.ovh/");

        driver.manage().window().maximize();

    pl.login("amira","amirabenahmed01");



    }
}
