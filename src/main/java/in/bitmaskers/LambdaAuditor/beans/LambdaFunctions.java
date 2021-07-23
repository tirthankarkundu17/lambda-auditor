
package in.bitmaskers.LambdaAuditor.beans;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class LambdaFunctions {

    @SerializedName("Functions")
    @Expose
    private List<Function> functions = null;

    public List<Function> getFunctions() {
        return functions;
    }

    public void setFunctions(List<Function> functions) {
        this.functions = functions;
    }

}
