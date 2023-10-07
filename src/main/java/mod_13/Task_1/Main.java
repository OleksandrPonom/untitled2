package mod_13.Task_1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

		String url = "https://jsonplaceholder.typicode.com/users/11";
	/*	User userRequest = User.builder()
				.name("Mark Test")
				.username("Test")
				.email("test@google.com")
				.website("Test.com")
				.build();

		HttpRequest createUser = HttpRequest.newBuilder(new URI(url))
				.method("POST", HttpRequest.BodyPublishers.ofString(gson.toJson(userRequest)))
				.version(HttpClient.Version.HTTP_1_1)
				.build();

		HttpClient httpClient = HttpClient.newHttpClient();
		HttpResponse<String> response = httpClient.send(createUser, HttpResponse.BodyHandlers.ofString());

		System.out.println("response.statusCode() = " + response.statusCode());
		System.out.println("response.body() = " + response.body());

	*/
	/*	HttpRequest deleteUser = HttpRequest.newBuilder(new URI(url))
				.DELETE()
				.build();

		HttpClient httpClient = HttpClient.newHttpClient();
		HttpResponse<String> send = httpClient.send(deleteUser, HttpResponse.BodyHandlers.ofString());
		System.out.println("send.statusCode() = " + send.statusCode());*/
	}
}