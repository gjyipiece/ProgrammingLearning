package com.guo.jvm;

/**
 * @Description:
 * @author gjyip
 * @date 2021-06-01
 */
public class YoungGCTest {

	/**
	 * -XX:NewSize=5242880 -XX:MaxNewSize=5242880 -XX:InitialHeapSize=10485760
	 * -XX:MaxHeapSize=10485760 -XX:SurvivorRatio=8
	 * -XX:PretenureSizeThreshold=10485760 -XX:+UseParNewGC -XX:+UseConcMarkSweepGC
	 * -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xloggc:gc.log
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		byte[] array = new byte[1024 * 1024];
		array = new byte[1024 * 1024];
		array = new byte[1024 * 1024];
		array = null;

		byte[] array2 = new byte[2 * 1024 * 1024];
	}

}
