package mod_13.Task_1;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder

public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private Map<String, String> address;
    private Map<String, Float> geo;
    private String phone;
    private String website;
    private Map<String, String> company;
}
