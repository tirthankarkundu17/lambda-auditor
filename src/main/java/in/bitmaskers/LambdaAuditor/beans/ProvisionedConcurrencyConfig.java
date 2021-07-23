
package in.bitmaskers.LambdaAuditor.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ProvisionedConcurrencyConfig {

    @SerializedName("FunctionArn")
    @Expose
    private String functionArn;
    @SerializedName("RequestedProvisionedConcurrentExecutions")
    @Expose
    private Integer requestedProvisionedConcurrentExecutions;
    @SerializedName("AvailableProvisionedConcurrentExecutions")
    @Expose
    private Integer availableProvisionedConcurrentExecutions;
    @SerializedName("AllocatedProvisionedConcurrentExecutions")
    @Expose
    private Integer allocatedProvisionedConcurrentExecutions;
    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("LastModified")
    @Expose
    private String lastModified;

    public String getFunctionArn() {
        return functionArn;
    }

    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    public Integer getRequestedProvisionedConcurrentExecutions() {
        return requestedProvisionedConcurrentExecutions;
    }

    public void setRequestedProvisionedConcurrentExecutions(Integer requestedProvisionedConcurrentExecutions) {
        this.requestedProvisionedConcurrentExecutions = requestedProvisionedConcurrentExecutions;
    }

    public Integer getAvailableProvisionedConcurrentExecutions() {
        return availableProvisionedConcurrentExecutions;
    }

    public void setAvailableProvisionedConcurrentExecutions(Integer availableProvisionedConcurrentExecutions) {
        this.availableProvisionedConcurrentExecutions = availableProvisionedConcurrentExecutions;
    }

    public Integer getAllocatedProvisionedConcurrentExecutions() {
        return allocatedProvisionedConcurrentExecutions;
    }

    public void setAllocatedProvisionedConcurrentExecutions(Integer allocatedProvisionedConcurrentExecutions) {
        this.allocatedProvisionedConcurrentExecutions = allocatedProvisionedConcurrentExecutions;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

}
