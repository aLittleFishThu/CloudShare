package common;

/**
 * ��ǵ�¼״̬
 * @author yzj
 * OK-��¼�ɹ�
 * wrong-��¼ʧ��
 */
public enum LoginResult {
	OK("OK"), wrong("wrong"),unknownError("unknownError");

    private String status;
    /**
     * ˽�й��췽��
     * @param ��¼״̬
     */
    private LoginResult(String status){
      this.status=status;
    }
    /**
     * ��ȡ��¼״̬
     */
    public String getStatus() {
      return status;
    }
    /**
     * �趨��¼״̬
     */
    public void setStatus(String status) {
      this.status = status;
    }
}
