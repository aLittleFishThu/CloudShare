package common;

/**
 * ����޸�����״̬
 * @author yzj
 * OK-�޸ĳɹ�
 * illegalPassword-����Ƿ�
 * notMatch-�������벻ƥ��
 * wrong-���������
 */
public enum ChangePasswdResult {
    OK("OK"),illegalPassword("illegalPassword"),notMatch("notMatch"),
    	wrong("wrong"),unknownError("unknownError"),unAuthorized("unAuthorized");

    private String status;
    /**
     * ˽�й��췽��
     * @param status
     */
    private ChangePasswdResult(String status){
      this.status=status;
    }
    /**
     * ����޸�������
     * return���޸�������
     */
    public String getStatus() {
      return status;
    }
}
