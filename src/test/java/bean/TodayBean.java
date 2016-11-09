package test.java.bean;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


public class TodayBean extends BaseBean{


    @Xpath(xpath={"//android.widget.LinearLayout/android.support.v4.view.ViewPager[1]"})
    @Description(description="")
    public  View  viewPager1;


    @Xpath(xpath={"//android.widget.ScrollView[@resource-id='com.wangyin.payment:id/scrollview']"})
    @Description(description="")
    public  View  scrollView2;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.wangyin.payment:id/img_activity']"})
    @Description(description="")
    public  View  imageView3;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/appview']/android.view.View[1]"})
    @Description(description="")
    public  View  view4;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/appview_left_recomd']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView5;


    @Xpath(xpath={"//android.widget.TextView[@text='扫一扫']"})
    @Description(description="扫一扫")
    public  PlainText  textView1;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/appview_right_recomd']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView6;


    @Xpath(xpath={"//android.widget.TextView[@text='付款码']"})
    @Description(description="付款码")
    public  PlainText  textView2;


    @Xpath(xpath={"//android.view.View[@resource-id='com.wangyin.payment:id/view_divider']"})
    @Description(description="")
    public  View  view7;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/appview_first']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView8;


    @Xpath(xpath={"//android.widget.TextView[@text='拍立返']"})
    @Description(description="拍立返")
    public  PlainText  textView3;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/appview_secd']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView9;


    @Xpath(xpath={"//android.widget.TextView[@text='手机充值']"})
    @Description(description="手机充值")
    public  PlainText  textView4;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/appview_third']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView10;


    @Xpath(xpath={"//android.widget.TextView[@text='信用卡还款']"})
    @Description(description="信用卡还款")
    public  PlainText  textView5;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/appview_all']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView11;


    @Xpath(xpath={"//android.widget.TextView[@text='全部应用']"})
    @Description(description="全部应用")
    public  PlainText  textView6;


    @Xpath(xpath={"//android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.view.View[1]"})
    @Description(description="")
    public  View  view12;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.wangyin.payment:id/view_banner']/android.support.v4.view.ViewPager[1]"})
    @Description(description="")
    public  View  viewPager13;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.wangyin.payment:id/imgview_banner']"})
    @Description(description="")
    public  View  imageView14;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/page_control']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView15;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/page_control']/android.widget.ImageView[2]"})
    @Description(description="")
    public  View  imageView16;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/page_control']/android.widget.ImageView[3]"})
    @Description(description="")
    public  View  imageView17;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/page_control']/android.widget.ImageView[4]"})
    @Description(description="")
    public  View  imageView18;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/page_control']/android.widget.ImageView[5]"})
    @Description(description="")
    public  View  imageView19;


    @Xpath(xpath={"//android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.view.View[2]"})
    @Description(description="")
    public  View  view20;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.wangyin.payment:id/imageview_card_recommend_title']"})
    @Description(description="")
    public  View  imageView21;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.wangyin.payment:id/textview_card_recommend_navigation_title']"})
    @Description(description="")
    public  PlainText  textView7;


    @Xpath(xpath={"//android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView22;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.wangyin.payment:id/text_title' and @text='饮料免费喝']"})
    @Description(description="饮料免费喝")
    public  PlainText  textView8;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.wangyin.payment:id/text_desc' and @text='统一阿萨姆奶茶']"})
    @Description(description="统一阿萨姆奶茶")
    public  PlainText  textView9;


    @Xpath(xpath={"//android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView23;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.wangyin.payment:id/text_title' and @text='1元得苹果电脑']"})
    @Description(description="1元得苹果电脑")
    public  PlainText  textView10;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.wangyin.payment:id/text_desc' and @text='高端尽在京东夺宝']"})
    @Description(description="高端尽在京东夺宝")
    public  PlainText  textView11;


    @Xpath(xpath={"//android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView24;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.wangyin.payment:id/text_title' and @text='充话费打白条']"})
    @Description(description="充话费打白条")
    public  PlainText  textView12;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.wangyin.payment:id/text_desc' and @text='免费通话一个月']"})
    @Description(description="免费通话一个月")
    public  PlainText  textView13;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.wangyin.payment:id/view_floating_imageview']"})
    @Description(description="")
    public  View  imageView25;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.wangyin.payment:id/txt_left_login']"})
    @Description(description="登录")
    public  PlainText  textView14;


    @Xpath(xpath={"//android.widget.RelativeLayout/android.view.View[1]"})
    @Description(description="")
    public  View  view26;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.wangyin.payment:id/img_right_record']"})
    @Description(description="")
    public  View  imageView27;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.wangyin.payment:id/img_right_explore']"})
    @Description(description="")
    public  View  imageView28;


    @Xpath(xpath={"//android.view.View[@resource-id='com.wangyin.payment:id/txt_remind_dot']"})
    @Description(description="")
    public  View  view29;


    @Xpath(xpath={"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.LinearLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view30;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.wangyin.payment:id/tabview_today']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView31;


    @Xpath(xpath={"//android.widget.TextView[@text='今天']"})
    @Description(description="今天")
    public  PlainText  textViewToday;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.wangyin.payment:id/tabview_finance']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView32;


    @Xpath(xpath={"//android.widget.TextView[@text='理财']"})
    @Description(description="理财")
    public  PlainText  textView16;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.wangyin.payment:id/tabview_life']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView33;


    @Xpath(xpath={"//android.widget.TextView[@text='生活']"})
    @Description(description="生活")
    public  PlainText  textViewLife;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.wangyin.payment:id/tabview_mine']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView34;


    @Xpath(xpath={"//android.widget.TextView[@text='我的']"})
    @Description(description="我的")
    public  PlainText  textViewMine;


    @Xpath(xpath={"//android.widget.FrameLayout[@resource-id='com.wangyin.payment:id/tabview_main']/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView35;


    public TodayBean(AppiumDriver aDriver){super(aDriver);}

}