package ohrm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OrangeHrm {
	WebDriver driver;
 @Test(priority=1)
 private void loadfunction() throws InterruptedException, AWTException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	 driver.findElement(By.name("username")).sendKeys("Admin");
	 driver.findElement(By.name("password")).sendKeys("admin123");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//span[text()='Admin']")).click();
	 Thread.sleep(2000);
	 WebElement locat = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]"));
	 locat.click();
	
	 WebElement element = driver.findElement(By.xpath("(//div[text()='Admin'])[1]"));
	 Actions actions = new Actions(driver);
	 actions.moveToElement(element).perform();
	 Robot robot = new Robot();
	 for (int i = 0; i < 1; i++) {
		 robot.keyPress(KeyEvent.VK_DOWN);
		 robot.keyRelease(KeyEvent.VK_DOWN);

	}
	 robot.keyPress(KeyEvent.VK_ENTER);
	 robot.keyRelease(KeyEvent.VK_ENTER);
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
 }
 
}
