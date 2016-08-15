package com.test;

public class Test {

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		CrashHandler handler1 = new CrashHandler("全局");
		// 如果没有设置异常处理器，线程中发生未捕获异常，则不知道程序崩溃的原因
		// setDefaultUncaughtExceptionHandler方法设置的异常处理器会在线程没有异常处理器的情况下触发
		Thread.setDefaultUncaughtExceptionHandler(handler1);
		// 也可以调用setUncaughtExceptionHandler方法，只有在当前Thread发生异常时才会被处理
		CrashHandler handler2 = new CrashHandler("局部");
		thread.setUncaughtExceptionHandler(handler2);// 发生异常会输出“局部”
		thread.start();
	}
}
