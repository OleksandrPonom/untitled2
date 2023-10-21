package mod_13.Task_1;


import lombok.Builder;
import lombok.Data;


@Data
@Builder


public class UserTask {
	private int taskId;
	private int userId;
	private int id;
	private String title;
	private boolean completed;

}
