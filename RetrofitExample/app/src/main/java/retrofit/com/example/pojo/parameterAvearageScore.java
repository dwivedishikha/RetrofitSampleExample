package retrofit.com.example.pojo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

// json array class to parse data
public class parameterAvearageScore {
    @SerializedName("parameterName")
    @Expose
    private String parameterName;

    @SerializedName("sum")
    @Expose
    private String sum;

    @SerializedName("count")
    @Expose
    private String count;

    // setter & getter

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
