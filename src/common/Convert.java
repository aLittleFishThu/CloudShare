package common;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

public final class Convert {
	/**
	 * ������ת�ַ���
	 * @param inputStream
	 * @return String
	 * @throws IOException
	 */
	public static String toString(InputStream inputStream) throws IOException{
		ByteArrayOutputStream result = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024];
		int length;
		while ((length = inputStream.read(buffer)) != -1) {
		    result.write(buffer, 0, length);
		}
		inputStream.close();
		result.flush();
		result.close();
		return result.toString();
	}
	/**
	 * �ַ���ת������
	 * @param s
	 * @return inputstream
	 */
	public static InputStream toInputStream (String s){
		InputStream is =
                new ByteArrayInputStream(s.getBytes());
		return is;
	}
	/**
	 * �ַ���ת��¼���
	 * @param s
	 * @return LoginResult
	 */
	public static LoginResult toLoginResult (String s){
		if (s.equals("OK"))                                
			return LoginResult.OK;
		else if (s.equals("wrong"))
			return LoginResult.wrong;
		else 
			return LoginResult.unknownError;
	}
	/**
	 * �ַ���תע����
	 * @param s
	 * @return RegisterResult
	 */
	public static RegisterResult toRegisterResult (String s){
		HashMap<String,RegisterResult> map=new HashMap<String,RegisterResult>();
		for(RegisterResult result:RegisterResult.values()) {
            map.put(result.toString(), result);
        }
		if (map.containsKey(s))
			return map.get(s);
		else
			return RegisterResult.unknownError;
	}
	/**
	 * �ַ���ת�޸�������
	 * @param s
	 * @return ChangePasswdResult
	 */
	public static ChangePasswdResult toChangePasswdResult (String s){
		HashMap<String,ChangePasswdResult> map=new HashMap<String,ChangePasswdResult>();
		for(ChangePasswdResult result:ChangePasswdResult.values()) {
            map.put(result.toString(), result);
        }
		if (map.containsKey(s))
			return map.get(s);
		else
			return ChangePasswdResult.unknownError;
	}
}
