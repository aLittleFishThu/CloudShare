package common;

/**
 * ɾ���ļ��������
 * @author yzj
 * OK-�����ɹ� unAuthorized-δ��¼  wrong-�ļ�/�û������ڻ���Ȩ����
 * repeatedName-�������ļ�����ͻ unknownError-δ֪����
 */
public enum RenameFileResult {
    OK("OK"),unAuthorized("unAuthorized"),wrong("wrong"),
    repeatedName("repeatedName"),unknownError("unknownError");
    
    private String status;
    /**
     * ˽�й��췽��
     * @param �ļ�����״̬
     */
    private RenameFileResult(String status){
      this.status=status;
    }
    /**
     * ��ȡ�ַ���
     */
    public String getStatus() {
      return status;
    }
}

