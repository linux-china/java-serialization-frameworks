package org.mvnsearch.serialization;

import java.io.Serializable;
import java.util.Date;

/**
 * User object
 *
 * @author linux_china
 */
public class User implements Serializable {
    private Long id;
    private String nick;
    private String email;
    private String phone;
    private Double balance;
    private Date bornAt;
    private Long flag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getBornAt() {
        return bornAt;
    }

    public void setBornAt(Date bornAt) {
        this.bornAt = bornAt;
    }

    public Long getFlag() {
        return flag;
    }

    public void setFlag(Long flag) {
        this.flag = flag;
    }
}
