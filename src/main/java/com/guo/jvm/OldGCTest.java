package com.guo.jvm;

/**
 * @Description:
 * @author gjyip
 * @date 2021-06-02
 */
public class OldGCTest {

	/**
	 * -XX:NewSize=10485760 -XX:MaxNewSize=10485760 -XX:InitialHeapSize=20971520
	 * -XX:MaxHeapSize=20971520 -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=15
	 * -XX:PretenureSizeThreshold=10485760 -XX:+UseParNewGC -XX:+UseConcMarkSweepGC
	 * -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xloggc:gc.log
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		byte[] array = new byte[2 * 1024 * 1024];
		array = new byte[2 * 1024 * 1024];
		array = new byte[2 * 1024 * 1024];
		array = null;

		byte[] array2 = new byte[128 * 1024];
		byte[] array3 = new byte[2 * 1024 * 1024];
	}

}
