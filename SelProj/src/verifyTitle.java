import org.openqa.selenium.chrome.ChromeDriver;

public class verifyTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
String str = driver.getTitle();
System.out.println(str);
String str1 = driver.getCurrentUrl();
System.out.println(str1);
}

}
