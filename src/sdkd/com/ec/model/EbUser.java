package sdkd.com.ec.model;

import java.util.Date;

/**
 * Created by Flower on 2016/7/5.
 */
public class EbUser {
    private  int eu_user_id;
    private  String eu_user_name;
    private  String eu_password;
    private  int eu_sex;
    private  Date eu_birthday;
    private  String eu_identity_code;
    private  String eu_email;
    private  String eu_mobile;
    private  String eu_address;
    private  int eu_status;

    public void setEu_user_id(int eu_user_id) {
        this.eu_user_id = eu_user_id;
    }

    public int getEu_user_id() {
        return eu_user_id;
    }

    public void setEu_user_name(String eu_user_name) {
        this.eu_user_name = eu_user_name;
    }

    public String getEu_user_name() {
        return eu_user_name;
    }

    public void setEu_password(String eu_password) {
        this.eu_password = eu_password;
    }

    public String getEu_password() {
        return eu_password;
    }

    public void setEu_sex(int eu_sex) {
        this.eu_sex = eu_sex;
    }

    public int getEu_sex() {
        return eu_sex;
    }

    public void setEu_birthday(Date eu_birthday) {
        this.eu_birthday = eu_birthday;
    }

    public Date getEu_birthday() {
        return eu_birthday;
    }

    public void setEu_identity_code(String eu_identity_code) {
        this.eu_identity_code = eu_identity_code;
    }

    public String getEu_identity_code() {
        return eu_identity_code;
    }

    public void setEu_mobile(String eu_mobile) {
        this.eu_mobile = eu_mobile;
    }

    public String getEu_mobile() {
        return eu_mobile;
    }

    public void setEu_address(String eu_address) {
        this.eu_address = eu_address;
    }

    public String getEu_address() {
        return eu_address;
    }

    public void setEu_status(int eu_status) {
        this.eu_status = eu_status;
    }

    public int getEu_status() {
        return eu_status;
    }

    public String getEu_email() {
        return eu_email;
    }

    public void setEu_email(String eu_email) {
        this.eu_email = eu_email;
    }
}
