package com.test;

public class Test {

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		CrashHandler handler1 = new CrashHandler("ȫ��");
		// ���û�������쳣���������߳��з���δ�����쳣����֪�����������ԭ��
		// setDefaultUncaughtExceptionHandler�������õ��쳣�����������߳�û���쳣������������´���
		Thread.setDefaultUncaughtExceptionHandler(handler1);
		// Ҳ���Ե���setUncaughtExceptionHandler������ֻ���ڵ�ǰThread�����쳣ʱ�Żᱻ����
		CrashHandler handler2 = new CrashHandler("�ֲ�");
		thread.setUncaughtExceptionHandler(handler2);// �����쳣��������ֲ���
		thread.start();
	}
}
