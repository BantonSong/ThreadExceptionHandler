package com.test;

public class Test {

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		// 如果没有设置异常处理器，线程中发生未捕获异常，则不知道程序崩溃的原因
		thread.setUncaughtExceptionHandler(new CrashHandler());
		thread.start();
	}

}
