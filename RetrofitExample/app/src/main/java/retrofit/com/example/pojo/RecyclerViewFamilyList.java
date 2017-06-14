package retrofit.com.example.pojo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RecyclerViewFamilyList {
    @SerializedName("response")
    @Expose
    private response[] familyListings;

    public response[] getFamilyListings() {
        return familyListings;
    }

    public void setFamilyListings(response[] familyListings) {
        this.familyListings = familyListings;
    }
}

