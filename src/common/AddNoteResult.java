package common;

/**
 * �ļ��������
 * @author yzj
 * OK-�����ɹ� unAuthorized-δ��¼  wrong-�ļ������ڻ���Ȩ���� tooLong-��ע̫��
 * unknownError-δ֪����
 */
public enum AddNoteResult {
    OK("OK"),unAuthorized("unAuthorized"),wrong("wrong"),tooLong("tooLong"),
    unknownError("unknownError");
    
    private String status;
    /**
     * ˽�й��췽��
     * @param ��ע����״̬
     */
    private AddNoteResult(String status){
      this.status=status;
    }
    /**
     * ��ȡ�ַ���
     */
    public String getStatus() {
      return status;
    }

}

