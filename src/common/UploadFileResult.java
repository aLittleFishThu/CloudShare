package common;

/**
 * �ϴ��ļ��������
 * @author yzj
 * OK-�����ɹ� unAuthorized-δ��¼  wrong-�ļ�/�û������ڻ���Ȩ����
 * tooLarge-�ļ�̫�� unknownError-δ֪����
 */
public enum UploadFileResult {
    OK("OK"),unAuthorized("unAuthorized"),wrong("wrong"),tooLarge("tooLarge"),
    unknownError("unknownError");
    
    private String status;
    /**
     * ˽�й��췽��
     * @param �ļ�����״̬
     */
    private UploadFileResult(String status){
      this.status=status;
    }
    /**
     * ��ȡ�ַ���
     */
    public String getStatus() {
      return status;
    }
}

