package cn.hospital.po;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer id;
    private String username;
    private Integer age;
    private String emile;
    private Integer diseases;
    private String phone;
    private Integer website;
    private Integer status;
    private Integer service;//客服
    private Integer watch;//值班人
    private Integer day;//过期时间
    private Date date;
    private String remark;

    public User() {
        super();
    }

    public User(Integer id, String username, Integer age, String emile, Integer diseases, String phone, Integer website, Integer status, Integer service, Integer watch, Integer day) {
        super();
        this.id = id;
        this.username = username;
        this.age = age;
        this.emile = emile;
        this.diseases = diseases;
        this.phone = phone;
        this.website = website;
        this.status = status;
        this.service = service;
        this.watch = watch;
        this.day = day;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmile() {
        return emile;
    }

    public void setEmile(String emile) {
        this.emile = emile;
    }

    public Integer getDiseases() {
        return diseases;
    }

    public void setDiseases(Integer diseases) {
        this.diseases = diseases;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getWebsite() {
        return website;
    }

    public void setWebsite(Integer website) {
        this.website = website;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
    }

    public Integer getWatch() {
        return watch;
    }

    public void setWatch(Integer watch) {
        this.watch = watch;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", emile='" + emile + '\'' +
                ", diseases=" + diseases +
                ", phone='" + phone + '\'' +
                ", website=" + website +
                ", status=" + status +
                ", service=" + service +
                ", watch=" + watch +
                ", day=" + day +
                ", date=" + date +
                ", remark='" + remark + '\'' +
                '}';
    }
}
