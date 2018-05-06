package com.stocks_analyzer.commons.math.model;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

/**
 * 3次元情報を保持します。
 *
 * @author none
 * @since 1.0.0
 */
public final class Acceleration3dPoint {

	/** Logger定義 */
	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(Acceleration3dPoint.class.getName());

	/** x軸 */
	private double x = 0.0;
	/** y軸 */
	private double y = 0.0;
	/** z軸 */
	private double z = 0.0;

	/**
	 * コンストラクタ。
	 * @param x x軸
	 * @param y y軸
	 * @param z z軸
	 *
	 * @author none
	 * @since 1.0.0
	 */
	public Acceleration3dPoint(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * x軸を返却します。
	 * @return x軸を返却します。
	 *
	 * @author none
	 * @since 1.0.0
	 */
	public double getX() {
		return x;
	}

	/**
	 * x軸をセットします。
	 * @param x セットするx軸
	 *
	 * @author none
	 * @since 1.0.0
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * y軸を返却します。
	 * @return y軸を返却します。
	 *
	 * @author none
	 * @since 1.0.0
	 */
	public double getY() {
		return y;
	}

	/**
	 * y軸をセットします。
	 * @param y セットするx軸
	 *
	 * @author none
	 * @since 1.0.0
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * z軸を返却します。
	 * @return z軸を返却します。
	 *
	 * @author none
	 * @since 1.0.0
	 */
	public double getZ() {
		return z;
	}

	/**
	 * z軸をセットします。
	 * @param z セットするx軸
	 *
	 * @author none
	 * @since 1.0.0
	 */
	public void setZ(double z) {
		this.z = z;
	}
}
