package com.test;

import java.lang.Thread.UncaughtExceptionHandler;

public class CrashHandler implements UncaughtExceptionHandler {
	private String msg;

	public CrashHandler(String msg) {
		this.msg = msg;
	}

	public void uncaughtException(Thread t, Throwable e) {
		// 打印出异常信息，还可以有其它操作，上传到服务器，保存到本地等等。
		System.out.println(msg);
		e.printStackTrace();
	}

}
