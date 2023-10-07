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

public class DeleteUser {


	private HttpClient httpClient = HttpClient.newHttpClient();

	public List<User> deleteUser(Integer id) throws URISyntaxException, IOException, InterruptedException {

		HttpRequest deleteUserFromIndex = HttpRequest.newBuilder(new URI(DEFAULT_URL + "/" + id))
				.DELETE()
				.build();

		HttpResponse<String> send = httpClient.send(deleteUserFromIndex, HttpResponse.BodyHandlers.ofString());
		System.out.println("send.statusCode() = " + send.statusCode());
		return null;
	}

}