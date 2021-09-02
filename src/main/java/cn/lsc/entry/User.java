package cn.lsc.entry;

import javax.xml.crypto.Data;

/**
 * <p>
 * 用户类
 * </p>
 *
 * @author lushengcheng
 * @since 2021/8/31 20:05
 */
public class User {

    /**
     * 用户名
     */
    private String userName;

    /**
     * id
     */
    private String id;

    /**
     * 密码
     */
    private String password;

    /**
     * 创建时间
     */
    private Data createTime;
    /**
     * 修改时间
     */
    private Data updateTime;

    /**
     * 是否删除标志
     */
    private int del;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Data getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Data createTime) {
        this.createTime = createTime;
    }

    public Data getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Data updateTime) {
        this.updateTime = updateTime;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }

}
