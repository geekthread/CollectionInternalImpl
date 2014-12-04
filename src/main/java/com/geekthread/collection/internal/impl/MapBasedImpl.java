package com.geekthread.collection.internal.impl;

import java.util.HashMap;

public class MapBasedImpl {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>(3, 2);

		System.out.println(map.containsKey(null));

		map.put("1", "1");
		map.put("2", "2");
		System.out.println("max value:-" + Integer.MAX_VALUE);
		System.out.println("<>" + map);
	}

	@Override
	public int hashCode() {
		System.out.println("Inside Hashcode!!");
		return 244;
	}

}

