package cn.hospital.po;

import java.io.Serializable;

public class Staff implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private Integer identity;

    public Staff() {
        super();
    }

    public Staff(Integer id, String username, String password, Integer identity) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.identity = identity;
    }

    public Staff(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
