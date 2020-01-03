package Utilites;

import io.restassured.http.Method;
import io.restassured.response.Response;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GET extends Test_Base
{
	@Test
	public Response get_opertaion(String endpoint)
	{
		Test_Base t1 = new Test_Base();
		t1.set_up();
		Response response = httpRequest.request(Method.GET,endpoint);
		return response;
	}
	
	
}

