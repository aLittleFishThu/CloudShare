package common;


import java.io.Serializable;
import java.util.HashSet;

/**
 * ����Ϊ�ļ���
 * @author yzj
 * ����ID�������ߡ��ļ������ϴ�ʱ�䡢Ȩ��
 */
@SuppressWarnings("serial")
public class CloudFile implements Serializable{
	private String fileID;   				//Ψһ��ʶ��
	private String creator;  				//������
	private String filename; 				//�ļ���
	private String uploadTime;				//�ϴ�ʱ��
	private Authorization authorization;	//Ȩ��
	private HashSet<String> openList;		//�����б�
	
	public CloudFile(){
		fileID="";creator="";filename="";uploadTime="";
		authorization=Authorization.Private;
		openList=new HashSet<String>();
	}
	
	public CloudFile(String fileName){
		fileID="";creator="";
		this.filename=fileName;uploadTime="";
		authorization=Authorization.Private;
		openList=new HashSet<String>();
	}
	
	/**
	 * ���������췽��
	 * @param creator
	 * @param fileName
	 */
	public CloudFile(String creator,String fileName){
		fileID="";this.creator=creator;
		this.filename=fileName;uploadTime="";
		authorization=Authorization.Private;
		openList=new HashSet<String>();
	}
	
	public String getFileID() {
		return fileID;
	}
	public void setFileID(String fileID) {
		this.fileID = fileID;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getUploadTime() {
		return uploadTime;
	}
	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}
	public HashSet<String> getOpenList() {
		return openList;
	}
	public void setOpenList(HashSet<String> openList) {
		this.openList = openList;
	}
	public Authorization getAuthorization() {
		return authorization;
	}
	public void setAuthorization(Authorization authorization) {
		this.authorization = authorization;
	}
	
	/**
	 * �ڿ����б������һ����
	 * @param userID
	 */
	public void addFriend(String userID){
		openList.add(userID);
	}
	/**
	 * �ڿ����б���ɾ��һ����
	 */
	public void deleteFriend(String userID){
		openList.remove(userID);
	}
	public String toString(){
		String s;
		s="("+fileID+","+creator+","+filename+","+uploadTime
				+","+authorization.getStatus()+","+openList.toString()+")";
		return s;
	}
	
    private void writeObject(java.io.ObjectOutputStream s)
            throws java.io.IOException {
        s.writeObject(fileID);
        s.writeObject(creator);
        s.writeObject(filename);
        s.writeObject(uploadTime);
        s.writeObject(authorization);
        s.writeObject(openList);
    }

    @SuppressWarnings("unchecked")
	private void readObject(java.io.ObjectInputStream s)
            throws java.io.IOException, ClassNotFoundException {
        fileID = (String) s.readObject();
        creator = (String) s.readObject();
        filename = (String) s.readObject();
        uploadTime= (String) s.readObject();
        authorization= (Authorization) s.readObject();
        openList = (HashSet<String>) s.readObject();
    }
}
