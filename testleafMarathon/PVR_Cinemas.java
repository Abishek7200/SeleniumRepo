package testleafMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVR_Cinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //global wait for element visible
		driver.get("https://www.pvrcinemas.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='cities-names'])[6]")).click(); //choosing city
		driver.findElement(By.xpath("//span[@class=\"cinemas-inactive\"]")).click(); //entering cinema section
		driver.findElement(By.xpath("//span[text()=\"Select Cinema\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@aria-label=\"PVR AEROHUB Chennai\"]")).click(); //choosing theater
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//ul[@role=\"listbox\"]/li)[2]")).click(); //choosing date
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//ul[@role=\"listbox\"]/li)[1]")).click(); //choosing movie name
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//ul[@role=\"listbox\"]/li)[1]")).click(); //choosing time
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@aria-label=\"Submit\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"Accept\"]")).click(); //accepting the terms and conditions
		driver.findElement(By.xpath("(//td[@class='seats-col']/span)[52]")).click(); // choosing the seat number
		String movSummary = driver.findElement(By.xpath("//div[@class=\"summary-movies-content\"]")).getText();
		System.out.println("Movie summary: "+movSummary); //printing movie summary
		String grandTotal = driver.findElement(By.xpath("//div[@class=\"grand-prices\"]//h6[1]")).getText();
		System.out.println("Total price: "+grandTotal); //printing ticket price
		driver.close(); //closing the browser
	}

}
