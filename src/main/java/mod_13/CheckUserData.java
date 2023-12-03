package mod_13;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class CheckUserData {
	private HttpClient httpClient = HttpClient.newHttpClient();

	public List<User> checkUserDataFromId(Integer id) throws URISyntaxException, IOException, InterruptedException {
		HttpRequest checkData = HttpRequest.newBuilder(new URI(WorkConstans.DEFAULT_URL + "/" + id))
				.GET()
				.version(HttpClient.Version.HTTP_2)
				.build();

		HttpResponse<String> response = httpClient.send(checkData, HttpResponse.BodyHandlers.ofString());
		System.out.println("response.statusCode() = " + response.statusCode());
		System.out.println("response.body() = " + response.body());
		return null;
	}

	public List<User> checkUserDataFromUserName(String username) throws URISyntaxException, IOException, InterruptedException {
		HttpRequest checkData = HttpRequest.newBuilder(new URI(WorkConstans.DEFAULT_URL + "?username=" + username))
				.GET()
				.version(HttpClient.Version.HTTP_2)
				.build();

		HttpResponse<String> response = httpClient.send(checkData, HttpResponse.BodyHandlers.ofString());
		System.out.println("response.statusCode() = " + response.statusCode());
		System.out.println("response.body() = " + response.body());
		return null;
	}

	public List<UserTask> checkUserTaskFromUserId(Integer userId) throws URISyntaxException, IOException, InterruptedException {
		HttpRequest checkTask = HttpRequest.newBuilder(new URI(WorkConstans.DEFAULT_URL + "/" + userId + "/todos"))
				.method("GET", HttpRequest.BodyPublishers.ofString("false"))
				.version(HttpClient.Version.HTTP_2)
				.header("Content-type","application/json")
				.build();

		HttpResponse<String> response = httpClient.send(checkTask, HttpResponse.BodyHandlers.ofString());
		System.out.println("response.statusCode() = " + response.statusCode());
		System.out.println("response.body() = " + response.body());
		return null;
	}

	public List<UserTask> checkUserPostFromUserId(Integer userId) throws URISyntaxException, IOException, InterruptedException {
		HttpRequest checkPost = HttpRequest.newBuilder(new URI(WorkConstans.DEFAULT_URL + "/" + userId + "/posts"))
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.version(HttpClient.Version.HTTP_2)
				.header("Content-type","application/json")
				.build();

		HttpResponse<String> response = httpClient.send(checkPost, HttpResponse.BodyHandlers.ofString());
		System.out.println("response.statusCode() = " + response.statusCode());
		System.out.println("response.body() = " + response.body());
		return null;
	}
}
