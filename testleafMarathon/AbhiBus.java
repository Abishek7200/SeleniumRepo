package testleafMarathon;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //global wait for element visible
		driver.get("https://www.abhibus.com/"); //opening url
		Thread.sleep(1000); //waiting for 1 second to see the element
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai"); //selecting the from station
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='container auto-complete-drop-down ']/ul/li[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore"); //selecting the to station
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='container auto-complete-drop-down ']/ul/li[1]")).click();
		driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
		Thread.sleep(1000);
		String firstBus = driver.findElement(By.xpath("(//div[@id='service-cards-container']/div//h5[@class='title'])[1]")).getText();
		System.out.println("Bus name: "+firstBus); // printing the first bus name
		driver.findElement(By.xpath("(//div[@id=\"seat-filter-bus-type\"]/a)[4]")).click();
		String avlSeats = driver.findElement(By.xpath("(//button[text()='Show Seats'])[1]/following-sibling::div")).getText();
		System.out.println(avlSeats); // printing the available seats for the first bus
		driver.findElement(By.xpath("(//button[text()='Show Seats'])[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/button[1]")).click();
		driver.findElement(By.xpath("(//div[@id=\"place-container\"]/div//label)[1]")).click();
		String seatSelected = driver.findElement(By.xpath("//div[@id='seating-selected-seat-details']/span[1]")).getText();
		System.out.println(seatSelected); // printing the seat selected
		String baseFair = driver.findElement(By.xpath("//div[@id=\"seating-selected-seat-details\"]/span[2]")).getText();
		System.out.println(baseFair); // printing the base fair
		String pageTitle = driver.getTitle(); // printing the title of the page 
		System.out.println("Page title: "+pageTitle);
		driver.close(); //closing the browser
	}

}
