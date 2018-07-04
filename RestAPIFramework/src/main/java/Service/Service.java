package Service;

import java.util.ArrayList;

import org.json.JSONObject;
import org.testng.Assert;

import com.google.gson.Gson;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import com.jayway.restassured.specification.RequestSpecification;

import RequestPojo.Address;
import RequestPojo.CreatePerson;

import ResponsePojo.CreatePersonResponse;

public class Service {

	public Response createPersonAPI(String Name, String Surname, String city, String Landmark, String state,
			String Zipcode) {

		List<JSONObject> list;
		CreatePerson createPerson = new CreatePerson();
		createPerson.setName(Name);
		createPerson.setSurname(Surname);

		Address address = new Address();
		createPerson.setAddress(address);
		address.setCity(city);
		address.setLandmark(Landmark);
		address.setState(state);
		address.setZipcode(Zipcode);

		JSONObject jsonObj = new JSONObject(createPerson);
		System.out.println("json payload" + jsonObj);

		list = new ArrayList<JSONObject>();
		list.add(jsonObj);
		System.out.println(list);

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType("application/json");
		requestSpecification.accept("application/json");

		// requestSpecification.body(jsonObject);
		requestSpecification.body(list.toString());

		System.out.println("end point URL" + ServiceURL.createpersonurl);
		Response response = requestSpecification.post(ServiceURL.createpersonurl);
		return response;

	}

	public static void main(String[] args) {
		Service service = new Service();
		Response data = service.createPersonAPI("name", "Surname", "city", "Landmark", "state", "Zipcode");
		
		if(data.getStatusCode()==200)
		{
		
		System.out.println(data.asString());

		Gson gson = new Gson();
		CreatePersonResponse createPersonResponse = gson.fromJson(data.asString(), CreatePersonResponse.class);

		
		
		System.out.println(createPersonResponse.getResponse().get(0).getAddress().getCity());
		System.out.println(createPersonResponse.getResponse().get(0).getName());
		System.out.println(createPersonResponse.getResponse().get(0).getSurname());
		System.out.println(createPersonResponse.getResponse().get(0).getAddress().getLandmark());

		Assert.assertEquals(createPersonResponse.getResponse().get(0).getAddress().getCity(), "city");

		Assert.assertEquals(createPersonResponse.getResponse().get(0).getName(), "name");
	}
	}

}
