package cn.lsc.common;

/**
 * <p>
 * 返回结果
 * </p>
 *
 * @author lushengcheng
 * @since 2021/8/31 19:43
 */
public class Result {

    /**
     * 返回状态码
     */
    private Integer code = 0;
    /**
     * 提示信息
     */
    private String message = "数据获取失败";

    /**
     * 返回的结果集
     */
    Object data;


    public Result(){}

    public Result(Object data) {
        this.data = data;
        this.code = 1;
        this.message = "数据获取成功！";
    }

    public Result(String message) {
        this.message = message;
    }

    public Result(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
