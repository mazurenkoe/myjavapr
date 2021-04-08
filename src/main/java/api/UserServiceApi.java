package api;

import api.models.User;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static api.RetrofitClient.userService;


public class UserServiceApi {

    public List<User> getUsers() throws IOException {
        JsonObject jsonObject = userService.getUsers().execute().body();

        List<User> user = new ArrayList<>();
        jsonObject.get("data").getAsJsonArray()
                .forEach(elem -> {
                    user.add(new Gson().fromJson(elem.toString(), User.class));
                });
        return user;
    }

    public User createUser(User user) throws IOException {
        JsonObject responseBody = userService.createUser(user).execute().body();
        if (responseBody.get("code").toString().equals("201")) {
            return new Gson().fromJson(responseBody.get("data").toString(), User.class);
        } else {
            throw new AssertionError(responseBody.toString());
        }
    }

    public User updateUser(User user) throws IOException {
        JsonObject responseBody = userService.updateUser(user.id, user).execute().body();
        if (responseBody.get("code").toString().equals("200")) {
            return new Gson().fromJson(responseBody.get("data").toString(), User.class);
        } else {
            throw new AssertionError(responseBody.toString());
        }
    }

    public User getUser(String userId) throws IOException {
        JsonObject responseBody = userService.getUser(userId).execute().body();
        if (responseBody.get("code").toString().equals("200")) {
            return new Gson().fromJson(responseBody.get("data").toString(), User.class);
        } else {
            throw new AssertionError(responseBody.toString());
        }
    }

    public void deleteUsers(List<User> users) {
        users.forEach(user -> {
            userService.deleteUser(user.id);
        });
    }

}
