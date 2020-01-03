package Test_case;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;

import org.testng.annotations.Test;

public class A 
{
	@Test
	void get_list_user_1()
	{
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification httpreq = RestAssured.given();
		Response res = httpreq.request(Method.GET,"/api/users?page=2");
		String str = res.asString();
		int status_code = res.statusCode();
		System.out.println(status_code);
	}
}
