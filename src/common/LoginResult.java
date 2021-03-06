package common;

/**
 * 标记登录状态
 * @author yzj
 * OK-登录成功
 * wrong-登录失败
 */
public enum LoginResult {
	OK("OK"), wrong("wrong"),unknownError("unknownError");

    private String status;
    /**
     * 私有构造方法
     * @param 登录状态
     */
    private LoginResult(String status){
      this.status=status;
    }
    /**
     * 获取登录状态
     */
    public String getStatus() {
      return status;
    }
}
