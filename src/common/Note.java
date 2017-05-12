package common;

import java.io.Serializable;


@SuppressWarnings("serial")
public class Note implements Serializable,Comparable<Note>{
    private String noteID;                  //唯一标识符
    private String content;                 //备注内容
    private String fileID;                  //文件ID
    private String creator;                 //创建者
    private String uploadTime;              //上传时间
    
    /**
     * 无参构造方法
     */
    public Note(){
        noteID="";
        content="";
        fileID="";
        creator="";
        uploadTime="";
    }
    
    /**
     * 两参数构造方法
     * @param content
     * @param fileID
     */
    public Note(String content,String fileID){
        this.content=content;
        this.fileID=fileID;
        noteID="";creator="";uploadTime="";
    }
   
    /**
     * 三参数构造方法
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
     * 改写equals方法
     * fileID和noteID相同认为两个备注完全相同
     */
    public boolean equals(Object object){
        if (this==object)   //引用相同，直接返回true
            return true;
        if (object instanceof Note){     //类型相同
            Note note2=(Note) object;    //强制转换类型
            if (this.fileID.equals(note2.getFileID())&&(this.noteID.equals(note2.getNoteID())))
                return true;
            else return false;
        }
        else
            return false;    //类型不同，直接返回false       
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

    @Override
    public int compareTo(Note o) {
        int result=this.uploadTime.compareTo(o.getUploadTime());
        if (result==0)
           return this.creator.compareTo(o.getCreator()); 
        else
            return result;
    }
}
