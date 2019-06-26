package com.test.testproxy.impl;

import com.test.testproxy.interfaces.Action;

public class Cat implements Action
{
	@Override public void play()
	{
		System.out.println("Cat play");
	}
}
