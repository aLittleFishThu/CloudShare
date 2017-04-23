package common;

/**
 * 标记注册状态
 * @author yzj
 * OK-注册成功
 * illegalID-用户名不合法
 * illegalPassword-密码不合法
 * usedID-用户名重复
 * notMatch-两次密码不匹配
 */
public enum RegisterResult {
    OK("OK"), illegalID("illegalID"), illegalPassword("illegalPassword"), 
    usedID("usedID"), notMatch("notMatch"),unknownError("unknownError");

    private String status;
	
	private RegisterResult(String status){
	  this.status=status;
	}
	/**
	 * 获取注册结果
	 * @return 注册结果
	 */
	public String getStatus() {
	  return status;
	}
	/**
	 * 设置注册结果
	 * @param status 注册结果
	 */
	public void setStatus(String status) {
	    this.status = status;
	}
}
