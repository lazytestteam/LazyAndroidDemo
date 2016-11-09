package test.java.bean;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


public class LifeBean extends BaseBean{


    @Xpath(xpath={"//android.support.v4.view.ViewPager[@resource-id='com.wangyin.payment:id/viewpager_main']"})
    @Description(description="")
    public  View  viewPager1;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='android:id/list']"})
    @Description(description="")
    public  View  listView2;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.wangyin.payment:id/viewpager_app_module']/android.support.v4.view.ViewPager[1]"})
    @Description(description="")
    public  View  viewPager3;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/cp_grid_view']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView4;


    @Xpath(xpath={"//android.widget.TextView[@text='京东白拿']"})
    @Description(description="京东白拿")
    public  PlainText  textView1;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.wangyin.payment:id/view_module_badge' and @text='NEW']"})
    @Description(description="NEW")
    public  PlainText  textView2;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/cp_grid_view']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView5;


    @Xpath(xpath={"//android.widget.TextView[@text='京东红包']"})
    @Description(description="京东红包")
    public  PlainText  textView3;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/cp_grid_view']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView6;


    @Xpath(xpath={"//android.widget.TextView[@text='定期还款']"})
    @Description(description="定期还款")
    public  PlainText  textView4;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/cp_grid_view']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[4]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView7;


    @Xpath(xpath={"//android.widget.TextView[@text='手机充值']"})
    @Description(description="手机充值")
    public  PlainText  textView5;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/cp_grid_view']/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView8;


    @Xpath(xpath={"//android.widget.TextView[@text='信用卡还款']"})
    @Description(description="信用卡还款")
    public  PlainText  textView6;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/cp_grid_view']/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView9;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/cp_grid_view']/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]"})
    @Description(description="惠加油")
    public  PlainText  textView7;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.wangyin.payment:id/view_module_badge' and @text='享折扣']"})
    @Description(description="享折扣")
    public  PlainText  textView8;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/cp_grid_view']/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView10;


    @Xpath(xpath={"//android.widget.TextView[@text='话费卡转让']"})
    @Description(description="话费卡转让")
    public  PlainText  textView9;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/cp_grid_view']/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView11;


    @Xpath(xpath={"//android.widget.TextView[@text='火车票']"})
    @Description(description="火车票")
    public  PlainText  textView10;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/cp_grid_view']/android.widget.LinearLayout[3]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView12;


    @Xpath(xpath={"//android.widget.TextView[@text='拍立返']"})
    @Description(description="拍立返")
    public  PlainText  textView11;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/cp_grid_view']/android.widget.LinearLayout[3]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView13;


    @Xpath(xpath={"//android.widget.TextView[@text='京东夺宝']"})
    @Description(description="京东夺宝")
    public  PlainText  textView12;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/cp_grid_view']/android.widget.LinearLayout[3]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView14;


    @Xpath(xpath={"//android.widget.TextView[@text='京东特卖']"})
    @Description(description="京东特卖")
    public  PlainText  textView13;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/cp_grid_view']/android.widget.LinearLayout[3]/android.widget.RelativeLayout[4]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView15;


    @Xpath(xpath={"//android.widget.TextView[@text='京东订单']"})
    @Description(description="京东订单")
    public  PlainText  textView14;


    @Xpath(xpath={"//android.support.v4.view.ViewPager[@resource-id='com.wangyin.payment:id/common_viewPager']/android.widget.RelativeLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view16;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.wangyin.payment:id/viewpager_app_module']/android.view.View[1]"})
    @Description(description="")
    public  View  view17;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.wangyin.payment:id/textview_card_title']"})
    @Description(description="惠加油")
    public  PlainText  textView15;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.wangyin.payment:id/textview_card_subtitle']"})
    @Description(description="折扣专享")
    public  PlainText  textView16;


    @Xpath(xpath={"//android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view18;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[2]"})
    @Description(description="")
    public  View  view19;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.wangyin.payment:id/viewpager_recommend']/android.support.v4.view.ViewPager[1]"})
    @Description(description="")
    public  View  viewPager20;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.wangyin.payment:id/image_icon']"})
    @Description(description="")
    public  View  imageView21;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.wangyin.payment:id/viewpager_recommend']/android.view.View[1]"})
    @Description(description="")
    public  View  view22;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.wangyin.payment:id/txt_main_title']"})
    @Description(description="生活")
    public  PlainText  textView17;


    @Xpath(xpath={"//android.view.View[@resource-id='com.wangyin.payment:id/view_divider_line']"})
    @Description(description="")
    public  View  view23;


    @Xpath(xpath={"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.LinearLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view24;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.wangyin.payment:id/tabview_today']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView25;


    @Xpath(xpath={"//android.widget.TextView[@text='今天']"})
    @Description(description="今天")
    public  PlainText  textView18;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.wangyin.payment:id/tabview_finance']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView26;


    @Xpath(xpath={"//android.widget.TextView[@text='理财']"})
    @Description(description="理财")
    public  PlainText  textView19;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.wangyin.payment:id/tabview_life']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView27;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.wangyin.payment:id/tabview_life']/android.widget.TextView[1]"})
    @Description(description="生活")
    public  PlainText  textView20;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.wangyin.payment:id/tabview_mine']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView28;


    @Xpath(xpath={"//android.widget.TextView[@text='我的']"})
    @Description(description="我的")
    public  PlainText  textView21;


    @Xpath(xpath={"//android.widget.FrameLayout[@resource-id='com.wangyin.payment:id/tabview_main']/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView29;

    public LifeBean(AppiumDriver aDriver){super(aDriver);}

}