package com.test;

import java.util.List;

public class MyThread extends Thread {

	public void run() {
		List list = null;
		// 会发生空指针异常
		System.out.println(list.size());
		// 以下程序不会被执行
		System.out.println("test under exception");
	}

}
