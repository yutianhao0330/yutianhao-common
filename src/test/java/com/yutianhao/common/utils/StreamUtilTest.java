package com.yutianhao.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Test;

public class StreamUtilTest {
	
	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException {
		InputStream in = new FileInputStream("C:\\Users\\dell\\Desktop\\aaa.txt");
		String text = StreamUtil.readTextFile(in);
		System.out.println(text);
	}

	@Test
	public void testReadTextFileFile() {
		File file = new File("C:\\\\Users\\\\dell\\\\Desktop\\\\aaa.txt");
		String text = StreamUtil.readTextFile(file);
		System.out.println(text);
	}

}
