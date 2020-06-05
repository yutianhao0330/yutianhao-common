package com.yutianhao.common.utils;

import org.junit.Test;


public class FileUtilTest {

	@Test
	public void testGetExtendName() {
		String fileName = "E:\\ssss\\aaaa.txt";
		String extendName = FileUtil.getExtendName(fileName);
		System.out.println(extendName);
	}

}
