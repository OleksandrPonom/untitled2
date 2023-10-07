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

import static mod_13.Task_1.WorkConstans.DEFAULT_URL;

public class CheckAllUserData {
	private HttpClient httpClient = HttpClient.newHttpClient();

	public List<User> checkAllUserData() throws URISyntaxException, IOException, InterruptedException {
		Gson gson = new GsonBuilder().create();
		HttpRequest updateUser = HttpRequest.newBuilder(new URI(DEFAULT_URL))
				.GET()
				.version(HttpClient.Version.HTTP_1_1)
				.build();

		HttpResponse<String> response = httpClient.send(updateUser, HttpResponse.BodyHandlers.ofString());
		System.out.println("response.statusCode() = " + response.statusCode());
		System.out.println("response.body() = " + response.body());
		return null;

	}
}
