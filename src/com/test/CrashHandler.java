package com.test;

import java.lang.Thread.UncaughtExceptionHandler;

public class CrashHandler implements UncaughtExceptionHandler {

	public void uncaughtException(Thread t, Throwable e) {
		// ��ӡ���쳣��Ϣ���������������������ϴ��������������浽���صȵȡ�
		e.printStackTrace();
	}

}
