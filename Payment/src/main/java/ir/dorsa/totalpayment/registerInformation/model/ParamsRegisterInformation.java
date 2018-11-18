
package ir.dorsa.totalpayment.registerInformation.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ParamsRegisterInformation {

    @SerializedName("DeviceName")
    @Expose
    private String deviceName;
    @SerializedName("DeviceModel")
    @Expose
    private String deviceModel;
    @SerializedName("AppName")
    @Expose
    private String appName;
    @SerializedName("PkgName")
    @Expose
    private String pkgName;
    @SerializedName("Varsion")
    @Expose
    private String varsion;
    @SerializedName("UniqueCode")
    @Expose
    private String uniqueCode;
    @SerializedName("Number")
    @Expose
    private String number;

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getPkgName() {
        return pkgName;
    }

    public void setPkgName(String pkgName) {
        this.pkgName = pkgName;
    }

    public String getVarsion() {
        return varsion;
    }

    public void setVarsion(String varsion) {
        this.varsion = varsion;
    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}