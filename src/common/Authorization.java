package common;

/**
 * ���Ȩ��
 * @author yzj
 * 
 */
public enum Authorization {
	
	Public("Public"), Private("private"),toFriend("toFriend"),unknownError("unknowError");

    private String status;
    /**
     * ˽�й��췽��
     * @param ��¼״̬
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
