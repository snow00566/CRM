package cn.hospital.po;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public class User implements Serializable {
    private Integer id;
    private Integer sex;
    private String name;
    private Integer age;
    private String emile;
    private String whatsApp;
    private Integer diseases;//病种 21个
    private String phone;
    private Integer channels;//渠道 1推广;2免费
    private String country;
    private Integer website;//网站
    private Integer service;//客服
    private Integer watch;//值班人
    private String[] record;//沟通记录
    private Date commit;//提交时间
    private Date visit;//回访时间
    private Integer effective;//有效性。1无效、2待定、3需持续跟进、4高意向、5已来诊
  private Integer star;//5个

    public User() {
        super();
    }

    public User( Integer sex, String name, Integer age, String emile, String whatsApp, Integer diseases, String phone, Integer channels, String country, Integer website, Integer service, Integer watch, String[] record, Date commit, Date visit, Integer effective, Integer star) {
        super();
        this.id = id;
        this.sex = sex;
        this.name = name;
        this.age = age;
        this.emile = emile;
        this.whatsApp = whatsApp;
        this.diseases = diseases;
        this.phone = phone;
        this.channels = channels;
        this.country = country;
        this.website = website;
        this.service = service;
        this.watch = watch;
        this.record = record;
        this.commit = commit;
        this.visit = visit;
        this.effective = effective;
        this.star = star;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getWhatsApp() {
        return whatsApp;
    }

    public void setWhatsApp(String whatsApp) {
        whatsApp = whatsApp;
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

    public Integer getChannels() {
        return channels;
    }

    public void setChannels(Integer channels) {
        this.channels = channels;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getWebsite() {
        return website;
    }

    public void setWebsite(Integer website) {
        this.website = website;
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

    public String[] getRecord() {
        return record;
    }

    public void setRecord(String[] record) {
        this.record = record;
    }

    public Date getCommit() {
        return commit;
    }

    public void setCommit(Date commit) {
        this.commit = commit;
    }

    public Date getVisit() {
        return visit;
    }

    public void setVisit(Date visit) {
        this.visit = visit;
    }

    public Integer getEffective() {
        return effective;
    }

    public void setEffective(Integer effective) {
        this.effective = effective;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", sex=" + sex +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", emile='" + emile + '\'' +
                ", WhatsApp='" + whatsApp + '\'' +
                ", diseases=" + diseases +
                ", phone='" + phone + '\'' +
                ", channels=" + channels +
                ", country='" + country + '\'' +
                ", website=" + website +
                ", service=" + service +
                ", watch=" + watch +
                ", record=" + Arrays.toString(record) +
                ", commit=" + commit +
                ", visit=" + visit +
                ", effective=" + effective +
                ", star=" + star +
                '}';
    }
}
