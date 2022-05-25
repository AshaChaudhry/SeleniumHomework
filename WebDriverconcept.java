package SeleniumSession1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverconcept {
    public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","C:\\Users\\Tej\\IdeaProjects\\software\\driver\\chromedriver.exe ");

        WebDriver driver=new ChromeDriver();
driver.get("https://demo.nopcommerce.com/");
//get page title
        String title= "driver.getTitle()";
        System.out.println(title);

        //expected v actual result
        if(title.equals("nopcommerce demo")){
            System.out.println("correct title");
        }else{
            System.out.println("incorrect title");
        }
//navigation functionality
        driver.navigate().back();
       //Thread.sleep(3000);

        driver.navigate().forward();
       // driver.findElement(By.className("<script src=\"/js/Category.Footer.scripts.js?v=UZujW2XIccH1E1lmuAfBbe_3q5Q\"></script>"));
        //maximise the screen
        driver.manage().window().fullscreen();

        //refresh the page
        driver.navigate().refresh();

        //check url and get url
        String url=driver.getCurrentUrl();
        System.out.println("current url:"+url);

//close the browser
        driver.close();//closes the current session only that tab
       driver.quit();//closes all tabs
    }




}
