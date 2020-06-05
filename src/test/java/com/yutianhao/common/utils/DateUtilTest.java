package com.yutianhao.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	@Test
	public void testGetDateByInitMonth() {
		Date result = DateUtil.getDateByInitMonth(new Date());
		System.out.println(dateFormat.format(result));
	}

	@Test
	public void testGetDateByFullMonth() {
		Date result = DateUtil.getDateByFullMonth(new Date());
		System.out.println(dateFormat.format(result));
	}
	@Test
	public void testSQL() {
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		Date startDate = DateUtil.getDateByInitMonth(new Date());
		Date endDate = DateUtil.getDateByFullMonth(new Date());
		sql = sql.replace("{1}", dateFormat.format(startDate));
		sql = sql.replace("{2}", dateFormat.format(endDate));
		System.out.println(sql);
	}

}
