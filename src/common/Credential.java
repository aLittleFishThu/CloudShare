package common;

/**
 *����Ϊ�����֤��Ϣ�࣬���ڵ�¼ע��ʱ���������֤ 
 *@author yzj
 */
public class Credential {
    private String userID;
    private String password;
    /**
     * ���췽��
     * @param �û���
     * @param ����
     */
    public Credential(String userID, String password){
    	this.userID=userID;
    	this.password=password;
    }
    /**
     * ����û���
     * @return �û���
     */
    public String getUserID(){
    	return userID;
    }
    /**
     * �������
     * @return ����
     */
    public String getPassword(){
    	return password;
    }
}
