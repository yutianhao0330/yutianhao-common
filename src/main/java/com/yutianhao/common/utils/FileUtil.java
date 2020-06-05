package com.yutianhao.common.utils;
/**
 * 
    * @ClassName: FileUtil
    * @Description: 文件工具类
    * @author thyu
    * @date 2020年6月5日
    *
 */
public class FileUtil {
	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(10分)
	*/
	public static String getExtendName(String fileName){
		//TODO 实现代码
		return fileName.substring(fileName.lastIndexOf("."));
	}
}
