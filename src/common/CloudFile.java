package common;


import java.io.Serializable;
import java.util.HashSet;

/**
 * 该类为文件类
 * @author yzj
 * 包含ID、创建者、文件名、上传时间、权限
 */
@SuppressWarnings("serial")
public class CloudFile implements Serializable,Comparable<CloudFile>{
	private String fileID;   		//唯一标识符
	private String creator;  		//创建者
	private String filename; 		//文件名
	private String uploadTime;		//上传时间
	private Authorization authorization;	//权限
	private HashSet<String> openList;       //开放列表
	
	public CloudFile(){
		fileID="";creator="";filename="";uploadTime="";
		authorization=Authorization.self;
		openList=new HashSet<String>();
	}
	
	public CloudFile(String fileName){
		fileID="";creator="";
		this.filename=fileName;uploadTime="";
		authorization=Authorization.self;
		openList=new HashSet<String>();
	}
	
	/**
	 * 两参数构造方法
	 * @param creator
	 * @param fileName
	 */
	public CloudFile(String creator,String fileName){
		fileID="";this.creator=creator;
		this.filename=fileName;uploadTime="";
		authorization=Authorization.self;
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
		if (authorization.equals(Authorization.self))
		    openList=new HashSet<String>();
	}
	
	/**
	 * 在开放列表里添加一个人
	 * @param userID
	 */
	public void addFriend(String userID){
		openList.add(userID);
	}
	/**
	 * 在开放列表里删除一个人
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
	@Override
	/**
	 * 改写equals方法
	 * fileID相同认为两个文件完全相同
	 */
	public boolean equals(Object object){
	   	if (this==object)   //引用相同，直接返回true
    		return true;
    	if (object instanceof CloudFile){     //类型相同
    		CloudFile cloudFile2=(CloudFile) object;    //强制转换类型
    		if (this.fileID.equals(cloudFile2.getFileID()))
    			return true;
    		else return false;
    	}
    	else
    		return false;    //类型不同，直接返回false		
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

    @Override
    public int compareTo(CloudFile o) {
        int result=this.uploadTime.compareTo(o.getUploadTime());
        if (result==0)
           return this.filename.compareTo(o.getFilename()); 
        else
            return result;
    }
}
