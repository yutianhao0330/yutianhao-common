package com.yutianhao.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

/**
 * 
    * @ClassName: StreamUtil
    * @Description: 流工具处理类
    * @author thyu
    * @date 2020年6月5日
    *
 */
public class StreamUtil {
	/*
	* 方法1：批量关闭流，参数能传入无限个。(10分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭，并且参数个数不限。
	*/
	public static void closeAll(AutoCloseable...autoCloseables){
		//TODO 实现代码
		if(null!=autoCloseables && autoCloseables.length>0) {
			for (AutoCloseable autoCloseable : autoCloseables) {
				try {
					autoCloseable.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(10分)，要求方法内部调用上面第1个方法关闭流(5分)
	*/
	public static String readTextFile(InputStream in){
		//TODO 实现代码
		StringBuffer sb = new StringBuffer();
		Reader reader = null;
		BufferedReader bufferedReader = null;
		String line = null;
		try {
			reader = new InputStreamReader(in, "utf-8");
			bufferedReader = new BufferedReader(reader);
			while((line=bufferedReader.readLine())!=null) {
				sb.append(line+"\n");
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeAll(bufferedReader,reader,in);
		}
		
		return sb.toString();
	}
	/*
	* 方法3：传入文本文件对象，返回该文件内容(10分)，并且要求内部调用上面第2个方法(5分)。
	*/
	public static String readTextFile(File txtFile){
		//TODO 实现代码
		String result = null;
		try {
			result = readTextFile(new FileInputStream(txtFile));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return result;
	}
}
