package retrofit.com.example.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit.com.example.R;
import retrofit.com.example.network.ApiServiceInterface;
import retrofit.com.example.network.ApiUtils;
import retrofit.com.example.pojo.ForgotPasswordPojo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ForgotPasswordActivity extends AppCompatActivity {

    //    @BindView(R.id.tvEmail)
//    TextView tvEmail;
    @BindView(R.id.etEmail)
    EditText etEmail;
    @BindView(R.id.btnLogin)
    Button button2;


    private ApiServiceInterface mAPIService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);
        ButterKnife.bind(this);
        mAPIService = ApiUtils.getAPIService();
    }

    @OnClick(R.id.btnLogin)
    void buttonClick() {
        Toast.makeText(getApplicationContext(), "login", Toast.LENGTH_SHORT).show();
        String title = etEmail.getText().toString();
        //sendPost("shikha@codewave.in");
        sendPost(title);
    }

    public void sendPost(String title) {
        Call<ForgotPasswordPojo> call = mAPIService.savePost(title);
        call.enqueue(new Callback<ForgotPasswordPojo>() {
            @Override
            public void onResponse(Call<ForgotPasswordPojo> call, Response<ForgotPasswordPojo> response) {
                ForgotPasswordPojo emailPojo = response.body();
                Log.d("TAG", " On Success--" + emailPojo.getMessage());

            }

            @Override
            public void onFailure(Call<ForgotPasswordPojo> call, Throwable t) {
                t.printStackTrace();
            }
        });

    }

}

//
//call.enqueue(new Callback<ForgotPasswordPojo>() {
//@Override
//public void onResponse(Call call, Response response) {
//        if (response.isSuccessful()) {
//        Log.d("TAG", "post submitted to API.--" + response.body().toString());
//        ForgotPasswordPojo _email = (ForgotPasswordPojo) response.body();
//        String text = _email.getEmail();
//        Log.d("TAG", "response email--" + text);
//        }
//        }
//
//@Override
//public void onFailure(Call call, Throwable t) {
//        Log.d("TAG", "Unable to submit post to API."+ t.toString());
//        }
//
//        });