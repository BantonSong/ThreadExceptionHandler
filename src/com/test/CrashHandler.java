package com.test;

import java.lang.Thread.UncaughtExceptionHandler;

public class CrashHandler implements UncaughtExceptionHandler {
	private String msg;

	public CrashHandler(String msg) {
		this.msg = msg;
	}

	public void uncaughtException(Thread t, Throwable e) {
		// ��ӡ���쳣��Ϣ���������������������ϴ��������������浽���صȵȡ�
		System.out.println(msg);
		e.printStackTrace();
	}

}
