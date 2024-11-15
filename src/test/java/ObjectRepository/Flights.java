package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Flights {

	public Flights(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='tripType']")
	private WebElement Type;
	@FindBy(name="passCount")
	private WebElement Passengers;
	@FindBy(name="fromPort")
	private WebElement DepartingFrom;
	@FindBy(name="fromMonth")
	private WebElement FromMonth;
	@FindBy(name="fromDay")
	private WebElement FromDay;
	@FindBy(name="toPort")
	private WebElement ArrivingIn;
	@FindBy(name="toMonth")
	private WebElement toMonth;
	@FindBy(name="toDay")
	private WebElement toDay;
	@FindBy(xpath="//input[@name='servClass']")
	private WebElement ServiceClass;
	@FindBy(xpath="//select[@name='airline']")
	private WebElement Airline;
	@FindBy(linkText="Flights")
	private WebElement flight;
	@FindBy(name="findFlights")
	private WebElement ContinueButton;
//-------------------------------------------gettermethod--------------------------------------------------------------------------------
	public WebElement getType() {
		return Type;
	}
	public WebElement getPassengers() {
		return Passengers;
	}
	public WebElement getDepartingFrom() {
		return DepartingFrom;
	}
	public WebElement getFromMonth() {
		return FromMonth;
	}
	public WebElement getFromDay() {
		return FromDay;
	}
	public WebElement getArrivingIn() {
		return ArrivingIn;
	}
	public WebElement gettoMonth() {
		return toMonth;
	}
	public WebElement gettoDay() {
		return toDay;
	}
	public WebElement getServiceClass() {
		return ServiceClass;
	}
	public WebElement getAirline() {
		return Airline;
	}
	
//--------------------------------------Methods to input data----------------------------------------------------------------------------------
	public void clickonflightlink() {
		flight.click();
	}
	public void selectType(String type) {
		Type.sendKeys(type);
		}
	public void selectpassengers(String passengers) {
		Select dropdown=new Select(Passengers);
		dropdown.selectByVisibleText(passengers);
	}
	public void selectDepartingFrom(String From) {
		Select fromdropdown=new Select(DepartingFrom);
		fromdropdown.selectByVisibleText(From);
	}
	public void selectDepartingMonth(String Dmonth) {
		Select Departmonth = new Select(FromMonth);
		Departmonth.selectByVisibleText(Dmonth);
	}
	public void selectDepartingDate(String Ddate) {
		Select Departdate = new Select(FromDay);
		Departdate.selectByVisibleText(Ddate);
	}
	public void selectarrivingplace(String Arrivingin) {
		Select arrivingin = new Select(ArrivingIn);
		arrivingin.selectByVisibleText(Arrivingin);
	}
	public void selectarrivingMonth(String Amonth) {
		Select arrivingmonth = new Select(toMonth);
		arrivingmonth.selectByVisibleText(Amonth);
	}
	public void selectArrivingDate(String Adate) {
		Select arrivingdate = new Select(toDay);
		arrivingdate.selectByVisibleText(Adate);
	}
	public void selectServiceClass(String Sclass) {
		ServiceClass.sendKeys(Sclass);
	}
	public void selectAirline(String AirLine) {
		Select airline=new Select(Airline);
		airline.selectByVisibleText(AirLine);
	}
	public void clickoncontinuebutton() {
		ContinueButton.click();
	}
	
}
