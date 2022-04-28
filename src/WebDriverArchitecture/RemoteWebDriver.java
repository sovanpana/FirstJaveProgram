package WebDriverArchitecture;

public class RemoteWebDriver implements WebDriver{

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		System.out.println("FF");
		
	}

	@Override
	public void findElements() {
		// TODO Auto-generated method stub
		System.out.println("FFs");
		
	}

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		System.out.println("url");
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "sometitle";
	}

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return "https://www.abc.com";
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("click on element");
		
	}

	@Override
	public void sendKeys(String value) {
		// TODO Auto-generated method stub
		System.out.println("entered value : "+ value);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("close browser");
		
	}

}
