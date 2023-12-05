package mod_13;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.Reader;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.util.List;

import static java.net.URI.create;
import static mod_13.ProjektConstant.*;

public class ParsURL {

	public static User sendGetById(Integer id) throws IOException, InterruptedException {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(create(DEFAULT_URL_USERS + "/" + id))
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
				.uri(create(DEFAULT_URL_USERS + "?username=" + username))
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
				.uri(create(DEFAULT_URL_USERS))
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
				.uri(create(DEFAULT_URL_USERS))
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
				.uri(create(DEFAULT_URL_USERS + "/" + id))
				.PUT(HttpRequest.BodyPublishers.ofString(userRequest))
				.header("Content-type","application/json")
				.build();
		HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println("response.statusCode() = " + response.statusCode());
		return GSON.fromJson(response.body(), User.class);
	}

	public static void sendDelete(Integer id) throws IOException, InterruptedException {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(create(DEFAULT_URL_USERS + "/" + id))
				.DELETE()
				.build();
		HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println("response.statusCode() = " + response.statusCode());
	}

	public static List<UserTask> sendGetByPost(Integer id, Boolean stat) throws IOException, InterruptedException {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(create(DEFAULT_URL_USERS + "/" + id + "/todos" + "?completed=" + stat))
				.GET()
				.header("Content-type","application/json")
				.build();
		HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
		List<UserTask> tasks = GSON.fromJson(response.body(), new TypeToken<List<UserTask>>(){}.getType());
	//	System.out.println("response.statusCode() = " + response.statusCode());
		return tasks;
	}

	static int maxPostId;

	public static List<PostComments> sendGetCommentToLustPost(Integer userId) throws IOException, InterruptedException {
		sendGetLustPost sendGetLustPost = new sendGetLustPost(userId);
		HttpRequest requestNext = HttpRequest.newBuilder()
				 .uri(create(DEFAULT_URL_POSTS + "/" + maxPostId + "/comments"))
				 .GET()
				 .header("Content-type", "application/json")
				 .build();
		 HttpResponse<Path> responseNext = CLIENT.send(requestNext, HttpResponse.BodyHandlers.ofFile(Path.of("src/main/java/mod_13/OutData/user-" + userId + "-post-" + maxPostId + "comments.json")));
		 System.out.println("response.statusCode() = " + responseNext.statusCode());
		 return null;
	}

	public static class sendGetLustPost {

		public sendGetLustPost(Integer userId) throws IOException, InterruptedException {
			HttpRequest request = HttpRequest.newBuilder()
					.uri(create(DEFAULT_URL_USERS + "/" + userId + "/posts"))
					.GET()
					.method("GET", HttpRequest.BodyPublishers.ofString("id"))
					.header("Content-type", "application/json")
					.build();
			HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
			List<UserPost> posts = GSON.fromJson(response.body(), new TypeToken<List<UserPost>>() {}.getType());
			maxPostId = posts.stream()
					.map(v -> v.getId())
					.max(Integer::compare)
					.get();
			System.out.println("maxPostId = " + maxPostId);
		}
	}
}
