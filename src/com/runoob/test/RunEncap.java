package com.runoob.test;

public class RunEncap {
	public static void main(String args[]) {
//		RegexMatches wD = new WriteDemo();
		EncapTest encap = new EncapTest();
		encap.setName("James");
		encap.setAge(20);
		encap.setIdNum("12343ms");
		System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
	}
}