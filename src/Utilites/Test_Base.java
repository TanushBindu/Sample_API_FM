package Utilites;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class Test_Base 
{
	public static String uri = "https://reqres.in";
	public static RequestSpecification httpRequest;
	public static ExtentReports extent;
	public static ExtentTest test;
	@Test
	void set_up()
	{
		RestAssured.baseURI = "https://reqres.in/";
		httpRequest = RestAssured.given();
	}
}
