package common;

import java.util.HashSet;

/**
 * 下载文件目录结果
 * @author yzj
 * 包括文件信息构成的HashSet和下载结果
 */
public class FileDirectoryResult {
	private HashSet<CloudFile> fileDirectory;
	private FileResult result;
	
	/**
	 * 无参构造方法，默认获取失败
	 */
	public FileDirectoryResult(){
		fileDirectory=new HashSet<CloudFile>();
		result=FileResult.wrong;
	}
	/**
	 * 一参数构造方法
	 * @param result
	 */
	public FileDirectoryResult(FileResult result){
		fileDirectory=new HashSet<CloudFile>();
		this.result=result;
	}
	/**
	 * 两参数构造方法
	 * @param fileDirectory
	 * @param result
	 */
	public FileDirectoryResult(HashSet<CloudFile> fileDirectory,FileResult result){
		this.fileDirectory=fileDirectory;
		this.result=result;
	}
	
	public HashSet<CloudFile> getFileDirectory() {
		return fileDirectory;
	}
	public void setFileDirectory(HashSet<CloudFile> fileDirectory) {
		this.fileDirectory = fileDirectory;
	}
	public FileResult getResult() {
		return result;
	}
	public void setResult(FileResult result) {
		this.result = result;
	}
}
