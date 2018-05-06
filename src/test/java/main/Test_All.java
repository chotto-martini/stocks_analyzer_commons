package main;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * 全テスト実施クラス。
 * @author chotto-martini
 */
@RunWith(Suite.class)
@SuiteClasses({
	Test_StringUtils.class,
})
public class Test_All {

	/**
	 * コマンドラインからの実行。
	 * @param args 起動引数
	 */
	public static void main(String[] args) {
		JUnitCore.main(Test_All.class.getName());
	}
}