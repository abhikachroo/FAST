package stepDefs;


 
import org.junit.Assert; 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class API {
	
	RequestSpecification request;
	private static Response response;
		
	@Given("Get the user list")
	public void add_post_to_the_list() {
	    request=RestAssured.given();	
	}
	@When("Request is posted")
	public void request_is_posted() {
		response = request.get("http://jsonplaceholder.typicode.com/posts/");	    	
		    	
	}	    
	@Then("Validate response as 200")
	public void validate_response_as_200() {
		Long time = response.
		    	then().
		    	extract().
		    	time();
		    	System.out.println("Response time is : "+ time);
		    	System.out.println(response.getStatusCode());
		        //System.out.println("response : " + response.asPrettyString());
		        Assert.assertEquals(response.getStatusCode(), 200);
	
	}
}
