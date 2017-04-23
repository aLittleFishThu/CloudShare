package common;

//import java.util.Scanner;
import java.util.regex.*;

/**
 * ����Ϊ�ַ����Ϸ����ж���
 * @author yzj
 * �ж��û����������Ƿ�Ϸ�
 */
public final class Validator {
    
    /**
     * �ж��û����Ϸ���
     * ����1~64������������ĸ_-
     * @param userID
     * @return true or false
     */
    public static boolean isUserIDLegal(String userID){
    	Pattern pattern=Pattern.compile("^[0-9a-zA-Z_-]{1,64}$");
    	Matcher matcher=pattern.matcher(userID);
    	if (matcher.matches())
    		return true;
    	else 
    		return false;
    }
    
    /**�ж������Ƿ�Ϸ�
     * ����8-64������������ĸ-_
     * @param password
     * @return true or false
     */
    public static boolean isPasswdLegal(String password){
    	Pattern pattern=Pattern.compile("^[0-9a-zA-Z_-]{8,64}$");
    	Matcher matcher=pattern.matcher(password);
    	if (matcher.matches())
    		return true;
    	else 
    		return false;
    }
    
    /*public static void main(String args[]){
    	System.out.println("��������");
    	Scanner sc = new Scanner(System.in); 
    	String s=sc.nextLine();
    	sc.close();
    	System.out.println(Validator.isUserIDLegal(s));
    }*/
}


