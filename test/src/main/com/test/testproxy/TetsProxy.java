package com.test.testproxy;

import com.test.testproxy.impl.Cat;
import com.test.testproxy.impl.SimpleProxy;
import com.test.testproxy.interfaces.Action;

import javax.security.auth.Subject;
import java.lang.reflect.Proxy;

public class TetsProxy
{
	public static void main(String[] args)
	{
		// 委托类
		Cat cat = new Cat();

		// 处理器
		SimpleProxy simpleProxy = new SimpleProxy(cat);

		ClassLoader classLoader = cat.getClass().getClassLoader();
		Class<?>[] interfaces = cat.getClass().getInterfaces();
		// 生成代理类
		Action subject = (Action)Proxy.newProxyInstance(classLoader,interfaces,simpleProxy);

		subject.play();
	}
}
