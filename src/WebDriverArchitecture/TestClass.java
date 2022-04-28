package WebDriverArchitecture;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser = "chrome";
		WebDriver driver=null;
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
			
		}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
			
		}
		else if(browser.equals("safari")) {
			driver = new SafariDriver();
			
		}else
			System.out.println("pass correct browser");
		
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		String title = driver.getTitle();
		System.out.println("Page title : "+ title);
		
		String url = driver.getUrl();
		System.out.println("Page url : "+ url);
		
		driver.findElement();
		
		driver.findElements();
		
		driver.sendKeys("sovan.panda@gmail.com");
		driver.sendKeys("111");
		driver.click();
		
		driver.close();

	}

}
