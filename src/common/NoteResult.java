package common;

/**
 * �ļ��������
 * @author yzj
 * OK-�����ɹ� unAuthorized-δ��¼  wrong-�ļ������ڻ���Ȩ����
 * unknownError-δ֪����
 */
public enum NoteResult {
    OK("OK"),unAuthorized("unAuthorized"),wrong("wrong"),
    unknownError("unknownError");
    
    private String status;
    /**
     * ˽�й��췽��
     * @param ��ע����״̬
     */
    private NoteResult(String status){
      this.status=status;
    }
    /**
     * ��ȡ�ַ���
     */
    public String getStatus() {
      return status;
    }

}

