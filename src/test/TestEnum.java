package test;

import common.FileResult;

public class TestEnum {
	public static void main(String args[]){
		FileResult fileResult=FileResult.valueOf("O");
		System.out.println(fileResult);
	}
}
