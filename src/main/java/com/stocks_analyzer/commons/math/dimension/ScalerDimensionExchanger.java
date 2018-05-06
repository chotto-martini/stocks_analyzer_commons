package com.stocks_analyzer.commons.math.dimension;

import org.slf4j.LoggerFactory;

import com.stocks_analyzer.commons.math.model.Acceleration3dPoint;

import ch.qos.logback.classic.Logger;

/**
 * 3次元のユークリッド距離に変換するクラス。
 *
 * @author none
 * @since 1.0.0
 */
public final class ScalerDimensionExchanger implements DimensionExchanger {

	/** Logger定義 */
	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(ScalerDimensionExchanger.class.getName());

	/*
	 * (非 Javadoc)
	 * @see com.stocks_analyzer.commons.math.dimension.DimensionExchanger#exchange(com.stocks_analyzer.commons.math.model.Acceleration3dPoint[])
	 */
	@Override
	public double[] exchange(final Acceleration3dPoint[] points) {
		if (points.length < 2) {
			// 要素長が2未満であれば要素なし配列を戻す
			return new double[]{};
		}
		int idx = 0;
		Acceleration3dPoint befPnt = null;
		// 最初の一個目を飛ばすため、-1する
		double[] retArr = new double[points.length - 1];
		for (Acceleration3dPoint curPnt : points) {
			if (befPnt == null) {
				// 最初の1要素
				befPnt = curPnt;
			} else {
				// 3次元上の点同士の距離：√{(x-x1)^2 + (y-y1)^2 + (z-z1)^2 }
				double xdiff = Math.pow(befPnt.getX() - curPnt.getX(), 2.0);
				double ydiff = Math.pow(befPnt.getY() - curPnt.getY(), 2.0);
				double zdiff = Math.pow(befPnt.getZ() - curPnt.getZ(), 2.0);
				retArr[idx]  = Math.sqrt(xdiff + ydiff + zdiff);
				idx++;
			}
		}
		return retArr;
	}
}
