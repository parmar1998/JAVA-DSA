package com.cn.Abstract;

abstract class Branch{
	abstract boolean  validatePhotoProof(String adhar_card);
	abstract boolean  validateAddressProof(String pan_card,String adhar_card);
	public void print() {
		System.out.println("Printing");
	}
}
//rule 1 - if one class extends abstract class then it should override all the methods
class MumbaiBranch extends Branch{

	@Override
	boolean validatePhotoProof(String adhar_card) {
		if(!adhar_card.isEmpty()) {
			return true;
		}
		return false;
	}
	@Override
	boolean validateAddressProof(String pan_card, String adhar_card) {
		// TODO Auto-generated method stub
		if(!pan_card.isEmpty()&&!adhar_card.isEmpty()) {
			return true;
		}
		return false;
	}
}
public class Solution {

}
