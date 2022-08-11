import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {
    public static WebDriver driver=null;
    public static void main(String[] args) throws Exception
    {
        System.setProperty("webdriver.chrome.driver","\\Downloads\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
        String title= driver.getTitle();
        System.out.println(title);
        driver.findElement(By.name("q")).sendKeys("Testing");
        driver.findElement(By.name("btnK")).click();
        driver.close();

    }
}


