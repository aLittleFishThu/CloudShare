package common;

import java.io.Serializable;


@SuppressWarnings("serial")
public class Note implements Serializable{
    private String noteID;                  //Ψһ��ʶ��
    private String content;                 //��ע����
    private String fileID;                  //�ļ�ID
    private String creator;                 //������
    private String uploadTime;              //�ϴ�ʱ��
    
    /**
     * �޲ι��췽��
     */
    public Note(){
        noteID="";
        content="";
        fileID="";
        creator="";
        uploadTime="";
    }
    
    /**
     * ���������췽��
     * @param content
     * @param fileID
     */
    public Note(String content,String fileID){
        this.content=content;
        this.fileID=fileID;
        noteID="";creator="";uploadTime="";
    }
   
    /**
     * ���������췽��
     * @param content
     * @param fileID
     * @param creator
     */
    public Note(String content,String fileID,String creator){
        this.content=content;
        this.fileID=fileID;
        this.creator=creator;
        noteID="";uploadTime="";
    }
    
    public String getNoteID() {
        return noteID;
    }
    public void setNoteID(String noteID) {
        this.noteID = noteID;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
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
    public String getUploadTime() {
        return uploadTime;
    }
    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }
    
    @Override
    /**
     * ��дequals����
     * fileID��noteID��ͬ��Ϊ������ע��ȫ��ͬ
     */
    public boolean equals(Object object){
        if (this==object)   //������ͬ��ֱ�ӷ���true
            return true;
        if (object instanceof Note){     //������ͬ
            Note note2=(Note) object;    //ǿ��ת������
            if (this.fileID.equals(note2.getFileID())&&(this.noteID.equals(note2.getNoteID())))
                return true;
            else return false;
        }
        else
            return false;    //���Ͳ�ͬ��ֱ�ӷ���false       
    }
    
    public String toString(){
        String s;
        s="("+noteID+","+content+","+fileID+","+creator+","+uploadTime+")";
        return s;
    }
    
    private void writeObject(java.io.ObjectOutputStream s)
            throws java.io.IOException {
        s.writeObject(noteID);
        s.writeObject(content);
        s.writeObject(fileID);
        s.writeObject(creator);
        s.writeObject(uploadTime);
    }

    private void readObject(java.io.ObjectInputStream s)
            throws java.io.IOException, ClassNotFoundException {
        noteID =(String) s.readObject();
        content=(String) s.readObject();
        fileID = (String) s.readObject();
        creator = (String) s.readObject();
        uploadTime= (String) s.readObject();
    }
}
