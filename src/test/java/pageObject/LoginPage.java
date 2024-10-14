package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class LoginPage extends BaseClass{

	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//div[@data-testid='login-cta']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement emailCheckbox;
	
	@FindBy(xpath="//div[contains(text(),'Hi Vaishali')]")
	private WebElement loginText;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1niwhzg r-1p0dtai r-1d2f490 r-1udh08x r-u8s1d r-zchlnj r-ipm5af'])[5]")
	private WebElement loginLink;
	
	@FindBy(xpath="//div[contains(text(),'Please enter a valid email address')]")
	private WebElement loginErrortext;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String loginText() {
		return loginText.getText();
		
	}
	
	public String loginErrortext() {
		return loginErrortext.getText();
		
	}
	
	public void login() throws Exception {
		wait(loginLink);	
		loginLink.click();
		emailCheckbox.click();
		email.sendKeys(readProperty("email"));
		password.sendKeys(readProperty("password"));
		loginBtn.click();
	}
	
	public void loginInvalid() throws Exception {
		wait(loginLink);	
		loginLink.click();
		emailCheckbox.click();
		email.sendKeys("abcd");
		password.sendKeys(readProperty("password"));
		loginBtn.click();
	}
}
