package mod_13;

import com.google.gson.Gson;

import java.net.http.HttpClient;

public class ProjektConstant {
	public static final String DEFAULT_URL_USERS = "https://jsonplaceholder.typicode.com/users";
	public static final String DEFAULT_URL_POSTS = "https://jsonplaceholder.typicode.com/posts";
	public static final HttpClient CLIENT = HttpClient.newHttpClient();
	public static final Gson GSON = new Gson();
}
