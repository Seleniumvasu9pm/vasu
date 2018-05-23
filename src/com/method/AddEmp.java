package com.method;

public class AddEmp
{

	public static void main(String[] args) throws Exception
	{
		FunLibrary app=new FunLibrary();
		System.out.println(app.appLaunch("http://opensource.demo.orangehrmlive.com/"));
		app.appLogin("Admin", "admin");
		app.empAdd("shobha123", "awsini123");

	}

}
