package com.test;

import java.util.List;

public class MyThread extends Thread {

	public void run() {
		List list = null;
		// �ᷢ����ָ���쳣
		System.out.println(list.size());
		// ���³��򲻻ᱻִ��
		System.out.println("test under exception");
	}

}
