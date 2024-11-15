package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterandSignin {

	public RegisterandSignin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//a[text()='REGISTER']")
private WebElement registerlink;
@FindBy(name="firstName")
private WebElement fname;
@FindBy(name="lastName")
private WebElement lname;
@FindBy(name="phone")
private WebElement phn;
@FindBy(name="userName")
private WebElement email;
@FindBy(name="address1")
private WebElement address;
@FindBy(name="city")
private WebElement City;
@FindBy(name="state")
private WebElement State;
@FindBy(name="postalCode")
private WebElement Pincode;
@FindBy(name="country")
private WebElement countrydropdown;
@FindBy(xpath="//input[@name='email']")
private WebElement uname;
@FindBy(xpath="//input[@name='password']")
private WebElement pwd;
@FindBy(xpath="//input[@name='confirmPassword']")
private WebElement confirmpwd;
@FindBy(xpath="//input[@name='submit']")
private WebElement submit;
@FindBy(xpath="//td/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td")
private WebElement Success;
@FindBy(linkText = "sign-in")
private WebElement signInLink;
@FindBy(name="userName")
private WebElement UserName;
@FindBy(name="password")
private WebElement Password;
@FindBy(xpath="//input[@type='submit']")
private WebElement Submit;



public WebElement getfirstname() {
	return fname;
}
public WebElement getlastname() {
	return lname;
}
public WebElement getphonenumber() {
	return phn;
}
public WebElement getemailid() {
	return email;
}
public WebElement getaddress() {
	return address;
}
public WebElement getcityname() {
	return City;
}
public WebElement getStatename() {
     return State;
}
public WebElement getpostalcode() {
    return Pincode;
}
public WebElement getusername() {
	return uname;
}
public WebElement getpassword() {
	return pwd;
}
public WebElement getconfirmpassword() {
	return confirmpwd;
}
public WebElement getcountrydropdown() {
	return countrydropdown;
}
public WebElement getsuccessmsg() {
	return Success;
}
public WebElement getUserName() {
	return UserName;
}
public WebElement getPassword() {
	return Password;
}
public void clickonRegister() {
	registerlink.click();
}

public void enterfirstname(String Firstname) {
	fname.sendKeys(Firstname);
}
public void enterlastname(String Lastname) {
	lname.sendKeys(Lastname);
}
public void enterphnnum(String Phonenum) {
	phn.sendKeys(Phonenum);
}
public void enteremail(String Email) {
	email.sendKeys(Email);
}
public void enteraddress(String Address) {
	address.sendKeys(Address);
}
public void entercity(String city) {
	City.sendKeys(city);
}
public void enterstate(String state) {
	State.sendKeys(state);
}
public void enterusername(String username) {
	uname.sendKeys(username);
}
public void enterpassword(String password) {
	pwd.sendKeys(password);
}
public void enterconfirmpassword(String confirmpassword) {
	confirmpwd.sendKeys(confirmpassword);
}
public void enterpostalcode(String Zipcode) {
	Pincode.sendKeys(Zipcode);
}
public void clickSubmitButton() {
	submit.click();
}
public void selectcountry(String country) {
	Select dropdown=new Select(countrydropdown);
	dropdown.selectByVisibleText(country);
}
public String verifySuccessMessage() {
	String msg=Success.getText();
	System.out.println(msg);
	return msg;
}
public void clickonsignInLink() {
	signInLink.click();
}
public void clickonsubmitbutton() {
	Submit.click();
}
public void enterusernamesignon(String username) {
	UserName.sendKeys(username);
}
public void enterpasswordsignon(String password) {
	Password.sendKeys(password);
}
}


