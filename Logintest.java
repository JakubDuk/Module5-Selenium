package Module5.Selenium.src;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Logintest {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://192.168.0.105:3001");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.name("login")).sendKeys("devops");
        driver.findElement(By.name("password")).sendKeys("test");
        driver.findElement(By.name("click")).click();
        
        String x = driver.findElement(By.name("test")).getText();;
        System.out.println(x);
        
        driver.quit();

    }

}
