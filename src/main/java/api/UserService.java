package api;

import api.models.User;
import com.google.gson.JsonObject;
import retrofit2.Call;
import retrofit2.http.*;

public interface UserService {

    @Headers({"Authorization: Bearer 0e778d4df0880c9ab2c624c7e8ce5f6e402aa73eaf1424b7a94b636a52c59c59"})
    @GET("users")
    Call<JsonObject> getUsers();

    @Headers({"Authorization: Bearer 0e778d4df0880c9ab2c624c7e8ce5f6e402aa73eaf1424b7a94b636a52c59c59"})
    @GET("users/{userId}")
    Call<JsonObject> getUser(@Path("userId") String userId);

    @Headers({"Authorization: Bearer 0e778d4df0880c9ab2c624c7e8ce5f6e402aa73eaf1424b7a94b636a52c59c59"})
    @PUT("users/{userId}")
    Call<JsonObject> updateUser(@Path("userId") String userId, @Body User user);

    @Headers({"Authorization: Bearer 0e778d4df0880c9ab2c624c7e8ce5f6e402aa73eaf1424b7a94b636a52c59c59"})
    @DELETE("users/{userId}")
    Call<JsonObject> deleteUser(@Path("userId") String userId);

    @Headers({"Authorization: Bearer 0e778d4df0880c9ab2c624c7e8ce5f6e402aa73eaf1424b7a94b636a52c59c59"})
    @POST("users")
    Call<JsonObject> createUser(@Body User user);
}
