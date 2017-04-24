package common;

/**
 * 标记权限
 * @author yzj
 * 
 */
public enum Authorization {
	
	Public("Public"), Private("private"),toFriend("toFriend"),unknownError("unknowError");

    private String status;
    /**
     * 私有构造方法
     * @param 登录状态
     */
    private Authorization(String status){
      this.status=status;
    }
    
 
    public String getStatus() {
      return status;
    }
 
    public void setStatus(String status) {
      this.status = status;
    }
}
