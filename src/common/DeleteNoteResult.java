package common;

/**
 * ��ע�������
 * @author yzj
 * OK-�����ɹ� unAuthorized-δ��¼  wrong-�ļ�/��ע�����ڻ���Ȩ����
 * unknownError-δ֪����
 */
public enum DeleteNoteResult {
    OK("OK"),unAuthorized("unAuthorized"),wrong("wrong"),
    unknownError("unknownError");
    
    private String status;
    /**
     * ˽�й��췽��
     * @param ��ע����״̬
     */
    private DeleteNoteResult(String status){
      this.status=status;
    }
    /**
     * ��ȡ�ַ���
     */
    public String getStatus() {
      return status;
    }

}

