package SeleniumSession1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverEdge {
    public static void main(String[] args) {


        System.setProperty("webdriver.edge.driver","C:\\Users\\Tej\\IdeaProjects\\software\\driver\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
driver.findElement(By.className("ico-register")).click();
driver.navigate().back();

       // driver.navigate().forward();
    }
}
