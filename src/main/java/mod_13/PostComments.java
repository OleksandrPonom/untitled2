package mod_13;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostComments {
	private int postId;
	private int id;
	private String name;
	private String email;
	private String body;
}
