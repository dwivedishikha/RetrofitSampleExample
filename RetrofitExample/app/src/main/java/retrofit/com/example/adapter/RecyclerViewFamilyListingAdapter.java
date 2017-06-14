package retrofit.com.example.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import retrofit.com.example.R;
import retrofit.com.example.pojo.response;

public class RecyclerViewFamilyListingAdapter extends RecyclerView.Adapter<RecyclerViewFamilyListingAdapter.ViewHolder>{

    private ArrayList<response> familylistresponsepojo;

    public RecyclerViewFamilyListingAdapter(ArrayList<response> familylistresponsepojo) {
        this.familylistresponsepojo = familylistresponsepojo;
    }

    @Override
    public RecyclerViewFamilyListingAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerview_child_acivity, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewFamilyListingAdapter.ViewHolder holder, int position) {
        holder.tvName.setText(familylistresponsepojo.get(position).getFamily_name());
        holder.tvNoOfMembersCount.setText(familylistresponsepojo.get(position).getTotal_insurance());
        holder.tvTotalInsurance.setText(familylistresponsepojo.get(position).getTotal_premium());
    }

    @Override
    public int getItemCount() {
        return familylistresponsepojo.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvName,tvNoOfMembersCount,tvTotalInsurance;
        public ViewHolder(View view) {
            super(view);
            tvName = (TextView)view.findViewById(R.id.tvName);
            tvNoOfMembersCount = (TextView)view.findViewById(R.id.tvNoOfMembersCount);
            tvTotalInsurance = (TextView)view.findViewById(R.id.tvTotalInsurance);

        }
    }
}
