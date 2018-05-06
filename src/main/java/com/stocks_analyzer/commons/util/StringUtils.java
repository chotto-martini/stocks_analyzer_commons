package com.stocks_analyzer.commons.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

/**
 * 文字列操作に関する機能を提供します。
 *
 * @author chotto-martini
 * @since 1.0.0
 */
public class StringUtils {

	/** Logger定義 */
	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(StringUtils.class.getName());

	/**
	 * 引数{@code value}の値が{@code null}または、
	 * {@link String#trim()}した結果が{@link String#isEmpty()}の場合、
	 * {@code true}を返します。
	 *
	 * @param value チェック対象の文字列
	 * @return 引数{@code value}の値が{@code null}または、
	 * 			{@link String#trim()}した結果が{@link String#isEmpty()}の場合、{@code true}。
	 * 			それ以外{@code false}。
	 *
	 * @author chotto-martini
	 * @since 1.0.0
	 */
	public static boolean isEmptyWithTrim(String value) {
		if (value == null || value.trim().isEmpty()) {
			return true;
		}
		return false;
	}

	/**
	 * {@code text}で指定された文字列をハッシュ化します。
	 * @param text ハッシュ化するテキスト。
	 * @return ハッシュ化した計算値(16進数)。
	 *
	 * @author chotto-martini
	 * @since 1.0.0
	 */
	public static String encryptStr(String text) {
		// 変数初期化
		MessageDigest md = null;
		StringBuffer buffer = new StringBuffer();

		try {
			// メッセージダイジェストインスタンス取得
			md = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			// 例外発生時、エラーメッセージ出力
			System.out.println("指定された暗号化アルゴリズムがありません。");
		}

		// メッセージダイジェスト更新
		md.update(text.getBytes());

		// ハッシュ値を格納
		byte[] valueArray = md.digest();

		// ハッシュ値の配列をループ
		for(int i = 0; i < valueArray.length; i++){
			// 値の符号を反転させ、16進数に変換
			String tmpStr = Integer.toHexString(valueArray[i] & 0xff);

			if(tmpStr.length() == 1){
				// 値が一桁だった場合、先頭に0を追加し、バッファに追加
				buffer.append('0').append(tmpStr);
			} else {
				// その他の場合、バッファに追加
				buffer.append(tmpStr);
			}
		}

		// 完了したハッシュ計算値を返却
		return buffer.toString();
	}
}
