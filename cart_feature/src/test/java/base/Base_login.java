package base;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Base_login {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3);
		driver.findElement(By.xpath("//input[@type='text']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@class='KzDlHZ']")).click();
		Thread.sleep(2);
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		for(String win:s) {
			if(!win.equalsIgnoreCase(parent)) {
				driver.switchTo().window(win);
			}
		}
		Thread.sleep(3);
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
		driver.findElement(By.xpath("//button[@class='QqFHMw zA2EfJ _7Pd1Fp']")).click();
		Thread.sleep(3);
		

	}

}
