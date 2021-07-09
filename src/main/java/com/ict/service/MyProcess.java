package com.ict.service;

import org.springframework.stereotype.Service;

@Service("myProcess")
public class MyProcess 
{
	// 덧셈 뺄셈 곱셈 나눗셈
	public int getSum(int a, int b)
	{
		return a + b;
	}

	public int getSub(int a, int b)
	{
		return a - b;
	}
	
	public int getMul(int a, int b)
	{
		
		return a * b;
	}
	public int getDiv(int a, int b)
	{
		return a / b ;
	}
}
