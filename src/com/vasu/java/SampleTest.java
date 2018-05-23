package com.vasu.java;

public class SampleTest//class
{
	//variable
	int k=70;
	//methods
	public void add()
	{
		int i=10;
		int j=20;
		int sum=i+j;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		//object
		SampleTest  v=new SampleTest();
		v.add();
		System.out.println(v.k);

	}

}
