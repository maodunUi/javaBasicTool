package cn.maodun.generate.file;

import cn.hutool.core.io.FileUtil;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author DELL
 * @date 2022/6/25
 */
public class ReadFile {
    public static void main(String[] args) throws Exception {
        FileReader fr=new FileReader("C:\\shanhs\\practiceCode\\javaBasic\\src\\main\\java\\cn\\maodun\\generate\\file\\dir\\refIds.txt");
        BufferedReader br=new BufferedReader(fr);
        String line="";
        String refIds = "" ;

        while ((line=br.readLine())!=null) {
            refIds += line + "," ;
        }
        br.close();
        fr.close();
        System.out.println(refIds);

    }
}
