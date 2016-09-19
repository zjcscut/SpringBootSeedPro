package cn.zjc.domain;



import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @author zhangjinci
 * @version 2016/9/19 16:05
 * @function
 */
public class User {

    private Integer id;
    private String name;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date birth;

    public User(Integer id, String name,Date birth) {
        this.id = id;
        this.name = name;
        this.birth = birth;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}
