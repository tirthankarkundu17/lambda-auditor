
package in.bitmaskers.LambdaAuditor.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Function {

    @SerializedName("FunctionName")
    @Expose
    private String functionName;
    @SerializedName("FunctionArn")
    @Expose
    private String functionArn;
    @SerializedName("Runtime")
    @Expose
    private String runtime;
    @SerializedName("Role")
    @Expose
    private String role;
    @SerializedName("Handler")
    @Expose
    private String handler;
    @SerializedName("CodeSize")
    @Expose
    private Integer codeSize;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("Timeout")
    @Expose
    private Integer timeout;
    @SerializedName("MemorySize")
    @Expose
    private Integer memorySize;
    @SerializedName("LastModified")
    @Expose
    private String lastModified;
    @SerializedName("CodeSha256")
    @Expose
    private String codeSha256;
    @SerializedName("Version")
    @Expose
    private String version;
    @SerializedName("VpcConfig")
    @Expose
    private VpcConfig vpcConfig;
    @SerializedName("Environment")
    @Expose
    private Environment environment;
    @SerializedName("TracingConfig")
    @Expose
    private TracingConfig tracingConfig;
    @SerializedName("RevisionId")
    @Expose
    private String revisionId;
    @SerializedName("PackageType")
    @Expose
    private String packageType;

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getFunctionArn() {
        return functionArn;
    }

    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public Integer getCodeSize() {
        return codeSize;
    }

    public void setCodeSize(Integer codeSize) {
        this.codeSize = codeSize;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public Integer getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getCodeSha256() {
        return codeSha256;
    }

    public void setCodeSha256(String codeSha256) {
        this.codeSha256 = codeSha256;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public VpcConfig getVpcConfig() {
        return vpcConfig;
    }

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public TracingConfig getTracingConfig() {
        return tracingConfig;
    }

    public void setTracingConfig(TracingConfig tracingConfig) {
        this.tracingConfig = tracingConfig;
    }

    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

}
