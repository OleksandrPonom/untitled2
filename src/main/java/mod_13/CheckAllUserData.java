package mod_13;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class CheckAllUserData {
	private HttpClient httpClient = HttpClient.newHttpClient();

	public List<User> checkAllUserData() throws URISyntaxException, IOException, InterruptedException {

		HttpRequest checkUserData = HttpRequest.newBuilder(new URI(WorkConstans.DEFAULT_URL))
				.GET()
				.version(HttpClient.Version.HTTP_2)
				.build();

		HttpResponse<String> response = httpClient.send(checkUserData, HttpResponse.BodyHandlers.ofString());
		System.out.println("response.statusCode() = " + response.statusCode());
		System.out.println("response.body() = " + response.body());
		return null;

	}
}
