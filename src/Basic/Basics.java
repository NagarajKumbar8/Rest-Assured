package Basic;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import Files.Reusable_methods;
import Files.payload;

public class Basics {

	//public static void main(String[] args) {
	// TODO Auto-generated method stub

	@Test(groups="smoke")  //E2E APIs
	public void apiTest() {
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		String response= given()  //stored response in string variable
		.log().all()  //input log
		.queryParam("key","qaclick123")  
		.header("Content-Type", "application/json")
		.body(payload.Addplace_Api())
		
		.when()
		.post("/maps/api/place/add/json")
		.then()
		.log().all()  //output log
		.assertThat().statusCode(200) 
		
		.body("scope", equalTo("APP"))				//json body data validation
		.body("status", equalTo("OK"))
		
		.header("Server", "Apache/2.4.52 (Ubuntu)")  //server data validation
		
		.extract().response().asString();
		
		System.out.println(response);
		
		JsonPath js=new JsonPath(response); //for parsing Json response for fetching data or validation 
		String place_id= js.getString("place_id");
		System.out.println(place_id);
		
		//Update place
		
		String newaddress ="marathahalli";
		 given().log().all() .queryParam("key","qaclick123") 
		 .header("Content-Type","application/json") 
		 .body("{\r\n"
		 		+ "\"place_id\": \""+place_id+"\",\r\n"
		 		+ "\"address\": \""+newaddress+"\",\r\n"
		 		+ "\"key\" : \"qaclick123\"\r\n"
		 		+ "}")
		 .log().all()
		 .when().put("maps/api/place/update/json")
		 
		 .then().assertThat().statusCode(200)
		 .body("msg", equalTo("Address successfully updated"));
		 
		
		 
		 //Get Place 
		 
		 String get_placeResponse =   given().log().all()
				 
		 .queryParam("key","qaclick123") 
		 .queryParam("place_id", place_id)
		 .when()
		 .log().all()
		 .get("maps/api/place/get/json")
		 .then().assertThat().statusCode(200)
		 
		 
		 //extract response to sptring and validate uasing Json path
		 
		 .extract().response().asString();
		 
		 System.out.println(get_placeResponse);
		 JsonPath js1= Reusable_methods.rawToJson(get_placeResponse);
		 
		 String actualaddress = js1.getString("address");
		 
		 System.out.println(actualaddress);
		 
		 Assert.assertEquals(newaddress, actualaddress);   //TestNG validation
		
		
		
	}

}
