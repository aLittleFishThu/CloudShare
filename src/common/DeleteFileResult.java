package common;

/**
 * ɾ���ļ��������
 * @author yzj
 * OK-�����ɹ� unAuthorized-δ��¼  wrong-�ļ�/�û������ڻ���Ȩ����
 * unknownError-δ֪����
 */
public enum DeleteFileResult {
    OK("OK"),unAuthorized("unAuthorized"),wrong("wrong"),
    unknownError("unknownError");
    
    private String status;
    /**
     * ˽�й��췽��
     * @param �ļ�����״̬
     */
    private DeleteFileResult(String status){
      this.status=status;
    }
    /**
     * ��ȡ�ַ���
     */
    public String getStatus() {
      return status;
    }
}

