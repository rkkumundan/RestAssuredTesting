package rest.steps;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class stepdefinations {
	static String URL = "http://api.fixer.io/latest?base=AUD";
	public static Response res = RestAssured.get(URL);
	@Given("^user tries to send a api request$")
	public void user_tries_to_send_a_api_request(){
	    System.out.println("API Testing Intiated");
	}

	@Then("^user should get response type with \"(.*?)\"$")
	public void user_should_get_response_type_with(String arg1){
	   String responsetype = res.getContentType();
	   assertThat(arg1, equalTo(responsetype));
	   
	}

	@Then("^user should get status code as \"(.*?)\"$")
	public void user_should_get_status_code_as(int arg1){
		int statusCode = res.statusCode();
		assertThat(arg1, equalTo(statusCode));
	    
	}


}
