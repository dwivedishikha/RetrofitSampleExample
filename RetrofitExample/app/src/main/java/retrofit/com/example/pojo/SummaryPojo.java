package retrofit.com.example.pojo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class SummaryPojo {

    // values defined in json object
    @SerializedName("status_code")
    @Expose
    private String status_code;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("numberOfYes")
    @Expose
    private String numberOfYes;
    @SerializedName("numberOfNo")
    @Expose
    private String numberOfNo;
    @SerializedName("apiCall")
    @Expose
    private String apiCall;

    // creating class to parse json array defined inside json object
    @SerializedName("parameterAvearageScore")
    @Expose
    public ArrayList<parameterAvearageScore> parameterAvearageScore ;

    // creating class to parse nested json object
    @SerializedName("result")
    @Expose
    public retrofit.com.example.pojo.result result;


    public retrofit.com.example.pojo.result getResult() {
        return result;
    }

    public void setResult(retrofit.com.example.pojo.result result) {
        this.result = result;
    }

    public String getStatus_code() {
        return status_code;
    }

    public void setStatus_code(String status_code) {
        this.status_code = status_code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNumberOfYes() {
        return numberOfYes;
    }

    public void setNumberOfYes(String numberOfYes) {
        this.numberOfYes = numberOfYes;
    }

    public String getNumberOfNo() {
        return numberOfNo;
    }

    public void setNumberOfNo(String numberOfNo) {
        this.numberOfNo = numberOfNo;
    }

    public String getApiCall() {
        return apiCall;
    }

    public void setApiCall(String apiCall) {
        this.apiCall = apiCall;
    }


    /*public class parameterAvearageScore {

        @SerializedName("parameterName")
        @Expose
        private String parameterName;

        @SerializedName("sum")
        @Expose
        private String sum;

        @SerializedName("count")
        @Expose
        private String count;

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
    }*/
}
