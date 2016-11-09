package test.java.test;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import test.java.page.DemoPage;
import lazy.android.common.LazyDriver;

/**
 * @author huangshuli@jd.com
 * @date 2016年8月11日 上午10:06:28
 * @version 1.0
 * @remark
 */
public class DemoTest {

	private DemoPage demoPage;

	@BeforeClass
	public void init() throws MalformedURLException {

		LazyDriver lazyDriver = new LazyDriver("jdpay.apk",
				"com.wangyin.payment", ".home.ui.MainActivity", "4.2.2", false);
		demoPage = new DemoPage(lazyDriver);
	}

	/**
	 * 登陆测试
	 */
	@Test
	public void loginTest() {
		demoPage.login();
	}

	/**
	 * 转账测试
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void tranAccount() throws InterruptedException {
		demoPage.doTranAccount();
	}
}
