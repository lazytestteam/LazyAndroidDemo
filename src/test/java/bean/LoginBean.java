package test.java.bean;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


/**
 * Gennerated by lazyUiautomaterViewer.
 */
public class LoginBean extends BaseBean{


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.wangyin.payment:id/txt_main_title']"})
    @Description(description="登录")
    public  PlainText  textView1;


    @Xpath(xpath={"//android.view.View[@resource-id='com.wangyin.payment:id/view_divider_line']"})
    @Description(description="")
    public  View  view1;


    @Xpath(xpath={"//android.widget.ScrollView[@resource-id='com.wangyin.payment:id/fragment_container']"})
    @Description(description="")
    public  View  scrollView2;


    @Xpath(xpath={"//android.widget.RadioGroup[@resource-id='com.wangyin.payment:id/main_footbar_menu']"})
    @Description(description="")
    public  View  radioGroup3;


    @Xpath(xpath={"//android.widget.RadioButton[@resource-id='com.wangyin.payment:id/login_tab_phone']"})
    @Description(description="钱包账户")
    public  Click  jdpayAccount;


    @Xpath(xpath={"//android.widget.RadioButton[@resource-id='com.wangyin.payment:id/login_tab_jd']"})
    @Description(description="京东账户")
    public  Click  jdAccount;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/layout_login_jd']/android.view.View[1]"})
    @Description(description="")
    public  View  view4;


    @Xpath(xpath={"//android.widget.EditText[@resource-id='com.wangyin.payment:id/cp_input_combox_jd']"})
    @Description(description="京东商城手机号/用户名/邮箱")
    public  Text  editTextUserName;


    @Xpath(xpath={"//android.widget.TextView[@text='账号']"})
    @Description(description="账号")
    public  PlainText  textView2;


    @Xpath(xpath={"//android.widget.ImageView"})
    @Description(description="")
    public  View  imageView5;


    @Xpath(xpath={"//android.widget.EditText[@resource-id='com.wangyin.payment:id/cp_input_pwd']"})
    @Description(description="")
    public  Text  editJDTextPwd;


    @Xpath(xpath={"//android.widget.TextView[@text='密码']"})
    @Description(description="密码")
    public  PlainText  textView3;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.wangyin.payment:id/layout_login_jd']/android.view.View[2]"})
    @Description(description="")
    public  View  view6;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.wangyin.payment:id/btn_login_jd']"})
    @Description(description="登 录")
    public  Click  buttonLogin;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.wangyin.payment:id/txt_jd_register']"})
    @Description(description="注册京东账户")
    public  PlainText  textView4;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.wangyin.payment:id/txt_forget_pwd']"})
    @Description(description="忘记密码？")
    public  PlainText  textView5;

    
    @Xpath(xpath={"//android.widget.EditText[@resource-id='com.wangyin.payment:id/cp_input_combox_wy']"})
    @Description(description="请填写手机号")
    public  Text  editTextPhone;


    @Xpath(xpath={"//android.widget.TextView[@text='手机号']"})
    @Description(description="手机号")
    public  PlainText  textViewPhone;
    
   
    @Xpath(xpath={"//android.widget.Button[@resource-id='com.wangyin.payment:id/btn_login']"})
    @Description(description="下一步")
    public  Click  nextStep;
    
    @Xpath(xpath={"//android.widget.EditText[@resource-id='com.wangyin.payment:id/cp_input_pwd']"})
    @Description(description="")
    public  Text  editjdPayTextPwd;


    @Xpath(xpath={"//android.widget.TextView[@text='密码']"})
    @Description(description="密码")
    public  PlainText  textViewPwd;
    
    @Xpath(xpath={"//android.widget.Button[@resource-id='com.wangyin.payment:id/btn_login']"})
    @Description(description="登 录")
    public  Click  jdpayLogin;

    public LoginBean(AppiumDriver aDriver){super(aDriver);}

}