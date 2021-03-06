package common;

/**
 * 标记修改密码状态
 * @author yzj
 * OK-修改成功
 * illegalPassword-密码非法
 * notMatch-两次密码不匹配
 * wrong-旧密码错误
 */
public enum ChangePasswdResult {
    OK("OK"),illegalPassword("illegalPassword"),notMatch("notMatch"),
    	wrong("wrong"),unknownError("unknownError"),unAuthorized("unAuthorized");

    private String status;
    /**
     * 私有构造方法
     * @param status
     */
    private ChangePasswdResult(String status){
      this.status=status;
    }
    /**
     * 获得修改密码结果
     * return：修改密码结果
     */
    public String getStatus() {
      return status;
    }
}
