package common;

import java.io.Serializable;


/**
 * ����Ϊ�û���
 * �����û���������
 * @author yzj
 */
@SuppressWarnings("serial")
public class User implements Serializable{
	private String userID;
	private String password;
	
	public User(){
		userID="";
		password="";
	}

	/**
	 * ʹ���û��������������û���
	 * @param �û���
	 * @param ����
	 */
    public User(String userID, String password){
    	this.userID=userID;
    	this.password=password;
    }
    
    /**
     * �����û���
     * @return �û���
     */
    public String getUserID(){
    	return userID;
    }
    
    /**
     * ��������
     * @return �û���
     */
    public String getPassword(){
    	return password;
    }
    
    /**
     * ��������
     * @param ������
     */
    public void setPassword(String newPassword){
    	this.password=newPassword;
    }   
    
    @Override
    /**
     * ��дequals����
     */
    public boolean equals(Object object){
    	if (this==object)   //������ͬ��ֱ�ӷ���true
    		return true;
    	if (object instanceof User){     //������ͬ
    		User user2=(User) object;    //ǿ��ת������
    		if ((this.password.equals(user2.getPassword()))&&
    				this.userID.equals(user2.getUserID()))
    			return true;
    		else return false;
    	}
    	else
    		return false;    //���Ͳ�ͬ��ֱ�ӷ���false
    }
    
    @Override
    /**
     * ��дtoString����
     */
    public String toString(){
    	String s="("+userID+","+password+")";
    	return s;
    }
    
    private void writeObject(java.io.ObjectOutputStream s)
            throws java.io.IOException {
        s.writeObject(userID);
        s.writeObject(password);
    }

    private void readObject(java.io.ObjectInputStream s)
            throws java.io.IOException, ClassNotFoundException {
        userID = (String) s.readObject();
        password = (String) s.readObject();
    }

}
