
package in.bitmaskers.LambdaAuditor.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Environment {

    @SerializedName("Variables")
    @Expose
    private Variables variables;

    public Variables getVariables() {
        return variables;
    }

    public void setVariables(Variables variables) {
        this.variables = variables;
    }

}
