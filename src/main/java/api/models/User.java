package api.models;

import com.github.jasminb.jsonapi.annotations.Type;

@Type("users")
public class User {
    public String id;
    public String name;
    public String email;
    public String gender;
    public String status;

    public User() {
    }

    public User(String name, String gender, String email, String status) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.status = status;
    }

}
