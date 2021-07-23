
package in.bitmaskers.LambdaAuditor.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class TracingConfig {

    @SerializedName("Mode")
    @Expose
    private String mode;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

}
