package tests;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadempfile {
    
	public static void main(String[] args) throws IOException, ParseException,FileNotFoundException{
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\JsonFolder\\Employee.json");
		Object obj = jsonparser.parse(reader);
		JSONObject empjsonobj = (JSONObject)obj;
		
		String fname = (String) empjsonobj.get("firstName");
		String lname = (String) empjsonobj.get("lastName");
		
		System.out.println("first Name:"+fname);
		System.out.println("Last Name:"+lname);
		
		
		
		JSONArray array = (JSONArray)empjsonobj.get("address");
		
		for(int i=0;i<array.size();i++)
		{
			JSONObject address = (JSONObject) array.get(i);
			String street = (String) address.get("street");
			String city = (String) address.get("city");
			String state = (String) address.get("state");
			
			
			System.out.println("Address of "+i+"is..");
			System.out.println("street: "+street);
			System.out.println("city: "+city);
			System.out.println("state of: "+state);
			
			empjsonobj.put("name","school");
			obj=empjsonobj.toString();
		}
		
	}
}
