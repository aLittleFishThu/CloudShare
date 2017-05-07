package test;

import common.DeleteFileResult;

public class TestEnum {
	public static void main(String args[]){
		DeleteFileResult fileResult=DeleteFileResult.valueOf("O");
		System.out.println(fileResult);
	}
}
