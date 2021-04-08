package ApiTests;

import api.UserServiceApi;
import api.models.User;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserServiceTests {

    private UserServiceApi userServiceApi = new UserServiceApi();
    private List<User> usersToDelete = new ArrayList<>();
    private User userToUpdate;

    @BeforeClass
    public void prepareTestData() throws IOException {
        String userName = new Date().getTime() + "";
        userToUpdate = userServiceApi.createUser(new User(userName, "Male", userName + "@gmail.com", "Active"));
    }

    @Test
    public void createUser() throws IOException {
        String userName = new Date().getTime() + "";
        User userToCreated = userServiceApi.createUser(new User(userName, "Male", userName + "@gmail.com", "Active"));
        User userCreated = userServiceApi.getUser(userToCreated.id);
        usersToDelete.add(userToCreated);
        usersToDelete.add(userCreated);

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(userCreated.email, userCreated.email);
        sa.assertEquals(userCreated.name, userCreated.name);
        sa.assertEquals(userCreated.gender, userCreated.gender);
        sa.assertEquals(userCreated.status, userCreated.status);
        sa.assertAll();
    }

    @Test
    public void updateUser() throws IOException {
        userToUpdate.name = "myNewName";
        userToUpdate.gender = "Female";
        userToUpdate.email = "new" + userToUpdate.email;

        User updatedUser = userServiceApi.updateUser(userToUpdate);

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(updatedUser.email, userToUpdate.email);
        sa.assertEquals(updatedUser.name, userToUpdate.name);
        sa.assertEquals(updatedUser.gender, userToUpdate.gender);
        sa.assertEquals(updatedUser.status, userToUpdate.status);
        sa.assertAll();
    }

    @Test
    public void getUsers() throws IOException {
        List<User> users = userServiceApi.getUsers();
        Assert.assertTrue(users.size() > 0, "No users were returned");
    }

    @AfterClass
    public void clearData() {
        userServiceApi.deleteUsers(usersToDelete);
    }

}
