package retrofit.com.example.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

// json object class to parse data
public class result {

    @SerializedName("_id")
    @Expose
    private String _id;

    @SerializedName("averageRating")
    @Expose
    private String averageRating;

    // setter & getter

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(String averageRating) {
        this.averageRating = averageRating;
    }
}
