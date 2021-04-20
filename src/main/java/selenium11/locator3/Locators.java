package selenium11.locator3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        //driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/nav/div[1]/a")); //Sigh In
        driver.findElement(By.xpath("//nav/div[1]/a[@ class ='login']")); //Sigh In
        //driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div[2]//form/button")); //Search button
        driver.findElement(By.xpath("//button[@name = 'submit_search']")); //Search button
        //driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/ul/li[2]/a")); //Dresses
        driver.findElement(By.xpath("//header/div/div/div/div/ul/li[2]/a[@title = 'Dresses']")); //Dresses
        //driver.findElement(By.xpath("/html/body/div/div/div/div/div/h1/span[1]")); //Search summer
        driver.findElement(By.xpath("//h1/span[contains (text(), 'summer')]")); //Search summer text
        //driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/ul/li[3]/a/i")); //list view
        driver.findElement(By.xpath("//li[3]/a/i[@class = 'icon-th-list']")); //list view
        //driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/form/div/div/select")); //Sort by dropdown
        driver.findElement(By.xpath("//select[@id = 'selectProductSort']")); //Sort by dropdown //div[2]/div/div/form/div/div/select[@id = 'selectProductSort']
        //driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/form/div/div/select/option[5]")); //Product name Z-A
        driver.findElement(By.xpath("//select/option[@value = 'name:desc']")); //Product name Z-A
        //driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li[2]/div/div/div/a[1]/span")); //Add to cart
        driver.findElement(By.xpath("//a[@data-id-product='6']/span")); //Add to cart //li[2]/div/div/div/a[1]/span
        driver.close();
    }
}
