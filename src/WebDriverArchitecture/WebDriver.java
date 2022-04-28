package WebDriverArchitecture;

public interface WebDriver extends SearchContext{
	
	@Override
	public void findElement();
	
	@Override
	public void findElements();
	
	//own individual method
	public void get(String url);
	
	public String getTitle();
	
	public String getUrl();
	
	public void click();
	
	public void sendKeys(String value);
	
	public void close();

}
