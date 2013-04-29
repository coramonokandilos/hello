package com.ponta027.pdf.sample;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

/**
 * リフレクションのユーティリティクラス
 * 
 * @author kazuhiro
 * 
 */
public class ReflectionUtil {

	public static String getProperty(Object object, String methodName) {
		try {
			return BeanUtils.getProperty(object, methodName);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
