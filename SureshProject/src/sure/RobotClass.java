import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("chettysuresh@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("suresh@12345");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("to")).sendKeys("suresh.jhansi07@gmail.com");
		driver.findElement(By.id(":no")).sendKeys("Test Robot Class of Java");
		driver.findElement(By.xpath("//div[@id=':pb']")).click();
		Thread.sleep(2000);
		Robot r = new Robot();
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection("C:\\Users\\Suresh\\Desktop\\Education Documents\\PAN Card.pdf"), null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.findElement(By.id(":ne")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='gb_Mc gb_jb gb_Eg gb_R']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		driver.close();
		
		
		
	}

}
