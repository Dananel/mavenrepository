package com.test.testproxy.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SimpleProxy implements InvocationHandler
{
	private Object target;

	@Override public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
		System.out.println("可以在调用实际方法前做一些事情");
		System.out.println("当前调用的方法是" + method.getName());

		Object result = method.invoke(target, args);// 指定被代理对象和传入参数

		System.out.println(method.getName() + "方法的返回值是" + result);
		System.out.println("可以在调用实际方法后做一些事情");

		return result;
	}

	public SimpleProxy(Object target)
	{
		this.target = target;
	}
}
