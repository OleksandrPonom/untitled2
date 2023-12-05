package mod_13;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserPost {
	private int userId;
	private int id;
	private String title;
	private String body;
}
