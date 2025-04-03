package epic02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePages;

import java.util.List;

public class RechercheMenu {

    ChromeDriver driver = new ChromeDriver();

    HomePages hp = new HomePages(driver);

    @BeforeEach

    public void init (){

        hp.acceder_a_url("https://shop-in.ovh/");

    }

    @Test

public void acces_aux_menus(){

        List<WebElement> menus_elements =driver.findElements(By.xpath("//ul[@id='menu-main-menu']//a[@class='ct-menu-link']"));
//List<WebElement> menus_elements = driver.findElements(By.tagName("a"));


   //la boucle FOR

        for ( WebElement menu_element: menus_elements ){

          String[] tabs ={"BOUTIQUE","CONTACT","BLOG"};

          for (String tab : tabs){


              // On rajoute une condition
              if (menu_element.getText().equals(tab)){

                  menu_element.click();
                  driver.navigate().back();
                  break ;

              }
          }
        }

}




}
