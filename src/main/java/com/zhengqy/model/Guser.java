package com.zhengqy.model;


import com.alibaba.fastjson.JSONObject;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by zheng on 2016/12/20.
 */
@Entity
@Table(name = "g_user")
public class Guser  implements ModelInterface{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid",strategy = "uuid")
    private String uuid;//id
    @Column(name = "username")
    private String username;//用户名
    @Column(name = "password")
    private String password;//密码
    @Column(name = "realname")
    private String realname;//真实姓名
    @Column(name = "email")
    private String email;//电子邮箱
    @Column(name = "mobile")
    private String mobile;//手机号

    public Guser() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toJson() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("uuid",uuid);
        jsonObject.put("username",username);
        jsonObject.put("password",password);
        jsonObject.put("realname",realname);
        jsonObject.put("email",email);
        jsonObject.put("mobile",mobile);
        return jsonObject.toJSONString();
    }
}
