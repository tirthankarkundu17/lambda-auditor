
package in.bitmaskers.LambdaAuditor.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Variables {

    @SerializedName("DB_PASS")
    @Expose
    private String dbPass;
    @SerializedName("DB_USER")
    @Expose
    private String dbUser;
    @SerializedName("DB_HOST")
    @Expose
    private String dbHost;
    @SerializedName("BUCKET_NAME")
    @Expose
    private String bucketName;
    @SerializedName("REGION")
    @Expose
    private String region;

    public String getDbPass() {
        return dbPass;
    }

    public void setDbPass(String dbPass) {
        this.dbPass = dbPass;
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public String getDbHost() {
        return dbHost;
    }

    public void setDbHost(String dbHost) {
        this.dbHost = dbHost;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

}
