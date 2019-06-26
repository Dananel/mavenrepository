package com.test.testfile;


import java.io.File;
import java.util.Arrays;

public class TestFile
{
	public static void main(String[] args)
	{
		File file = new File("G:/");
		System.out.println(Arrays.toString(file.list()));
	}
}
