package Test_case;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Utilites.Test_Base;

public class Post_request extends Test_Base
{
	RequestSpecification httpRequest;
	Response response;
	
	@Test
	void post_emp_data() throws IOException
	{
			RestAssured.baseURI = "https://reqres.in/";
			httpRequest = RestAssured.given();
			httpRequest.header("Content-Type","application/json");
			JSONObject requestparams = new JSONObject();
			requestparams.put("name", "Tanush");
			requestparams.put("job", "Dev");
			httpRequest.body(requestparams.toJSONString());
			response = httpRequest.request(Method.POST,"/api/users");
			int status_code = response.statusCode();
			System.out.println(status_code);
			Assert.assertEquals(status_code, 400);
		}
		
		
}
