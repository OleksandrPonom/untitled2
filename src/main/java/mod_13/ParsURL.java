package mod_13;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import static java.net.URI.create;

public class ParsURL {
	private static final String DEFAULT_URL = "https://jsonplaceholder.typicode.com/users";
	private static final HttpClient CLIENT = HttpClient.newHttpClient();
	private static final Gson GSON = new Gson();

	public static User sendGetById(Integer id) throws IOException, InterruptedException {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(create(DEFAULT_URL + "/" + id))
				.GET()
				.header("Content-type","application/json")
				.build();
		HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
		User user = GSON.fromJson(response.body(), User.class);
	//	System.out.println("response.statusCode() = " + response.statusCode());
		return user;
	}

	public static List<User> sendGetByUserName(String username) throws IOException, InterruptedException {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(create(DEFAULT_URL + "?username=" + username))
				.header("Content-type","application/json")
				.GET()
				.build();
		HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
		List<User> user = GSON.fromJson(response.body(), new TypeToken<List<User>>(){}.getType());
	//	System.out.println("response.statusCode() = " + response.statusCode());
		return user;
	}

	public static List<User> sendGetAllUsers() throws IOException, InterruptedException {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(create(DEFAULT_URL))
				.GET()
				.header("Content-type","application/json")
				.build();
		HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
		List<User> users = GSON.fromJson(response.body(), new TypeToken<List<User>>(){}.getType());
		return users;
	}

	public static User sendPost(User user) throws IOException, InterruptedException {
		String userRequest = GSON.toJson(user);
		HttpRequest request = HttpRequest.newBuilder()
				.uri(create(DEFAULT_URL))
				.POST(HttpRequest.BodyPublishers.ofString(userRequest))
				.header("Content-type","application/json")
				.build();
		HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println("response.statusCode() = " + response.statusCode());
		return GSON.fromJson(response.body(), User.class);
	}

	public static User sendPut(Integer id, User user) throws IOException, InterruptedException {
		String userRequest = GSON.toJson(user);
		HttpRequest request = HttpRequest.newBuilder()
				.uri(create(DEFAULT_URL + "/" + id))
				.PUT(HttpRequest.BodyPublishers.ofString(userRequest))
				.header("Content-type","application/json")
				.build();
		HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println("response.statusCode() = " + response.statusCode());
		return GSON.fromJson(response.body(), User.class);
	}

	public static void sendDelete(Integer id) throws IOException, InterruptedException {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(create(DEFAULT_URL + "/" + id))
				.DELETE()
				.build();
		HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println("response.statusCode() = " + response.statusCode());
	}

	public static List<UserTask> sendGetByPost(Integer id, Boolean stat) throws IOException, InterruptedException {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(create(DEFAULT_URL + "/" + id + "/todos" + "?completed=" + stat))
				.GET()
				.header("Content-type","application/json")
				.build();
		HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
		List<UserTask> tasks = GSON.fromJson(response.body(), new TypeToken<List<UserTask>>(){}.getType());
	//	System.out.println("response.statusCode() = " + response.statusCode());
		return tasks;
	}

}
