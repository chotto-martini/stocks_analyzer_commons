package com.stocks_analyzer.commons.math.interpolation;

import org.slf4j.LoggerFactory;

import com.stocks_analyzer.commons.math.model.MatchingArray;

import ch.qos.logback.classic.Logger;

/**
 * FIX補間クラス。
 * <p>少ない方の配列に合わせて補間します。
 *
 * @author none
 * @since 1.0.0
 */
public final class FixInterpolation implements Interpolation {

	/** Logger定義 */
	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(FixInterpolation.class.getName());

	/*
	 * (非 Javadoc)
	 * @see com.stocks_analyzer.commons.math.interpolation.Interpolation#calcurate(com.stocks_analyzer.commons.math.model.MatchingArray)
	 */
	@Override
	public MatchingArray calcurate(final MatchingArray array) {
		int lenA   = array.getArrayA().length;
		int lenB   = array.getArrayB().length;
		int maxLen = Math.min(lenA, lenB);
		MatchingArray tmpArr = new MatchingArray(new Object[maxLen], new Object[maxLen]);
		for (int idx = 0; idx < maxLen ; idx++) {
			tmpArr.getArrayA()[idx] = array.getArrayA()[idx];
			tmpArr.getArrayB()[idx] = array.getArrayB()[idx];
		}
		return tmpArr;
	}

	/*
	 * (非 Javadoc)
	 * @see com.stocks_analyzer.commons.math.interpolation.Interpolation#validation(com.stocks_analyzer.commons.math.model.MatchingArray)
	 */
	@Override
	public boolean validation(final MatchingArray array) {
		return !(array.getArrayA().length == 0 || array.getArrayB().length == 0);
	}
}
