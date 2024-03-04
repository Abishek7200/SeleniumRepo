package week1.day2;

public class Browser {

	private String launchBrowser(String browserName) {
		System.out.println(browserName+" browser launched successfully");
		return browserName;

	}
	
	private void loadUrl() {
		System.out.println("Application url loaded successfully");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser bm = new Browser();
		bm.launchBrowser("Chrome");
		bm.loadUrl();

	}

}
