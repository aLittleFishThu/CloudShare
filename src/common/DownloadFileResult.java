package common;



public class DownloadFileResult {
	private byte[] content;
	private FileResult result;
	
	/**
	 * 无参构造方法，默认获取失败
	 */
	public DownloadFileResult(){
		result=FileResult.wrong;
	}
	/**
	 * 一参数构造方法
	 * @param result
	 */
	public DownloadFileResult(FileResult result){
		this.result=result;
	}
	/**
	 * 两参数构造方法
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
