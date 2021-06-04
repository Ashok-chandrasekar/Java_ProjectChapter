package askemp.Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ashoktaskday1 {
	
	public static void main(String[] args) {
		
     System.setProperty("webdriver.edge.driver", 
    "C:\\Users\\windows 10 pro\\eclipse-workspace\\Selenium.medge\\drivers1\\msedgedriver.exe");
    
      WebDriver driver = new EdgeDriver ();
      
        driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
      
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//driver.quit();
		
		//WebElement emailname = driver.findElement(By.name("email"));
		//emailname.sendKeys("Ak03@facebook.com");
		
		//WebElement pass = driver.findElement(By.id("pass"));
		//pass.sendKeys("ashokcmr93@gmail.com");
		
		//WebElement btnsign = driver.findElement(By.name("login"));
		//btnsign.click();
		
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("Ako3@facebook.com");
		
		WebElement passenter = driver.findElement(By.xpath("//input[@type='password']"));
		passenter.sendKeys("Achu123");
		
		WebElement button = driver.findElement(By.xpath("//button[@value='1']"));
		button.click();
		
		System.out.println("final result");
		
		
		
	}
	
}
