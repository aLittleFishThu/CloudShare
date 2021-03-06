package common;

public class DownloadFileResult {
    public enum DownloadFileStatus {
        OK("OK"),unAuthorized("unAuthorized"),wrong("wrong"),
        unknownError("unknownError");
        
        private String status;
        /**
         * 私有构造方法
         * @param 文件操作状态
         */
        private DownloadFileStatus(String status){
          this.status=status;
        }
        /**
         * 获取字符串
         */
        public String getStatus() {
          return status;
        }
    }
	private byte[] content;
	private DownloadFileStatus result;
	
	/**
	 * 无参构造方法，默认获取失败
	 */
	public DownloadFileResult(){
		result=DownloadFileStatus.wrong;
	}
	/**
	 * 一参数构造方法
	 * @param result
	 */
	public DownloadFileResult(DownloadFileStatus result){
		this.result=result;
	}
	/**
	 * 两参数构造方法
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

