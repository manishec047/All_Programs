package restAPIFramework;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.gson.Gson;

import ResponsePojo.CreatePersonResponse;
import Service.Service;

public class CreatePersionAPITest extends TestBase 
{

	String name;
	String surname;
	String city;
	String landmark;
	String state;
	String zipcode;

	@BeforeClass

	public void dataSetup() {
		name = "servicename";
		surname = "servicesurname";
		city = "servicecity";
		landmark = "servicesurname";
		state = "servicestate";
		zipcode = "servicezipcode";

	}

	@Test
	
	public void createPersonAPITest()
	{
		service=new Service();
		response=service.createPersonAPI(name, surname, city, landmark, state, zipcode);
		
		if(response.getStatusCode()==200)
		{
			System.out.println("Response code is "+response.asString());
			
			Gson gson=new Gson();
			CreatePersonResponse createPersonResponse= gson.fromJson(response.asString(), CreatePersonResponse.class);
			
		
			
			System.out.println(createPersonResponse.getResponse().get(0).getAddress().getCity());
			System.out.println(createPersonResponse.getResponse().get(0).getAddress().getLandmark());
			System.out.println(createPersonResponse.getResponse().get(0).getAddress().getState());
			System.out.println(createPersonResponse.getResponse().get(0).getAddress().getZipcode());
			
			Assert.assertEquals(createPersonResponse.getResponse().get(0).getAddress().getCity(), city);
			Assert.assertEquals(createPersonResponse.getResponse().get(0).getName(), name);
		}	
		
		else
			Assert.assertEquals(false, response.asString());
	}
}
