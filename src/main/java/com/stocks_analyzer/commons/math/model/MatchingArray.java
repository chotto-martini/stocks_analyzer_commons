package com.stocks_analyzer.commons.math.model;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

/**
 * マッチング対象の配列を保持します。
 *
 * @author none
 * @since 1.0.0
 */
public final class MatchingArray {

	/** Logger定義 */
	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(MatchingArray.class.getName());

	/** マッチング対象配列A */
	private Object[] arrayA;
	/** マッチング対象配列B */
	private Object[] arrayB;

	/**
	 * コンストラクタ。
	 *
	 * @author none
	 * @since 1.0.0
	 */
	public MatchingArray() {
		this.arrayA = new Object[]{};
		this.arrayB = new Object[]{};
	}

	/**
	 * コンストラクタ。
	 * @param arrayA マッチング対象配列A
	 * @param arrayB マッチング対象配列B
	 *
	 * @author none
	 * @since 1.0.0
	 */
	public MatchingArray(final Object[] arrayA, final Object[] arrayB) {
		this.arrayA = arrayA;
		this.arrayB = arrayB;
	}

	/**
	 * マッチング対象配列Aを返却します。
	 * @return マッチング対象配列A
	 *
	 * @author none
	 * @since 1.0.0
	 */
	public Object[] getArrayA() {
		return arrayA;
	}

	/**
	 * マッチング対象配列Aをセットします。
	 * @param arrayA セットするマッチング対象配列A
	 *
	 * @author none
	 * @since 1.0.0
	 */
	public void setArrayA(Object[] arrayA) {
		this.arrayA = arrayA;
	}

	/**
	 * マッチング対象配列Bを返却します。
	 * @return マッチング対象配列B
	 *
	 * @author none
	 * @since 1.0.0
	 */
	public Object[] getArrayB() {
		return arrayB;
	}

	/**
	 * マッチング対象配列Bをセットします。
	 * @param arrayB セットするマッチング対象配列B
	 *
	 * @author none
	 * @since 1.0.0
	 */
	public void setArrayB(Object[] arrayB) {
		this.arrayB = arrayB;
	}
}
