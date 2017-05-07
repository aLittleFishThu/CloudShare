package common;

public class DownloadFileResult {
    public enum DownloadFileStatus {
        OK("OK"),unAuthorized("unAuthorized"),wrong("wrong"),
        unknownError("unknownError");
        
        private String status;
        /**
         * ˽�й��췽��
         * @param �ļ�����״̬
         */
        private DownloadFileStatus(String status){
          this.status=status;
        }
        /**
         * ��ȡ�ַ���
         */
        public String getStatus() {
          return status;
        }
    }
	private byte[] content;
	private DownloadFileStatus result;
	
	/**
	 * �޲ι��췽����Ĭ�ϻ�ȡʧ��
	 */
	public DownloadFileResult(){
		result=DownloadFileStatus.wrong;
	}
	/**
	 * һ�������췽��
	 * @param result
	 */
	public DownloadFileResult(DownloadFileStatus result){
		this.result=result;
	}
	/**
	 * ���������췽��
	 * @param content
	 * @param result
	 */
	public DownloadFileResult(byte[] content,DownloadFileStatus result){
		this.content=content;
		this.result=result;
	}
	public byte[] getContent() {
		return content;
	}
	public void setContent(byte[] content) {
		this.content = content;
	}
	public DownloadFileStatus getResult() {
		return result;
	}
	public void setResult(DownloadFileStatus result) {
		this.result = result;
	}
}

