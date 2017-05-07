package common;

import java.util.ArrayList;

/**
 * 下载文件目录结果
 * @author yzj
 * 包括文件信息构成的ArrayList和下载结果
 */



public class FileDirectoryResult {
    public enum FileDirectoryStatus {
        OK("OK"),unAuthorized("unAuthorized"),wrong("wrong"),
        unknownError("unknownError");
        
        private String status;
        /**
         * 私有构造方法
         * @param 文件操作状态
         */
        private FileDirectoryStatus(String status){
          this.status=status;
        }
        /**
         * 获取字符串
         */
        public String getStatus() {
          return status;
        }
    }
	private ArrayList<CloudFile> fileDirectory;
	private FileDirectoryStatus result;
	
	/**
	 * 无参构造方法，默认获取失败
	 */
	public FileDirectoryResult(){
		fileDirectory=new ArrayList<CloudFile>();
		result=FileDirectoryStatus.wrong;
	}
	/**
	 * 一参数构造方法
	 * @param result
	 */
	public FileDirectoryResult(FileDirectoryStatus result){
		fileDirectory=new ArrayList<CloudFile>();
		this.result=result;
	}
	/**
	 * 两参数构造方法
	 * @param fileDirectory
	 * @param result
	 */
	public FileDirectoryResult(ArrayList<CloudFile> fileDirectory,FileDirectoryStatus result){
		this.fileDirectory=fileDirectory;
		this.result=result;
	}
	
	public ArrayList<CloudFile> getFileDirectory() {
		return fileDirectory;
	}
	public void setFileDirectory(ArrayList<CloudFile> fileDirectory) {
		this.fileDirectory = fileDirectory;
	}
	public FileDirectoryStatus getResult() {
		return result;
	}
	public void setResult(FileDirectoryStatus result) {
		this.result = result;
	}
}
