package retrofit.com.example.activity;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit.com.example.R;
import retrofit.com.example.network.ApiServiceInterface;
import retrofit.com.example.network.ApiUtils;
import retrofit.com.example.pojo.SummaryPojo;
import retrofit.com.example.pojo.parameterAvearageScore;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SummaryActivity extends Activity {
    @BindView(R.id.tvstatus_code)
    TextView tvstatus_code;
    @BindView(R.id.tvstatus)
    TextView tvstatus;
    @BindView(R.id.tvNumberOfYes)
    TextView tvNumberOfYes;
    @BindView(R.id.tvNumberOfNo)
    TextView tvNumberOfNo;
    @BindView(R.id.tvApiCall)
    TextView tvApiCall;

    private ApiServiceInterface mAPIService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_summary);
        ButterKnife.bind(this);
        mAPIService = ApiUtils.getAPIService();

        Call call = mAPIService.getSummaryDetails();
        call.enqueue(new Callback<SummaryPojo>() {
            @Override
            public void onResponse(Call<SummaryPojo> call, Response<SummaryPojo> response) {
                SummaryPojo res = response.body();
                Log.d("TAG", " On Success--" + res.toString());

                // getting value from json object
                tvstatus_code.setText(res.getStatus_code());
                tvstatus.setText(res.getStatus());
                tvNumberOfYes.setText(res.getNumberOfYes());
                tvNumberOfNo.setText(res.getNumberOfNo());
                tvApiCall.setText(res.getApiCall());

                // getting value from nested json object
                Log.d("TAG", "Get id from result:- "+res.getResult().get_id());

                // 2 ways to parse jsonarray data

                /*ArrayList<SummaryPojo.parameterAvearageScore> dataList = new ArrayList(response.body().parameterAvearageScore);
                Log.d("TAG", "dataList size --" + dataList.size());
                for (SummaryPojo.parameterAvearageScore list:dataList) {
                    Log.d("TAG", "ParameterName --" + list.getParameterName());
                }*/

                ArrayList<parameterAvearageScore> dataList = new ArrayList(response.body().parameterAvearageScore);
                Log.d("TAG", "dataList size --" + dataList.size());
                for (parameterAvearageScore list:dataList) {
                    Log.d("TAG", "ParameterName --" + list.getParameterName());
                }
            }

            @Override
            public void onFailure(Call<SummaryPojo> call, Throwable t) {
                t.printStackTrace();
                Log.d("TAG", "onFailure --" + t.toString());
            }
        });

    }


}
