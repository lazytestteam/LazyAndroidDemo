package test.java.bean;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


public class MineBean extends BaseBean{


    @Xpath(xpath={"//android.support.v4.view.ViewPager[@resource-id='com.wangyin.payment:id/viewpager_main']"})
    @Description(description="")
    public  View  viewPager1;


    @Xpath(xpath={"//android.widget.ScrollView[@resource-id='com.wangyin.payment:id/scrollview']"})
    @Description(description="")
    public  View  scrollView2;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.wangyin.payment:id/txt_unlogin']"})
    @Description(description="马上登录")
    public  PlainText  login;


    @Xpath(xpath={"//android.widget.TextView[@text='开启财富人生']"})
    @Description(description="开启财富人生")
    public  PlainText  textView2;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/account_fragment']/android.view.View[1]"})
    @Description(description="")
    public  View  view3;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/account_fragment']/android.view.View[2]"})
    @Description(description="")
    public  View  view4;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.wangyin.payment:id/txt_flow_title' and @text='最新收益']"})
    @Description(description="最新收益")
    public  PlainText  textView3;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.wangyin.payment:id/txt_flow_des' and @text='查看详情']"})
    @Description(description="查看详情")
    public  PlainText  textView4;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/config_view']/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView5;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/config_view']/android.widget.LinearLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view6;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/account_grid_view']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView7;


    @Xpath(xpath={"//android.widget.TextView[@text='京东小金库']"})
    @Description(description="京东小金库")
    public  PlainText  textView5;


    @Xpath(xpath={"//android.widget.TextView[@text='随存随取']"})
    @Description(description="随存随取")
    public  PlainText  textView6;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/account_grid_view']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView8;


    @Xpath(xpath={"//android.widget.TextView[@text='基金理财']"})
    @Description(description="基金理财")
    public  PlainText  textView7;


    @Xpath(xpath={"//android.widget.TextView[@text='费率0折起']"})
    @Description(description="费率0折起")
    public  PlainText  textView8;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/account_grid_view']/android.view.View[1]"})
    @Description(description="")
    public  View  view9;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/account_grid_view']/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView10;


    @Xpath(xpath={"//android.widget.TextView[@text='京东旺财']"})
    @Description(description="京东旺财")
    public  PlainText  textView9;


    @Xpath(xpath={"//android.widget.TextView[@text='安心理财 ']"})
    @Description(description="安心理财 ")
    public  PlainText  textView10;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/account_grid_view']/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView11;


    @Xpath(xpath={"//android.widget.TextView[@text='京东股神']"})
    @Description(description="京东股神")
    public  PlainText  textView11;


    @Xpath(xpath={"//android.widget.TextView[@text='真股神，战出来']"})
    @Description(description="真股神，战出来")
    public  PlainText  textView12;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/account_grid_view']/android.view.View[2]"})
    @Description(description="")
    public  View  view12;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/account_grid_view']/android.widget.LinearLayout[3]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView13;


    @Xpath(xpath={"//android.widget.TextView[@text='定期理财']"})
    @Description(description="定期理财")
    public  PlainText  textView13;


    @Xpath(xpath={"//android.widget.TextView[@text='天天有收益']"})
    @Description(description="天天有收益")
    public  PlainText  textView14;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/config_view']/android.view.View[1]"})
    @Description(description="")
    public  View  view14;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/config_view']/android.view.View[2]"})
    @Description(description="")
    public  View  view15;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/config_view']/android.view.View[3]"})
    @Description(description="")
    public  View  view16;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.wangyin.payment:id/txt_flow_title' and @text='我的信用财富']"})
    @Description(description="我的信用财富")
    public  PlainText  textView15;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.wangyin.payment:id/txt_flow_des' and @text='电子凭证等']"})
    @Description(description="电子凭证等")
    public  PlainText  textView16;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/config_view']/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView17;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.wangyin.payment:id/img_set']"})
    @Description(description="")
    public  View  imageView18;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.wangyin.payment:id/txt_name']"})
    @Description(description="我的")
    public  PlainText  textView17;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.wangyin.payment:id/img_notice']"})
    @Description(description="")
    public  View  imageView19;


    @Xpath(xpath={"//android.view.View[@resource-id='com.wangyin.payment:id/txt_remind_dot']"})
    @Description(description="")
    public  View  view20;


    @Xpath(xpath={"//android.view.View[@resource-id='com.wangyin.payment:id/view_divider_line']"})
    @Description(description="")
    public  View  view21;


    @Xpath(xpath={"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.LinearLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view22;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.wangyin.payment:id/tabview_today']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView23;


    @Xpath(xpath={"//android.widget.TextView[@text='今天']"})
    @Description(description="今天")
    public  PlainText  textView18;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.wangyin.payment:id/tabview_finance']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView24;


    @Xpath(xpath={"//android.widget.TextView[@text='理财']"})
    @Description(description="理财")
    public  PlainText  textView19;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.wangyin.payment:id/tabview_life']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView25;


    @Xpath(xpath={"//android.widget.TextView[@text='生活']"})
    @Description(description="生活")
    public  PlainText  textView20;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.wangyin.payment:id/tabview_mine']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView26;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.wangyin.payment:id/tabview_mine']/android.widget.TextView[1]"})
    @Description(description="我的")
    public  PlainText  textView21;


    @Xpath(xpath={"//android.widget.FrameLayout[@resource-id='com.wangyin.payment:id/tabview_main']/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView27;




    public MineBean(AppiumDriver aDriver){super(aDriver);}

}