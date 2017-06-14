package retrofit.com.example.pojo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class response {
    @SerializedName("family_name")
    @Expose
    private String family_name;

    @SerializedName("total_insurance")
    @Expose
    private String total_insurance;

    @SerializedName("total_premium")
    @Expose
    private String total_premium;

    public String getFamily_name() {
        return family_name;
    }

    public void setFamily_name(String family_name) {
        this.family_name = family_name;
    }

    public String getTotal_insurance() {
        return total_insurance;
    }

    public void setTotal_insurance(String total_insurance) {
        this.total_insurance = total_insurance;
    }

    public String getTotal_premium() {
        return total_premium;
    }

    public void setTotal_premium(String total_premium) {
        this.total_premium = total_premium;
    }
}
