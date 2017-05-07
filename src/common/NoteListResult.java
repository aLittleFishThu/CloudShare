package common;

import java.util.ArrayList;

/**
 * ���ر�ע���
 * @author yzj
 * ������ע���ɵ�ArrayList�����ؽ��
 */



public class NoteListResult {
    public enum NoteListStatus {
        OK("OK"),unAuthorized("unAuthorized"),wrong("wrong"),
        unknownError("unknownError");
        
        private String status;
        /**
         * ˽�й��췽��
         * @param ��ע����״̬
         */
        private NoteListStatus(String status){
          this.status=status;
        }
        /**
         * ��ȡ�ַ���
         */
        public String getStatus() {
          return status;
        }
    }
	private ArrayList<Note> noteList;
	private NoteListStatus result;
	
	/**
	 * �޲ι��췽����Ĭ�ϻ�ȡʧ��
	 */
	public NoteListResult(){
		setNoteList(new ArrayList<Note>());
		result=NoteListStatus.wrong;
	}
	/**
	 * һ�������췽��
	 * @param result
	 */
	public NoteListResult(NoteListStatus result){
		setNoteList(new ArrayList<Note>());
		this.result=result;
	}
	/**
	 * ���������췽��
	 * @param noteList
	 * @param result
	 */
	public NoteListResult(ArrayList<Note> noteList,NoteListStatus result){
		this.setNoteList(noteList);
		this.result=result;
	}
		
	public NoteListStatus getResult() {
		return result;
	}
	public void setResult(NoteListStatus result) {
		this.result = result;
	}
    public ArrayList<Note> getNoteList() {
        return noteList;
    }
    public void setNoteList(ArrayList<Note> noteList) {
        this.noteList = noteList;
    }
}
