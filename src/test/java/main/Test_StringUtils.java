package main;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.LoggerFactory;

import com.stocks_analyzer.commons.util.StringUtils;

import ch.qos.logback.classic.Logger;

/**
 * サンプルAPI TestSuiteクラス。
 * @author chotto-martini
 * @see com.stocks_analyzer.commons.util.StringUtils
 */
@RunWith(Suite.class)
@SuiteClasses({
	Test_StringUtils.Test_isEmptyWithTrim.class,
})
public class Test_StringUtils extends AppTest {

	/** Logger定義 */
	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(Test_StringUtils.class.getName());

	/**
	 * {@link com.stocks_analyzer.commons.util.StringUtils#isEmptyWithTrim(String)}テストクラス。
	 * @author chotto-martini
	 */
	@RunWith(Parameterized.class)
	public static class Test_isEmptyWithTrim {

		/** ケースNo. */
		private final String caseNo;
		/** コメントメッセージ */
		private final String message;

		/** テスト実施データ */
		private final String requestParams;
		/** 想定結果 */
		private final boolean assertResult;

		/**
		 * コンストラクタ。
		 * @param caseNo ケースNo.
		 * @param message コメントメッセージ
		 * @param requestParams テスト実施データ
		 * @param assertResponse 想定結果
		 */
		public Test_isEmptyWithTrim(String caseNo,
				String message,
				String requestParams,
				boolean assertResult) {

			this.caseNo = caseNo;
			this.message = message;
			this.requestParams = requestParams;
			this.assertResult = assertResult;
		}

		/**
		 * テストパラメータ定義。
		 * @return テストパラメータリストを返却します。
		 */
		@Parameters(name="ケースNo.[{0}] {1}")
		public static Iterable<Object[]> getParameters() {
			return Arrays.asList(new Object[][] {

				// 正常系
				{"0001", "正常系", null, true,},
				{"0002", "正常系", "", true,},
				{"0003", "正常系", " ", true,},
				{"0004", "正常系", "   ", true,},
				{"0005", "正常系", "　", false,},
				{"0006", "正常系", "　　  ", false,},
				{"0007", "正常系", "hogehoge", false,},
				{"0008", "正常系", "  hogehoge  ", false,},
			});
		}

		/**
		 * テスト実施メソッド。
		 */
		@Test
		public void Test_isEmptyWithTrim_01() {
			LOGGER.info("▼▼▼ ----- テスト[" + Test_isEmptyWithTrim.class.getSimpleName() + "_" + this.caseNo + "] " + this.message + " ----- ▼▼▼");

			boolean ret = StringUtils.isEmptyWithTrim(this.requestParams);
			LOGGER.info("[" + Test_isEmptyWithTrim.class.getSimpleName() + "_" + this.caseNo + "]戻り値：ret=" + ret);
			assertThat(ret, is(this.assertResult));

			LOGGER.info("▲▲▲ ----- テスト[" + Test_isEmptyWithTrim.class.getSimpleName() + "_" + this.caseNo + "] " + this.message + " ----- ▲▲▲");
		}
	}
}
