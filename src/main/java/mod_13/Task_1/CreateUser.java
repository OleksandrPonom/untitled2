package mod_13.Task_1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Objects;

import static mod_13.Task_1.WorkConstans.DEFAULT_URL;

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

		HttpRequest createUser = HttpRequest.newBuilder(new URI(DEFAULT_URL))
				.method("POST", HttpRequest.BodyPublishers.ofString(gson.toJson(userRequest)))
				.version(HttpClient.Version.HTTP_1_1)
				.build();

		HttpResponse<String> response = httpClient.send(createUser, HttpResponse.BodyHandlers.ofString());

		System.out.println("response.statusCode() = " + response.statusCode());
		System.out.println("response.body() = " + response.body());
		return null;
	}

}
