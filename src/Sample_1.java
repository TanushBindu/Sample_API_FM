import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.Test;


public class Sample_1 
{
	@Test
	void get_req()
	{
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification http_req = RestAssured.given();
		Response res = http_req.request(Method.GET,"/api/users?page=2");
		int status_code = res.statusCode();
		System.out.println(status_code);
	}
}
