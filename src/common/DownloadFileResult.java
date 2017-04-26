package common;



public class DownloadFileResult {
	private byte[] content;
	private FileResult result;
	
	/**
	 * �޲ι��췽����Ĭ�ϻ�ȡʧ��
	 */
	public DownloadFileResult(){
		result=FileResult.wrong;
	}
	/**
	 * һ�������췽��
	 * @param result
	 */
	public DownloadFileResult(FileResult result){
		this.result=result;
	}
	/**
	 * ���������췽��
	 * @param content
	 * @param result
	 */
	public DownloadFileResult(byte[] content,FileResult result){
		this.content=content;
		this.result=result;
	}
	public byte[] getContent() {
		return content;
	}
	public void setContent(byte[] content) {
		this.content = content;
	}
	public FileResult getResult() {
		return result;
	}
	public void setResult(FileResult result) {
		this.result = result;
	}
	
}
