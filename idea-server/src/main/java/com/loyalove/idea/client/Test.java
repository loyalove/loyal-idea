package com.loyalove.idea.client;

/**
 * Title: Test.java
 * Description: TODO
 * Company: ysh
 *
 * @author: sailuo@yiji.com
 * @date: 2017-05-10 17:22
 */
public class Test {
	public static void main(String[] args) {
		System.out.println(get_reg_code("695711884"));
	}
	public static String get_reg_code(String machine_code)
	{

		long num = Long.parseLong(machine_code);
		for (int i = 0; i < 100; i++)
		{
			String text = String.valueOf(num * 2L);
			boolean flag2 = text.length() <= 12;
			if (flag2)
			{
				num = Long.parseLong(text);
			}
			else
			{
				num = Long.parseLong(text.substring(0, 12));
			}
		}
		return String.valueOf(num);
	}

}
