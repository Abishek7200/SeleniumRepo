package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumStart {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(5000);
		driver.quit();
	}
}
