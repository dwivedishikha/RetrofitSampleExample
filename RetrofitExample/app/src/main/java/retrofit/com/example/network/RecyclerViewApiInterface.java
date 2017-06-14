package retrofit.com.example.network;


import retrofit.com.example.pojo.RecyclerViewFamilyList;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RecyclerViewApiInterface {
    @POST("listOfFamily")
    @FormUrlEncoded
    Call<RecyclerViewFamilyList> savePost(@Field("authKey") String authkey);
}
