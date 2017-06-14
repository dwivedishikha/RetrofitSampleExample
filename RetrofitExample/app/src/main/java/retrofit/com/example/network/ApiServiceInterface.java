package retrofit.com.example.network;


import retrofit.com.example.pojo.ForgotPasswordPojo;
import retrofit.com.example.pojo.SummaryPojo;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiServiceInterface {

    @POST("/forgotPassword")
    @FormUrlEncoded
    Call<ForgotPasswordPojo> savePost(@Field("email") String username);

    @GET("/reviewSummary/58edeab305d0a312a49ee9ee")
    Call<SummaryPojo> getSummaryDetails();

}
