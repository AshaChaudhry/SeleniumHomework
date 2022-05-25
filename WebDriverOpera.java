package SeleniumSession1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverOpera {
    public static void main(String[] args) {
        System.setProperty("webdriver.opera.driver","C:\\Users\\Tej\\IdeaProjects\\software\\driver\\operadriver.exe");

        WebDriver driver=new OperaDriver();
        driver.get("https://demo.nopcommerce.com/");
       // driver.findElement(By.className("search-box store-search-box"));

        /*try{
            Thread.sleep(3000);
        }catch(Exception e){
            System.out.println("page should pause for 30 seconds");
        }*/
        //driver.navigate().back();
    }
}
