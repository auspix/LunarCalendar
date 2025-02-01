package com.github.heqiao2010.lunar;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		findMQ();
		findYF();
	}
	
	static void findMQ() {
		Calendar today = Calendar.getInstance();
		today.set(1977, 9, 28);
		int num = 365*110;
		int idx = 0;
		while(idx<num) {
			LunarCalendar lunar = LunarCalendar.solar2Lunar(today);
			if(today.get(Calendar.MONTH)==9&&today.get(Calendar.DAY_OF_MONTH)==28&&lunar.getLunarMonth()==9&&lunar.getDayOfLunarMonth()==16) {
				System.out.println(today.getTime() + " <====> " + lunar.getFullLunarName()+",month="+lunar.getLunarMonth()+",day="+lunar.getDayOfLunarMonth());	
			}
			today.add(Calendar.DAY_OF_MONTH, 1);
			idx++;
		}
	}
	
	static void findYF() {
		Calendar today = Calendar.getInstance();
		today.set(1974, 8, 15);
		int num = 365*110;
		int idx = 0;
		while(idx<num) {
			LunarCalendar lunar = LunarCalendar.solar2Lunar(today);
			if(today.get(Calendar.MONTH)==8&&today.get(Calendar.DAY_OF_MONTH)==15&&lunar.getLunarMonth()==7&&lunar.getDayOfLunarMonth()==29) {
				System.out.println(today.getTime() + " <====> " + lunar.getFullLunarName()+",month="+lunar.getLunarMonth()+",day="+lunar.getDayOfLunarMonth());	
			}
			today.add(Calendar.DAY_OF_MONTH, 1);
			idx++;
		}
	}

}
