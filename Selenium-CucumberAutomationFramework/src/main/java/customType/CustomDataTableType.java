package customType;

import java.util.Map;

import domainObjects.PersonalDetails;
import io.cucumber.java.DataTableType;

public class CustomDataTableType {
	
	@DataTableType
	public PersonalDetails personalDetailsEntry(Map<String,String>entry) {
		return new PersonalDetails(
				entry.get("Country"), 
				entry.get("Address"), 
				entry.get("Email"), 
				entry.get("Phone"));
		
	}

}
