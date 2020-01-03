package Get_test_Case;

import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilites.GET;

public class List_User extends GET
{
	
	public static Response req_response;
	@Test
	void List_of_user()
	{
		GET g1 = new GET();
		req_response = g1.get_opertaion("api/users?page=2");
	}	
	
	@Test
	void status_code()
	{
		Assert.assertEquals(req_response.statusCode(), 200);
	}
	
	@Test
	void status_line()
	{
		Assert.assertEquals(req_response.statusLine(), "HTTP/1.1 200 OK");
	}
}
