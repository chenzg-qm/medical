/*
 * Created on 2007-1-11
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.s3d.webapps.util.random;

/**
 * 产生唯一的随机字符串
 * @author
 *
 */
public class RandomGUIDUtil {
	/**
	 * 产生唯一的随机字符串
	 * 
	 * @return
	 */
	public static String generateKey() {
		return new RandomGUID(true).toString();
	}
}