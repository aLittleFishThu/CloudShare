package common;

import java.util.ArrayList;

/**
 * �����ļ�Ŀ¼���
 * @author yzj
 * �����ļ���Ϣ���ɵ�HashSet�����ؽ��
 */
public class FileDirectoryResult {
	private ArrayList<CloudFile> fileDirectory;
	private FileResult result;
	
	/**
	 * �޲ι��췽����Ĭ�ϻ�ȡʧ��
	 */
	public FileDirectoryResult(){
		fileDirectory=new ArrayList<CloudFile>();
		result=FileResult.wrong;
	}
	/**
	 * һ�������췽��
	 * @param result
	 */
	public FileDirectoryResult(FileResult result){
		fileDirectory=new ArrayList<CloudFile>();
		this.result=result;
	}
	/**
	 * ���������췽��
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
