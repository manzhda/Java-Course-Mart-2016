package parse.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mda on 5/19/16.
 */
public class Message {
    @SerializedName("type")
    @Expose
    private String myType;

    @SerializedName("message")
    @Expose
    private String message;


    public String getType() {
        return myType;
    }

    public String getMessage() {
        return message;
    }

    public void setType(String type) {
        this.myType = type;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
