package tests;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class Json {
	
	public static void main(String args[]) {
	      ArrayList s=new ArrayList();
	      JSONObject savedQuoteList = new JSONObject();
	      
	      savedQuoteList.put("createdBy", "testuser2");
	      savedQuoteList.put("createdDate", "2022-05-05T22:00:07+0000");
	      savedQuoteList.put("ID", "1");
	      savedQuoteList.put("First_Name", "Krishna Kasyap");
	      savedQuoteList.put("Last_Name", "Bhagavatula");
	      savedQuoteList.put("modifiedDate", "2022-05-11T02:15:16+0000");
	      savedQuoteList.put("status", "Expired");
	      
	      JSONArray array1 = new JSONArray();
	      array1.add("createdBy: testuser2");
	      array1.add("createdDate: 2022-05-05T22:00:07+0000");
	      array1.add("ID: 2");
	      array1.add("e-mail: krishna_kasyap@gmail.com");
	      array1.add("phone: 9848022338");
	      array1.add("First_Name: prasanthi");
	      array1.add("Last_Name: yeduvaka");
	      array1.add("modifiedDate: 2022-05-11T02:15:16+0000");
	      array1.add("status: Opened");
	     
	      
	      JSONArray array2 = new JSONArray();
	      array2.add("createdBy: testuser2");
	      array2.add("createdDate: 2022-05-05T22:00:07+0000");
	      array2.add("ID: 3");
	      array2.add("e-mail: krishna_kasyap@gmail.com");
	      array2.add("phone: ");
	      array2.add("First_Name: ramu");
	      array2.add("Last_Name: yeduvaka");
	      array2.add("modifiedDate: 2022-05-11T02:15:16+0000");
	      array2.add("status: Converted");
	      
	      
	      
	      s.add(array2);
	      s.add(array1);
	      
	      savedQuoteList.put("this 3 Json Arrays Object",s);
	      
	      try {
	         FileWriter file = new FileWriter("D:/json_array_output.json");
	         file.write(savedQuoteList.toJSONString());
	         file.close();
	      } catch (IOException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	         
	        
	      }
	      System.out.println("JSON file created: "+savedQuoteList);
	   }
	

}
