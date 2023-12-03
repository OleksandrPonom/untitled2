package mod_13;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class DeleteUser {


	private HttpClient httpClient = HttpClient.newHttpClient();

	public List<User> deleteUser(Integer id) throws URISyntaxException, IOException, InterruptedException {

		HttpRequest deleteUserFromIndex = HttpRequest.newBuilder(new URI(WorkConstans.DEFAULT_URL + "/" + id))
				.DELETE()
				.build();

		HttpResponse<String> send = httpClient.send(deleteUserFromIndex, HttpResponse.BodyHandlers.ofString());
		System.out.println("statusCode from delete User = " + send.statusCode());
		return null;
	}

}