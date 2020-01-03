package Test_case;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Utilites.LG_GET;
import Utilites.Test_Base;

public class List_Userr extends Test_Base
{																																					
	@Test
	void get_list_user() throws IOException
	{
			extent.startTest("Tanush API");
			RestAssured.baseURI = "https://reqres.in/";
			RequestSpecification httprequest = RestAssured.given();
			Response response = httprequest.request(Method.GET,"api/users?page=2");
			String str = response.getBody().asString();
			int status_code = response.getStatusCode();
			System.out.println(status_code);
			if (status_code==400) 
			{
				test.log(LogStatus.FAIL, "Test case failed");
			}
			else
			{
				test.log(LogStatus.PASS, "Test case passed");
			}
	}
}
