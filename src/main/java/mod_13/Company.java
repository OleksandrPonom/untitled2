package mod_13;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Company {
	private String name;
	private String catchPhrase;
	private String bs;
}
