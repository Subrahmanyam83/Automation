package com.rb.ofbiz.test.utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CommonUtils {

	public static String getSmartValue(String value){
		if (value.startsWith("[date]")) {
			value = value.substring(6);
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			if(value.startsWith("[Today]")){
				//do nothing
			}
			else if (value.startsWith("[Year")){
				if(value.startsWith("[YearFirst")){
					calendar.set(Calendar.DAY_OF_MONTH, 1);
					calendar.set(Calendar.MONTH, 0);
				}
				else if(value.startsWith("[YearEnd")){
					calendar.set(Calendar.DAY_OF_MONTH, 31);
					calendar.set(Calendar.MONTH, 11);
				}
			}
			else if (value.startsWith("[Month")){
				if(value.contains("+") || value.contains("-")){
					int month;
					if(value.contains("+")){
						String temp = value.replace('+', '-').split("-")[1].trim();
						temp = temp.substring(0,temp.length()-1);
						month = calendar.get(Calendar.MONTH)+Integer.parseInt(temp);
						if(month>11){
							month=month-11;
							int year=calendar.get(Calendar.YEAR)+1;
							calendar.set(Calendar.YEAR, year);
						}
					}else {
						String temp = value.split("-")[1].trim();
						temp = temp.substring(0,temp.length()-1);
						month = calendar.get(Calendar.MONTH)-Integer.parseInt(temp);
						if(month<0){
							month=month+11;
							int year=calendar.get(Calendar.YEAR)-1;
							calendar.set(Calendar.YEAR, year);
						}
					}
					calendar.set(Calendar.MONTH, month);
				}
				if(value.startsWith("[MonthBeginning")){
					calendar.set(Calendar.DAY_OF_MONTH, 1);
				}
				else if(value.startsWith("[MonthEnd")){
					int lastDate = calendar.getActualMaximum(Calendar.DATE);
					calendar.set(Calendar.DATE, lastDate);
				}
				else if(value.startsWith("[MonthFirstWeekEnd")){
					calendar.set(Calendar.DAY_OF_MONTH, 7);
				}
				else if(value.startsWith("[MonthSecondWeekEnd")){
					calendar.set(Calendar.DAY_OF_MONTH, 14);
				}
			}
			else {
				//LOG.info("No matching date tag found");
			}
			Date date = calendar.getTime();
			value = formatter.format(date);
		}
		return value;
	}
}
