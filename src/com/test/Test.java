package com.test;

public class Test {

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		// ���û�������쳣���������߳��з���δ�����쳣����֪�����������ԭ��
		thread.setUncaughtExceptionHandler(new CrashHandler());
		thread.start();
	}

}
