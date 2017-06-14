package retrofit.com.example.network;


public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "http://139.162.19.186:8080";
    public static final String base_url_familiylisting = "https://www.moneyparrot.com/app/advisor/";

    public static ApiServiceInterface getAPIService() {

        return RetrofitClient.getRetrofitInstance(BASE_URL).create(ApiServiceInterface.class);
    }

    public static RecyclerViewApiInterface apiService() {

        return RetrofitClient.getRetrofitInstance(base_url_familiylisting).create(RecyclerViewApiInterface.class);
    }
}
