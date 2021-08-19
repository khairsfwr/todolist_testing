package todolist;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;

public class Element extends BaseClass {

	/*
	 * final private static String plus_sign_resource_Id =
	 * "com.splendapps.splendo:id/fabAddTask"; final private static String
	 * right_sign_resource_Id = "com.splendapps.splendo:id/fabSaveTask"; final
	 * private static String right_sign_resource_Id =
	 * "com.splendapps.splendo:id/fabSaveTask";
	 */

	private static MobileElement screenTitle = null;
	private static MobileElement plusSign = null;
	private static MobileElement backBtn = null;
	private static MobileElement rightSign = null;
	private static MobileElement nTWITBD = null;
	private static MobileElement nTDate = null;
	private static MobileElement nTTime = null;
	private static MobileElement nTRepeat = null;
	private static MobileElement nTAdd2$ = null;
	private static MobileElement nTNew$Btn = null;
	private static MobileElement toastMsg = null;
	private static MobileElement cldrOk = null;
	private static MobileElement cldrCancel = null;
	private static MobileElement cldrContent = null;
	private static MobileElement aLTask = null;
	private static MobileElement nTAdd2$Item = null;
	private static MobileElement clockH = null;
	private static MobileElement clockM = null;
	private static MobileElement clockUnit = null;
	private static MobileElement clockOk = null;
	private static MobileElement clockCancel = null;
	private static MobileElement nTRepeatItem = null;
	private static MobileElement searchBtn = null;
	private static MobileElement aLCategoryBtn = null;
	private static MobileElement aLCategoryBtnItem = null;
	
	public static MobileElement getaLCategoryBtnItem() {
		return aLCategoryBtnItem;
	}

	public static void setaLCategoryBtnItem(String text) {
		Element.aLCategoryBtnItem = androidDriver.findElementByXPath("//android.widget.TextView[@text='"+text+"']");
	}
	
	public static MobileElement getaLCategoryBtn() {
		Element.aLCategoryBtn = androidDriver.findElementById("com.splendapps.splendo:id/spinnerToolbar");
		return aLCategoryBtn;
	}
	
	public static MobileElement getSearchBtn() {
		Element.searchBtn = androidDriver.findElementById("com.splendapps.splendo:id/action_search");
		return searchBtn;
	}
	
	public static MobileElement getnTRepeatItem() {
		return nTRepeatItem;
	}

	public static void setnTRepeatItem(String text) {
		Element.nTRepeatItem = androidDriver.findElementByXPath("//android.widget.TextView[@text='"+text+"']");
	}
	
	public static MobileElement getClockCancel() {
		Element.clockCancel = androidDriver.findElementById("android:id/button2");
		return clockCancel;
	}

	public static MobileElement getClockOk() {
		Element.clockOk = androidDriver.findElementById("android:id/button1");
		return clockOk;
	}
	
	public static MobileElement getclockH() {
		return clockH;
	}

	public static void setclockH(String hour) {
		Element.clockH = androidDriver.findElementByXPath("//*[@content-desc='" + hour + "']");
	}
	
	public static MobileElement getclockM() {
		return clockM;
	}

	public static void setclockM(String minute) {
		Element.clockM = androidDriver.findElementByXPath("//*[@content-desc='" + minute + "']");
	}
	
	public static MobileElement getClockUnit() {
		return clockUnit;
	}

	public static void setClockUnit(String text) {
		Element.clockUnit = androidDriver.findElementByXPath("//android.widget.RadioButton[@text='"+text+"']");
	}
	
	public static MobileElement getnTAdd2$Item() {
		return nTAdd2$Item;
	}

	public static void setnTAdd2$Item(String text) {
		Element.nTAdd2$Item = androidDriver.findElementByXPath("//android.widget.TextView[@text='"+text+"']");
	}
	
	public static MobileElement getaLTask() {
		return aLTask;
	}

	public static void setaLTask(String text) {
		Element.aLTask = androidDriver.findElementByXPath("//android.widget.TextView[@text='"+text+"']");
	}

	public static MobileElement getCldrContent() {
		return cldrContent;
	}

	public static void setCldrContent(String date) {
		Element.cldrContent = androidDriver.findElementByXPath("//android.view.View[@content-desc='" + date + "']");
	}

	public static MobileElement getCldrCancel() {
		Element.cldrCancel = androidDriver.findElementById("android:id/button2");
		return cldrCancel;
	}

	public static MobileElement getCldrOk() {
		Element.cldrOk = androidDriver.findElementById("android:id/button1");
		return cldrOk;
	}

	public static MobileElement getToastMsg() {
		Element.toastMsg = androidDriver.findElementById("com.splendapps.splendo:id/snackbar_text");
		return toastMsg;
	}

	public static MobileElement getRightSign() {
		Element.rightSign = androidDriver.findElementById("com.splendapps.splendo:id/fabSaveTask");
		return rightSign;
	}

	public static MobileElement getnTWITBD() {
		Element.nTWITBD = androidDriver.findElementById("com.splendapps.splendo:id/edtTaskName");
		return nTWITBD;
	}

	public static MobileElement getnTDate() {
		Element.nTDate = androidDriver.findElementById("com.splendapps.splendo:id/edtDueD");
		return nTDate;
	}

	public static MobileElement getnTTime() {
		Element.nTTime = androidDriver.findElementById("com.splendapps.splendo:id/edtDueT");
		return nTTime;
	}

	public static MobileElement getnTRepeat() {
		Element.nTRepeat = androidDriver.findElementById("com.splendapps.splendo:id/spinnerRepeat");
		return nTRepeat;
	}

	public static MobileElement getnTAdd2$() {
		Element.nTAdd2$ = androidDriver.findElementById("com.splendapps.splendo:id/spinnerLists");
		return nTAdd2$;
	}

	public static MobileElement getnTNew$Btn() {
		Element.nTNew$Btn = androidDriver.findElementById("com.splendapps.splendo:id/btnAddList");
		return nTNew$Btn;
	}

	public static MobileElement getScreenTitle() {
		return screenTitle;
	}

	public static void setScreenTitle(String text) {
		Element.screenTitle = androidDriver.findElementByXPath("//*[contains(@text, '" + text + "')]");
	}

	public static MobileElement getPlusSign() {
		Element.plusSign = androidDriver.findElementById("com.splendapps.splendo:id/fabAddTask");
		return plusSign;
	}

	public static MobileElement getBackBtn() {
		Element.backBtn = androidDriver.findElementByXPath("//android.widget.ImageButton[@content-desc='Navigate up']");
		return backBtn;
	}

//	List<AndroidDriver> elementList = ((AndroidDriver) androidDriver).
//  findElements(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + "New Task" + "\")"));

}
