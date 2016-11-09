package test.java.page;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import test.java.bean.LifeBean;
import test.java.bean.LifeBean2;
import test.java.bean.LoginBean;
import test.java.bean.MineBean;
import test.java.bean.TodayBean;
import io.appium.java_client.AppiumDriver;
import lazy.android.common.LazyDriver;

/** 
 * @author huangshuli@jd.com
 * @date 2016年8月11日 下午5:18:15 
 * @version 1.0 
 * @remark
 */
public class DemoPage {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private LazyDriver lazyDriver;
	private AppiumDriver driver;
	private TodayBean todayBean;
	private LifeBean2 lifeBean2;
	private MineBean mineBean;
	private LoginBean loginBean;

	/**
	 * 构造函数
	 * @param aLazyDriver
	 */
	public DemoPage(LazyDriver aLazyDriver) {
		lazyDriver = aLazyDriver;
		driver = lazyDriver.getDriver();
		todayBean = new TodayBean(driver);
		new LifeBean(driver);
		lifeBean2 = new LifeBean2(driver);
		mineBean = new MineBean(driver);
		loginBean = new LoginBean(driver);
	}
	
	/**
	 * 登陆操作
	 */
	public void login() {
		logger.info("login by jdpay account!");
		todayBean.textViewToday.expectElementExistOrNot(true);
		todayBean.textViewMine.expectElementExistOrNot(true);
		todayBean.textViewMine.click();
		lazyDriver.handleFailure("screen test:");
		mineBean.login.expectElementExistOrNot(true);
		mineBean.login.click();
		loginBean.jdpayAccount.expectElementExistOrNot(true);
		loginBean.jdpayAccount.click();
		loginBean.editTextPhone.input("13034631475");
		loginBean.nextStep.click();
		loginBean.editjdPayTextPwd.expectElementExistOrNot(true);
		loginBean.editjdPayTextPwd.input("haha123");
		loginBean.jdpayLogin.click();		
		lazyDriver.swipeToLeft();
	}
	
	/**
	 * 转账操作
	 * @throws InterruptedException
	 */
	public void doTranAccount() throws InterruptedException {
		logger.info("transfer accounts!");
		todayBean.textViewLife.click();
		lazyDriver.swipeDown();
		lazyDriver.swipeToLeft();
		lifeBean2.textViewTransAccount.click();
		WebElement wl = lazyDriver.findElementByText("转账给朋友");
		wl.click();
		Thread.sleep(1000);
		lazyDriver.goBack();
		lazyDriver.goBack();
	}
}
