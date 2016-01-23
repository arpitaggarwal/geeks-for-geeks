package com.test.core;

import java.net.InetAddress;

public class ReturnInsideCatch {
	
	public static String getLast2DigitsOfHostName() {
		try {
			String hostName = InetAddress.getLocalHost().getHostName();
			if (hostName != null && hostName.length() >= 2) {
				return hostName.substring(hostName.length() - 2);
			} else {
				return "N/A";
			}
		} catch (Exception ex) {
			return "N/A";
		}
	}

}
