package common;

/**
 * ���ע��״̬
 * @author yzj
 * OK-ע��ɹ�
 * illegalID-�û������Ϸ�
 * illegalPassword-���벻�Ϸ�
 * usedID-�û����ظ�
 * notMatch-�������벻ƥ��
 */
public enum RegisterResult {
    OK("OK"), illegalID("illegalID"), illegalPassword("illegalPassword"), 
    usedID("usedID"), notMatch("notMatch"),unknownError("unknownError");

    private String status;
	
	private RegisterResult(String status){
	  this.status=status;
	}
	/**
	 * ��ȡע����
	 * @return ע����
	 */
	public String getStatus() {
	  return status;
	}
	/**
	 * ����ע����
	 * @param status ע����
	 */
	public void setStatus(String status) {
	    this.status = status;
	}
}
