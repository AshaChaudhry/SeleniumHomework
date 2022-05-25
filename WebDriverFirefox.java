package SeleniumSession1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFirefox {
    public static void main(String[] args) {

System.setProperty("webdriver.gecko.driver","C:\\Users\\Tej\\IdeaProjects\\software\\driver\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
//driver.findElement(By.className("<script src=\"/js/Category.Footer.scripts.js?v=UZujW2XIccH1E1lmuAfBbe_3q5Q\"></script>"));
        //tried to navigate to computer categories but not doing it
//driver.navigate().to("<script src=\"/js/Category.Footer.scripts.js?v=UZujW2XIccH1E1lmuAfBbe_3q5Q\"></script>");

    }
}
