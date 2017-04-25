package common;

import java.io.Serializable;


/**
 * 该类为用户类
 * 包含用户名和密码
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
	 * 使用用户名和密码生成用户类
	 * @param 用户名
	 * @param 密码
	 */
    public User(String userID, String password){
    	this.userID=userID;
    	this.password=password;
    }
    
    /**
     * 返回用户名
     * @return 用户名
     */
    public String getUserID(){
    	return userID;
    }
    
    /**
     * 返回密码
     * @return 用户名
     */
    public String getPassword(){
    	return password;
    }
    
    /**
     * 设置密码
     * @param 新密码
     */
    public void setPassword(String newPassword){
    	this.password=newPassword;
    }   
    
    @Override
    /**
     * 重写equals方法
     */
    public boolean equals(Object object){
    	if (this==object)   //引用相同，直接返回true
    		return true;
    	if (object instanceof User){     //类型相同
    		User user2=(User) object;    //强制转换类型
    		if ((this.password.equals(user2.getPassword()))&&
    				this.userID.equals(user2.getUserID()))
    			return true;
    		else return false;
    	}
    	else
    		return false;    //类型不同，直接返回false
    }
    
    @Override
    /**
     * 重写toString方法
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
