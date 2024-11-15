package MercuryTours;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClassTest.BaseClass;
import ObjectRepository.RegisterandSignin;
import Utilities.ExcelUtil;
import Utilities.FileUtil;
import Utilities.JavaUtil;
import Utilities.WebDriverUtil;


public class RegisterandSigninTest extends BaseClass  {
	
	@Test
	public void registerandsigninTest() throws Throwable {

		FileUtil flib = new FileUtil();
		WebDriverUtil wlib = new WebDriverUtil();
		ExcelUtil elib = new ExcelUtil();
		JavaUtil jlib=new JavaUtil();
		//-------------------------------------------------------------------
		int ranNum=jlib.getrandomnum();
		
	    //-------------------------------------------------------------------
		String URL = flib.getkeyandvaluepair("url");
		driver.get(URL); 
		//--------------------------------------------------------------------
		RegisterandSignin registerandsignin=new RegisterandSignin(driver);
		registerandsignin.clickonRegister();
		//-------------------------------------------------------------------
		String firstname=elib.getExcelData("Register", 1, 0)+ranNum;
		System.out.println(firstname);
		registerandsignin.enterfirstname(firstname);
		//--------------------------------------------------------------------
		String lastname=elib.getExcelData("Register", 1, 1)+ranNum;
		System.out.println(lastname);
		registerandsignin.enterlastname(lastname);
		//---------------------------------------------------------------------
		String phone=elib.getExcelDataUsingFormatter("Register", 1, 2);
		System.out.println(phone);
		registerandsignin.enterphnnum(phone);
		//---------------------------------------------------------------------
		String email=elib.getExcelDataUsingFormatter("Register", 1, 3)+ranNum;
		registerandsignin.enteremail(email);
		//-------------------------------------------------------------------------
		String addr=elib.getExcelData("Register", 1, 4);
		registerandsignin.enteraddress(addr);
		//------------------------------------------------------------------------
		String cty=elib.getExcelData("Register", 1, 5);
		registerandsignin.entercity(cty);
		//--------------------------------------------------------------------------
		String ste=elib.getExcelData("Register", 1, 6);
		registerandsignin.enterstate(ste);
		//---------------------------------------------------------------------------
		String pin=elib.getExcelDataUsingFormatter("Register", 1, 7);
		registerandsignin.enterpostalcode(pin);
		//----------------------------------------------------------------------------
		String country=elib.getExcelData("Register", 1, 8);
		registerandsignin.selectcountry(country);
		//----------------------------------------------------------------------------
		String usern=elib.getExcelData("Register", 1, 9)+ranNum;
		registerandsignin.enterusername(usern);
		//--------------------------------------------------------------------------
	    String passw=elib.getExcelDataUsingFormatter("Register", 1, 10)+ranNum;
	    registerandsignin.enterpassword(passw);
	    //-----------------------------------------------------------------------------
		String cpassw=elib.getExcelDataUsingFormatter("Register", 1, 11)+ranNum;
		registerandsignin.enterconfirmpassword(cpassw);
		//------------------------------------------------------------------------------
		registerandsignin.clickSubmitButton();
		//-----------------------------------------------------------------------------
		  String actualMessage = registerandsignin.verifySuccessMessage();
	        String expectedMessage = String.format(
	            "Dear %s %s,\nThank you for registering. You may now sign-in using the user name and password you've just entered.\nNote: Your user name is %s.",
	            firstname, lastname, usern
	        );
	        System.out.println("Actual Message: " + actualMessage);
	        System.out.println("Expected Message: " + expectedMessage);

	        Assert.assertTrue(actualMessage.equalsIgnoreCase(expectedMessage), "Success message does not match.");
	        
	//---------------------------------SignOn--------------------------------------------------------------
	        registerandsignin.clickonsignInLink();
	        //--------------------------------------------------------------------------------------------
	        registerandsignin.enterusernamesignon(usern);
	        //---------------------------------------------------------------------------------------------
	        registerandsignin.enterpasswordsignon(passw);
	        //---------------------------------------------------------------------------------------------
	        registerandsignin.clickonsubmitbutton();
		
		
		
}
}
