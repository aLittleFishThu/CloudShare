package common;

import java.util.ArrayList;

/**
 * �����ļ�Ŀ¼���
 * @author yzj
 * �����ļ���Ϣ���ɵ�ArrayList�����ؽ��
 */



public class FileDirectoryResult {
    public enum FileDirectoryStatus {
        OK("OK"),unAuthorized("unAuthorized"),wrong("wrong"),
        unknownError("unknownError");
        
        private String status;
        /**
         * ˽�й��췽��
         * @param �ļ�����״̬
         */
        private FileDirectoryStatus(String status){
          this.status=status;
        }
        /**
         * ��ȡ�ַ���
         */
        public String getStatus() {
          return status;
        }
    }
	private ArrayList<CloudFile> fileDirectory;
	private FileDirectoryStatus result;
	
	/**
	 * �޲ι��췽����Ĭ�ϻ�ȡʧ��
	 */
	public FileDirectoryResult(){
		fileDirectory=new ArrayList<CloudFile>();
		result=FileDirectoryStatus.wrong;
	}
	/**
	 * һ�������췽��
	 * @param result
	 */
	public FileDirectoryResult(FileDirectoryStatus result){
		fileDirectory=new ArrayList<CloudFile>();
		this.result=result;
	}
	/**
	 * ���������췽��
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
