package cn.lsc.entry;

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
    private String name;

    /**
     * id
     */
    private String id;

    /**
     * 密码
     */
    private String password;

    /**
     * 电话
     */
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
