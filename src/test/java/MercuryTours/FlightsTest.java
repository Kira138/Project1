package MercuryTours;

import org.testng.annotations.Test;

import BaseClassTest.BaseClass;
import ObjectRepository.Flights;
import Utilities.ExcelUtil;
import Utilities.FileUtil;
import Utilities.JavaUtil;
import Utilities.WebDriverUtil;

public class FlightsTest extends BaseClass {
	@Test
	public void Flighbooking() throws Throwable {
		ExcelUtil elib=new ExcelUtil();
		FileUtil flib=new FileUtil();
		JavaUtil jlib=new JavaUtil();
		Flights flights=new Flights(driver);
		WebDriverUtil wlib=new WebDriverUtil();
		//--------------------------------------------------------
		String URL = flib.getkeyandvaluepair("url");
		driver.get(URL); 
		//---------------------------------------------------------
		flights.clickonflightlink();
		//---------------------------------------------------------
		String type=elib.getExcelData("Flight", 1, 0);
		System.out.println(type);
		flights.selectType(type);
		//----------------------------------------------------------
		String passengercount=elib.getExcelDataUsingFormatter("Flight", 1, 1);
		System.out.println(passengercount);
		flights.selectpassengers(passengercount);
		//----------------------------------------------------------
		String departfrom=elib.getExcelData("Flight", 1, 2);
		System.out.println(departfrom);
		flights.selectDepartingFrom(departfrom);
		//----------------------------------------------------------
		String departmonth=elib.getExcelData("Flight", 1, 3);
		System.out.println(departmonth);
		flights.selectDepartingMonth(departmonth);
		//------------------------------------------------------------
		String departdate=elib.getExcelDataUsingFormatter("Flight", 1, 4);
		System.out.println(departdate);
		flights.selectDepartingDate(departdate);
		//--------------------------------------------------------------
		String arrivingplace=elib.getExcelData("Flight", 1, 5);
		System.out.println(arrivingplace);
		flights.selectarrivingplace(arrivingplace);
		//--------------------------------------------------------------------
		String arrivalmonth=elib.getExcelData("Flight", 1, 6);
		System.out.println(arrivalmonth);
		flights.selectarrivingMonth(arrivalmonth);
		//------------------------------------------------------------
		String arrivaldate=elib.getExcelDataUsingFormatter("Flight", 1, 7);
		System.out.println(arrivaldate);
		flights.selectArrivingDate(arrivaldate);
		//---------------------------------------------------------------------
		String service=elib.getExcelData("Flight", 1, 8);
		System.out.println(service);
		flights.selectServiceClass(service);
		//------------------------------------------------------------------
		String airline=elib.getExcelData("Flight", 1, 9);
		System.out.println(airline);
		flights.selectAirline(airline);
		//----------------------------------------------------------------------
		flights.clickoncontinuebutton();
		
	}

}
