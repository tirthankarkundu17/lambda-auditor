
package in.bitmaskers.LambdaAuditor.beans;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class VpcConfig {

    @SerializedName("SubnetIds")
    @Expose
    private List<String> subnetIds = null;
    @SerializedName("SecurityGroupIds")
    @Expose
    private List<String> securityGroupIds = null;
    @SerializedName("VpcId")
    @Expose
    private String vpcId;

    public List<String> getSubnetIds() {
        return subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    public void setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

}
