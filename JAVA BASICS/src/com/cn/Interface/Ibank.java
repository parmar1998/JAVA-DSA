package com.cn.Interface;

//in interface the attribute are - final and public
//method signatures are - abstract
//we use implements keyword for a class to implement the methods
//interace can be implemented multiple and multilevel 

public interface Ibank {
String CreatAccount(Customer customer);
double IssueVehicleLoan(String VehicleType,Customer customer);
double IssueHouseLoan(String FlatType,Customer customer);
}
class SBI implements Ibank {

	@Override
	public String CreatAccount(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double IssueVehicleLoan(String VehicleType, Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double IssueHouseLoan(String FlatType, Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
