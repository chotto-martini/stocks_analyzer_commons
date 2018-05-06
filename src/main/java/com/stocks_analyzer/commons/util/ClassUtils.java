package com.stocks_analyzer.commons.util;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

/**
 * Class関する付属情報を提供します。
 *
 * @author chotto-martini
 * @since 1.0.0
 */
public class ClassUtils {

	/** Logger定義 */
	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(ClassUtils.class.getName());

	/**
	 * このメソッドを参照しているメソッド名を返します。
	 *
	 * @return このメソッドを参照しているメソッド名を返します。
	 *
	 * @author chotto-martini
	 * @since 1.0.0
	 */
	public static String getMethodName() {
		Throwable throwable = new Throwable();
		String methodName = "";
		StackTraceElement[] stackTrace = throwable.getStackTrace();

		if (stackTrace != null) {
			if(stackTrace.length > 1){
				methodName = stackTrace[1].getMethodName();
			}
		}
		return methodName;
	}

}
