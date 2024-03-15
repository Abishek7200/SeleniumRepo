package testleafMarathon;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //global wait for element visible
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Bags for boys");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=\"left-pane-results-container\"]/div)[1]")).click();
		String result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println(result); //printing number of results
		driver.findElement(By.xpath("(//div[@id=\"brandsRefinements\"]/ul//span/span/li/span/a)[1]")).click();
		driver.findElement(By.xpath("(//div[@id=\"brandsRefinements\"]/ul//span/span/li/span/a)[2]")).click();
		driver.findElement(By.xpath("//span[text()='New Arrivals']/following::span[text()='Last 30 days']")).click();
		String title = driver.findElement(By.xpath("(//div[@data-component-type=\"s-search-result\"]//h2/a)[1]")).getText();
		System.out.println("Title: "+title); //printing first product title
		String disPrice = driver.findElement(By.xpath("(//div[@data-component-type=\"s-search-result\"]//span[@class=\"a-price-whole\"])[1]")).getText();
		System.out.println("Price: "+disPrice); //printing first discount price
		String pageTitle = driver.getTitle();
		System.out.println("Page title: "+pageTitle); //printing page title
		driver.close();
	}

}
