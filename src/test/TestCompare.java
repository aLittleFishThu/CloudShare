package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import common.CloudFile;

public class TestCompare {
    public static void main(String args[]){
        CloudFile c1=new CloudFile();
        c1.setUploadTime("2011-01-03");
        c1.setFilename("虞竹珺");
        CloudFile c2=new CloudFile();
        c2.setUploadTime("2010-03-23");
        CloudFile c3=new CloudFile();
        c3.setUploadTime("2017-05-03");
        CloudFile c4=new CloudFile();
        c4.setUploadTime("2011-01-03");
        c4.setFilename("yzj");
        ArrayList<CloudFile> list=new ArrayList<CloudFile>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
