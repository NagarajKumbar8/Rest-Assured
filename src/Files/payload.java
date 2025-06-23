package Files;

public class payload {

	public static String Addplace_Api()
	{
		
		return " {\r\n"
				+ "\"location\": {\r\n"
				+ "\r\n"
				+ "\"lat\": -38.383494,\r\n"
				+ "\r\n"
				+ "\"lng\": 33.427362\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "\"accuracy\": 50,\r\n"
				+ "\r\n"
				+ "\"name\": \"Rahul Shetty Academy\",\r\n"
				+ "\r\n"
				+ "\"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "\r\n"
				+ "\"address\": \"29, side layout, cohen 09\",\r\n"
				+ "\r\n"
				+ "\"types\": [\r\n"
				+ "\r\n"
				+ "\"shoe park\",\r\n"
				+ "\r\n"
				+ "\"shop\"\r\n"
				+ "\r\n"
				+ "],\r\n"
				+ "\r\n"
				+ "\"website\": \"http://rahulshettyacademy.com\",\r\n"
				+ "\r\n"
				+ "\"language\": \"French-IN\"\r\n"
				+ "}";
	}
	
	
	/*
	 * public static String update_place() {
	 * 
	 * return "{\r\n" + "\"place_id\": \""+place_id +"\",\r\n" +
	 * "\"address\": \"29, blr, cohen 09\",\r\n" + "\"key\" : \"qaclick123\"\r\n" +
	 * "}";
	 * 
	 * }
	 */
	
	
	public static String Mock_API_response()
	{
		
		return "{\r\n"
				+ "\"location\": {\r\n"
				+ "\r\n"
				+ "\"lat\": -38.383494,\r\n"
				+ "\r\n"
				+ "\"lng\": 33.427362\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "\"accuracy\": 50,\r\n"
				+ "\r\n"
				+ "\"name\": \"Nagaraj Mock test\",\r\n"
				+ "\r\n"
				+ "\"phone_number\": \"12334\",\r\n"
				+ "\r\n"
				+ "\"address\": \"29, blr, cohen 09\",\r\n"
				+ "\r\n"
				+ "\"types\": [\r\n"
				+ "\r\n"
				+ "\"shoe park\",\r\n"
				+ "\r\n"
				+ "\"shop\"\r\n"
				+ "\r\n"
				+ "],\r\n"
				+ "\r\n"
				+ "\"website\": \"http://test.com\",\r\n"
				+ "\r\n"
				+ "\"language\": \"eng\"\r\n"
				+ "}";  // mock response and validate using Json parse
	}
}
