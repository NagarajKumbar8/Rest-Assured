package Basic;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Api_Test_with_Json_file {

	@BeforeTest
	public void Api_External_file() throws IOException {
		
	
	RestAssured.baseURI="https://rahulshettyacademy.com";
	
	String response= given()  //stored response in string variable
	.log().all()  //input log
	.queryParam("key","qaclick123")  
	.header("Content-Type", "application/json")
	//.auth()    //authetication details 
	//External file data
	.body(new String(Files.readAllBytes(Paths.get("Test_Data/API_Payload_for_add_place.json"))))

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
	
	
	}
	
	
	@Test(groups="smoke")
	public void Api_Tc2() throws IOException {
		
	
	RestAssured.baseURI="https://rahulshettyacademy.com";
	
	 given()  //stored response in string variable
	.log().all()  //input log
	.queryParam("key","qaclick123")  
	.header("Content-Type", "application/json")
	//.auth()    //authetication details 
	//External file data
	.body(new String(Files.readAllBytes(Paths.get("Test_Data/API_Payload_for_add_place.json"))))

	.when()
	.post("/maps/api/place/add/json")
	.then()
	.log().all()  //output log
	.assertThat().statusCode(200) ;
	
	}
	
	@Test(groups="functional")  //, dependsOnGroups= {"smoke"}
	public void Api_Tc3() throws IOException {
		
	
	RestAssured.baseURI="https://rahulshettyacademy.com";
	
	 given()  //stored response in string variable
	.log().all()  //input log
	.queryParam("key","qaclick123")  
	.header("Content-Type", "application/json")
	//.auth()    //authetication details 
	//External file data
	.body(new String(Files.readAllBytes(Paths.get("Test_Data/API_Payload_for_add_place.json"))))

	.when()
	.post("/maps/api/place/add/json")
	.then()
	.log().all()  //output log
	.assertThat().statusCode(200) ;
	
	}
	
	@Test(priority=0)//, dependsOnMethods= {"Api_Tc1"}  // 0 to n 0 run first
	public void Api_Tc4() throws IOException {
		
	
	RestAssured.baseURI="https://rahulshettyacademy.com";
	
	 given()  //stored response in string variable
	.log().all()  //input log
	.queryParam("key","qaclick123")  
	.header("Content-Type", "application/json")
	//.auth()    //authetication details 
	//External file data
	.body(new String(Files.readAllBytes(Paths.get("Test_Data/API_Payload_for_add_place.json"))))

	.when()
	.post("/maps/api/place/add/json")
	.then()
	.log().all()  //output log
	.assertThat().statusCode(200) ;
	
	}
	
	
	}
