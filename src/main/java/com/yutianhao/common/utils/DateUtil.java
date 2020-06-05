package com.yutianhao.common.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * 
    * @ClassName: DateUtil
    * @Description: 日期工具类
    * @author thyu
    * @date 2020年6月5日
    *
 */
public class DateUtil {
	/**
	 * 
	    * @Title: getDateByInitMonth
	    * @Description: 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	    * 					则返回的结果为2019-05-01 00:00:00
	    * @param @param src
	    * @param @return    参数
	    * @return Date    返回类型
	    * @throws
	 */
	public static Date getDateByInitMonth(Date date){
		//TODO 实现代码
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), 1, 0, 0, 0);
		return calendar.getTime();
	}
	/**
	 * 
	    * @Title: getDateByFullMonth
	    * @Description: 给任意一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	    *	 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	    * 	例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	    * @param @param src
	    * @param @return    参数
	    * @return Date    返回类型
	    * @throws
	 */
	public static Date getDateByFullMonth(Date date){
		//TODO 实现代码
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH)+1, 1, 0, 0, 0);
		calendar.add(Calendar.SECOND, -1);
		return calendar.getTime();
	}
	
}
