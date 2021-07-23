
package in.bitmaskers.LambdaAuditor.beans;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ProvisionedConcurrencyConfigs {

    @SerializedName("ProvisionedConcurrencyConfigs")
    @Expose
    private List<ProvisionedConcurrencyConfig> provisionedConcurrencyConfigs = null;

    public List<ProvisionedConcurrencyConfig> getProvisionedConcurrencyConfigs() {
        return provisionedConcurrencyConfigs;
    }

    public void setProvisionedConcurrencyConfigs(List<ProvisionedConcurrencyConfig> provisionedConcurrencyConfigs) {
        this.provisionedConcurrencyConfigs = provisionedConcurrencyConfigs;
    }

}
