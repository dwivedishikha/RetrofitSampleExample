package retrofit.com.example.activity;


import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit.com.example.R;
import retrofit.com.example.adapter.RecyclerViewFamilyListingAdapter;
import retrofit.com.example.network.ApiUtils;
import retrofit.com.example.network.RecyclerViewApiInterface;
import retrofit.com.example.pojo.RecyclerViewFamilyList;
import retrofit.com.example.pojo.response;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RecyclerViewFamilyListingActivity extends Activity{

    @BindView(R.id.recyclerviewFamilyList)
    RecyclerView recyclerviewFamilyList;
    private ArrayList<response> data;
    private RecyclerViewFamilyListingAdapter adapter;
    private RecyclerViewApiInterface service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_main);
        ButterKnife.bind(this);
        service = ApiUtils.apiService();

        recyclerviewFamilyList.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerviewFamilyList.setLayoutManager(layoutManager);
        loadJSON();
    }

    private void loadJSON() {
        Call<RecyclerViewFamilyList> call = service.savePost("bW9uZXlwYXJyb3QjNTkwMTkwZmM2ODAzZmEwNDEwMTZhY2I5I2Fkdmlzb3I\\u003d");
        call.enqueue(new Callback<RecyclerViewFamilyList>() {
            @Override
            public void onResponse(Call<RecyclerViewFamilyList> call, Response<RecyclerViewFamilyList> response) {
                RecyclerViewFamilyList res = response.body();
                Log.d("TAG", " On Success--"+ res.toString());
                data = new ArrayList<>(Arrays.asList(res.getFamilyListings()));
                adapter = new RecyclerViewFamilyListingAdapter(data);
                recyclerviewFamilyList.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<RecyclerViewFamilyList> call, Throwable t) {
                Log.d("TAG", " on Failure--"+ t.getMessage());
            }
        });
    }
}
