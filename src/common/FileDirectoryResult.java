package common;

import java.util.ArrayList;

/**
 * 下载文件目录结果
 * @author yzj
 * 包括文件信息构成的HashSet和下载结果
 */
public class FileDirectoryResult {
	private ArrayList<CloudFile> fileDirectory;
	private FileResult result;
	
	/**
	 * 无参构造方法，默认获取失败
	 */
	public FileDirectoryResult(){
		fileDirectory=new ArrayList<CloudFile>();
		result=FileResult.wrong;
	}
	/**
	 * 一参数构造方法
	 * @param result
	 */
	public FileDirectoryResult(FileResult result){
		fileDirectory=new ArrayList<CloudFile>();
		this.result=result;
	}
	/**
	 * 两参数构造方法
	 * @param fileDirectory
	 * @param result
	 */
	public FileDirectoryResult(ArrayList<CloudFile> fileDirectory,FileResult result){
		this.fileDirectory=fileDirectory;
		this.result=result;
	}
	
	public ArrayList<CloudFile> getFileDirectory() {
		return fileDirectory;
	}
	public void setFileDirectory(ArrayList<CloudFile> fileDirectory) {
		this.fileDirectory = fileDirectory;
	}
	public FileResult getResult() {
		return result;
	}
	public void setResult(FileResult result) {
		this.result = result;
	}
}
