package com.cn.Enum;

public class Enumeration {
enum Day{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	}
enum TrafficSignal{
	RED("STOP"),GREEN("GO"),ORANGE ("SLOW DOWN");

	 String act;


	TrafficSignal(String string) {
		// TODO Auto-generated constructor stub
	}


	public String getAct() {
		return this.act;
	}

}
public static void main(String[] args) {
	for(Day d:Day.values()) {
		System.out.println(d+" "+d.ordinal());//ordinal is used for getting index
	}
}
}
