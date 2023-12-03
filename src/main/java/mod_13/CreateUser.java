package mod_13;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class CreateUser {

	private HttpClient httpClient = HttpClient.newHttpClient();
	Gson gson = new GsonBuilder().create();


	public List<User> createDataUser() throws URISyntaxException, IOException, InterruptedException {
		User userRequest = User.builder()
				.name("Mark Test")
				.username("Test")
				.email("test@google.com")
				.website("Test.com")
				.build();

		HttpRequest createUser = HttpRequest.newBuilder(new URI(WorkConstans.DEFAULT_URL))
				.method("POST", HttpRequest.BodyPublishers.ofString(gson.toJson(userRequest)))
				.version(HttpClient.Version.HTTP_2)
				.header("Content-type","application/json")
				.build();

		HttpResponse<String> response = httpClient.send(createUser, HttpResponse.BodyHandlers.ofString());

		System.out.println("response.statusCode() = " + response.statusCode());
		System.out.println("response.body() = " + response.body());

		return null;
	}


	public List<User> userUpdate(Integer id) throws URISyntaxException, IOException, InterruptedException {
		User userDataUpdate = User.builder()
				.name("Mark Test")
				.username("Test")
				.email("test@google.com")
				.website("Test.com")
				.build();

		HttpRequest userUpdate = HttpRequest.newBuilder(new URI(WorkConstans.DEFAULT_URL + "/" + id))
				.method("PUT", HttpRequest.BodyPublishers.ofString(gson.toJson(userDataUpdate)))
				 .version(HttpClient.Version.HTTP_2)
				.header("Content-type","application/json")
				.build();

		HttpResponse<String> response = httpClient.send(userUpdate, HttpResponse.BodyHandlers.ofString());

		System.out.println("response.statusCode() = " + response.statusCode());
		System.out.println("response.body() = " + response.body());

		return null;
	}

}
