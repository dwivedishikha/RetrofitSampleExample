package retrofit.com.example.activity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import retrofit.com.example.R;

public class MainActivity extends Activity implements View.OnClickListener{

    private Button btnForgotPassword,btnSummary, btnListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
        setListeners();
    }

    private void initWidgets() {
        btnForgotPassword = (Button)findViewById(R.id.btnForgotPassword);
        btnSummary = (Button)findViewById(R.id.btnSummary);
        btnListView = (Button)findViewById(R.id.btnListView);
    }

    private void setListeners() {
        btnForgotPassword.setOnClickListener(this);
        btnSummary.setOnClickListener(this);
        btnListView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(btnForgotPassword.getId()==v.getId()){
            Intent i = new Intent(this, ForgotPasswordActivity.class);
            startActivity(i);
        }
        else if(btnSummary.getId()==v.getId()){
            Intent i = new Intent(this, SummaryActivity.class);
            startActivity(i);
        }
        else if(btnListView.getId()==v.getId()){
            Intent i = new Intent(this, RecyclerViewFamilyListingActivity.class);
            startActivity(i);
        }
    }
}
