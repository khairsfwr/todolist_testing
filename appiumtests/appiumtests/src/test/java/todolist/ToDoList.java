package todolist;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ToDoList extends BaseClass {

	@Test
	public void tc1() throws IOException, ParseException, InterruptedException {
		final String title = "New Task";
		Element.getPlusSign().click();
		Thread.sleep(2000);
		Element.setScreenTitle(title);
		Element.getScreenTitle();
		System.out.println("CurrentScreen:" + Element.getScreenTitle().getText());
		Assert.assertEquals(Element.getScreenTitle().getText(), title);

////		Element.getBackBtn().click();
	}

	@Test
	public void tc2() throws IOException, ParseException, InterruptedException {
		String title = "New Task";
		Element.getPlusSign().click();
		Thread.sleep(2000);
		androidDriver.hideKeyboard();
		Element.setScreenTitle(title);
		Element.getScreenTitle();
		System.out.println("CurrentScreen:" + Element.getScreenTitle().getText());
		Element.getRightSign().click();
		Thread.sleep(200);
		// TODO: screenshot and extract image
		capture();
		final String toastText = "Enter task at first";
		Assert.assertEquals(Element.getToastMsg().getText(), toastText);

////		Element.getBackBtn().click();
	}

	@Test
	public void tc3() throws IOException, ParseException, InterruptedException {
		String title = "New Task";
		Element.getPlusSign().click();
		Thread.sleep(2000);
		androidDriver.hideKeyboard();
		Element.setScreenTitle(title);
		Element.getScreenTitle();
		System.out.println("CurrentScreen:" + Element.getScreenTitle().getText());
		// TODO: get by passing the tcId
		JSONObject tcObj = (JSONObject) newTaskObj.get(2);
		JSONObject tcObjData = (JSONObject) tcObj.get("data");

		Element.getnTWITBD().sendKeys(tcObjData.get("What is to be done").toString());
		Element.getRightSign().click();
		Thread.sleep(1000);
		final String toastText = "Task Added";
		Assert.assertEquals(Element.getToastMsg().getText(), toastText);
		title = "All Lists";
		Element.setScreenTitle(title);
		Element.getScreenTitle();
		System.out.println("CurrentScreen:" + Element.getScreenTitle().getText());
		Assert.assertEquals(Element.getScreenTitle().getText(), title);
		Element.setaLTask(tcObjData.get("What is to be done").toString());
		Assert.assertEquals(Element.getaLTask().getText(), tcObjData.get("What is to be done").toString());

	}

	@Test
	public void tc4() throws IOException, ParseException, InterruptedException {
		String title = "New Task";
		Element.getPlusSign().click();
		Thread.sleep(2000);
		androidDriver.hideKeyboard();
		Element.setScreenTitle(title);
		Element.getScreenTitle();
		System.out.println("CurrentScreen:" + Element.getScreenTitle().getText());
		JSONObject tcObj = (JSONObject) newTaskObj.get(3);
		JSONObject tcObjData = (JSONObject) tcObj.get("data");
		JSONObject tcObjDate = (JSONObject) tcObjData.get("Due Date");
		Element.getnTWITBD().sendKeys(tcObjData.get("What is to be done").toString());
		Element.getnTDate().click();
		Thread.sleep(2000);
		Element.setCldrContent(tcObjDate.get("Date").toString());
		Element.getCldrContent().click();
		Element.getCldrOk().click();
		Thread.sleep(1000);
		Assert.assertTrue(Element.getnTTime().isDisplayed());
		Assert.assertTrue(Element.getnTRepeat().isDisplayed());
		Element.getRightSign().click();
		Thread.sleep(1000);
		final String toastText = "Task Added";
		Assert.assertEquals(Element.getToastMsg().getText(), toastText);
		title = "All Lists";
		Element.setScreenTitle(title);
		Element.getScreenTitle();
		System.out.println("CurrentScreen:" + Element.getScreenTitle().getText());
		Assert.assertEquals(Element.getScreenTitle().getText(), title);
		Element.setaLTask(tcObjData.get("What is to be done").toString());
		Assert.assertEquals(Element.getaLTask().getText(), tcObjData.get("What is to be done").toString());
	}

	@Test
	public void tc5() throws IOException, ParseException, InterruptedException {
		String title = "New Task";
		Element.getPlusSign().click();
		Thread.sleep(2000);
		androidDriver.hideKeyboard();
		Element.setScreenTitle(title);
		Element.getScreenTitle();
		System.out.println("CurrentScreen:" + Element.getScreenTitle().getText());
		JSONObject tcObj = (JSONObject) newTaskObj.get(4);
		JSONObject tcObjData = (JSONObject) tcObj.get("data");
		JSONObject tcObjDate = (JSONObject) tcObjData.get("Due Date");
		Element.getnTWITBD().sendKeys(tcObjData.get("What is to be done").toString());
		Element.getnTDate().click();
		Thread.sleep(2000);
		Element.setCldrContent(tcObjDate.get("Date").toString());
		Element.getCldrContent().click();
		Element.getCldrOk().click();
		Thread.sleep(1000);
		Assert.assertTrue(Element.getnTTime().isDisplayed());
		Assert.assertTrue(Element.getnTRepeat().isDisplayed());

		Element.getnTAdd2$().click();
		Thread.sleep(1000);
		Element.setnTAdd2$Item(tcObjData.get("Add to List").toString());
		Element.getnTAdd2$Item().click();

		Element.getRightSign().click();
		Thread.sleep(1000);
		final String toastText = "Task Added";
		Assert.assertEquals(Element.getToastMsg().getText(), toastText);
		title = "All Lists";
		Element.setScreenTitle(title);
		Element.getScreenTitle();
		System.out.println("CurrentScreen:" + Element.getScreenTitle().getText());
		Assert.assertEquals(Element.getScreenTitle().getText(), title);
		Element.setaLTask(tcObjData.get("What is to be done").toString());
		Assert.assertEquals(Element.getaLTask().getText(), tcObjData.get("What is to be done").toString());

	}

	@Test
	public void tc6() throws IOException, ParseException, InterruptedException {
		String title = "New Task";
		Element.getPlusSign().click();
		Thread.sleep(2000);
		androidDriver.hideKeyboard();
		Element.setScreenTitle(title);
		Element.getScreenTitle();
		System.out.println("CurrentScreen:" + Element.getScreenTitle().getText());
		JSONObject tcObj = (JSONObject) newTaskObj.get(5);
		JSONObject tcObjData = (JSONObject) tcObj.get("data");
		JSONObject tcObjDate = (JSONObject) tcObjData.get("Due Date");
		Element.getnTWITBD().sendKeys(tcObjData.get("What is to be done").toString());
		Element.getnTDate().click();
		Thread.sleep(2000);
		Element.setCldrContent(tcObjDate.get("Date").toString());
		Element.getCldrContent().click();
		Element.getCldrOk().click();
		Thread.sleep(1000);
		Assert.assertTrue(Element.getnTTime().isDisplayed());
		Assert.assertTrue(Element.getnTRepeat().isDisplayed());

		Element.getnTTime().click();
		String[] time = tcObjDate.get("Time").toString().split(":");
		Element.setclockH(time[0].toString());
		Element.getclockH().click();
		Thread.sleep(1000);
		Element.setclockM(time[1].toString());
		Element.getclockM().click();
		String[] unit = time[2].split(" ");
		Element.setClockUnit(unit[1].toString());
		Element.getClockUnit().click();
		Element.getClockOk().click();

		Element.getnTRepeat().click();
		Thread.sleep(1000);
		Element.setnTRepeatItem(tcObjData.get("Repeat").toString());
		Element.getnTRepeatItem().click();

		Element.getnTAdd2$().click();
		Thread.sleep(1000);
		Element.setnTAdd2$Item(tcObjData.get("Add to List").toString());
		Element.getnTAdd2$Item().click();

		Element.getRightSign().click();
		Thread.sleep(1000);
		final String toastText = "Task Added";
		Assert.assertEquals(Element.getToastMsg().getText(), toastText);
		title = "All Lists";
		Element.setScreenTitle(title);
		Element.getScreenTitle();
		System.out.println("CurrentScreen:" + Element.getScreenTitle().getText());
		Assert.assertEquals(Element.getScreenTitle().getText(), title);
		Element.setaLTask(tcObjData.get("What is to be done").toString());
		Assert.assertEquals(Element.getaLTask().getText(), tcObjData.get("What is to be done").toString());

	}

	@Test
	public void tc7() throws IOException, ParseException, InterruptedException {
		Element.getSearchBtn().click();
		androidDriver.hideKeyboard();
		Thread.sleep(1000);
		JSONObject obj = searchObj.get(0);
		androidDriver.findElementById("com.splendapps.splendo:id/search_src_text")
				.sendKeys(obj.get("search").toString());
		Thread.sleep(1000);
		String msg = androidDriver.findElementById("com.splendapps.splendo:id/tvEmpty").getText();
		Assert.assertEquals(msg.trim(), obj.get("search").toString() + " not found");
////		Element.getaLCategoryBtn().click();
	}

	@Test
	public void tc8() throws IOException, ParseException, InterruptedException {
		Element.getPlusSign().click();
		Thread.sleep(500);
		androidDriver.hideKeyboard();
		int x = 0;
		for (JSONObject i : newTaskObj) {
			JSONObject data = (JSONObject) i.get("data");
			if (data.get("What is to be done") != null) {
				Element.getnTWITBD().sendKeys(data.get("What is to be done").toString());
				Element.getRightSign().click();
				Thread.sleep(500);
				if (x < newTaskObj.size() - 1) {
					Element.getPlusSign().click();
					Thread.sleep(500);
					androidDriver.hideKeyboard();
				}
			}
			x++;
		}

		Element.getSearchBtn().click();
		androidDriver.hideKeyboard();
		Thread.sleep(1000);
		for (JSONObject i : newTaskObj) {
			JSONObject data = (JSONObject) i.get("data");
			if (data.get("What is to be done") != null) {
				androidDriver.findElementById("com.splendapps.splendo:id/search_src_text")
						.sendKeys(data.get("What is to be done").toString());
				Thread.sleep(2000);
				Element.setaLTask(data.get("What is to be done").toString());
				Assert.assertEquals(Element.getaLTask().getText(), data.get("What is to be done").toString());
				androidDriver.findElementById("com.splendapps.splendo:id/search_src_text").clear();
			}

		}

	}

	@Test
	public void tc9() throws IOException, ParseException, InterruptedException {
		Element.getPlusSign().click();
		Thread.sleep(2000);
		androidDriver.hideKeyboard();
		JSONObject tcObj = (JSONObject) newTaskObj.get(2);
		JSONObject tcObjData = (JSONObject) tcObj.get("data");
		Element.getnTWITBD().sendKeys(tcObjData.get("What is to be done").toString());
		Element.getRightSign().click();
		Thread.sleep(1000);

		Element.getaLCategoryBtn().click();
		Thread.sleep(1000);
		Element.setaLCategoryBtnItem("Work");
		Element.getaLCategoryBtnItem().click();
		Thread.sleep(1000);
		String msg = androidDriver.findElementById("com.splendapps.splendo:id/tvEmpty").getText();
		Assert.assertEquals(msg.trim(), "List Work is empty");
		Element.getSearchBtn().click();
		androidDriver.hideKeyboard();
		Thread.sleep(1000);
		androidDriver.findElementById("com.splendapps.splendo:id/search_src_text")
				.sendKeys(tcObjData.get("What is to be done").toString());
		Thread.sleep(2000);
		Element.setaLTask(tcObjData.get("What is to be done").toString());
		Assert.assertEquals(Element.getaLTask().getText(), tcObjData.get("What is to be done").toString());
//		Assert.assertEquals(msg.trim(), tcObjData.get("search").toString() + " not found");
	}

	@Test
	public void tc10() throws IOException, ParseException, InterruptedException {
		Element.getPlusSign().click();
		Thread.sleep(2000);
		androidDriver.hideKeyboard();
		JSONObject tcObj = (JSONObject) newTaskObj.get(5);
		JSONObject tcObjData = (JSONObject) tcObj.get("data");
		JSONObject tcObjDate = (JSONObject) tcObjData.get("Due Date");
		Element.getnTWITBD().sendKeys(tcObjData.get("What is to be done").toString());
		Element.getnTDate().click();
		Thread.sleep(2000);
		Element.setCldrContent(tcObjDate.get("Date").toString());
		Element.getCldrContent().click();
		Element.getCldrOk().click();
		Thread.sleep(2000);
		Element.getnTTime().click();
		String[] time = tcObjDate.get("Time").toString().split(":");
		Element.setclockH(time[0].toString());
		Element.getclockH().click();
		Thread.sleep(1000);
		Element.setclockM(time[1].toString());
		Element.getclockM().click();
		String[] unit = time[2].split(" ");
		Element.setClockUnit(unit[1].toString());
		Element.getClockUnit().click();
		Element.getClockOk().click();
		Element.getnTRepeat().click();
		Thread.sleep(1000);
		Element.setnTRepeatItem(tcObjData.get("Repeat").toString());
		Element.getnTRepeatItem().click();
		Element.getnTAdd2$().click();
		Thread.sleep(1000);
		Element.setnTAdd2$Item(tcObjData.get("Add to List").toString());
		Element.getnTAdd2$Item().click();
		Element.getRightSign().click();
		Thread.sleep(1000);

		Element.setaLTask(tcObjData.get("What is to be done").toString());
		Element.getaLTask().click();

		Element.getnTWITBD().sendKeys("Task list is modified");
		Element.getnTDate().click();
		Thread.sleep(2000);
		Element.setCldrContent("31 August 2021");
		Element.getCldrContent().click();
		Element.getCldrOk().click();
		Thread.sleep(1000);
		Element.getnTTime().click();
		Element.setclockH("9");
		Element.getclockH().click();
		Thread.sleep(1000);
		Element.setclockM("30");
		Element.getclockM().click();
		Element.setClockUnit("AM");
		Element.getClockUnit().click();
		Element.getClockOk().click();
		Element.getnTRepeat().click();
		Thread.sleep(1000);
		Element.setnTRepeatItem("Once a Month");
		Element.getnTRepeatItem().click();
		Element.getnTAdd2$().click();
		Thread.sleep(1000);
		Element.setnTAdd2$Item("Work");
		Element.getnTAdd2$Item().click();
		Element.getRightSign().click();
		Thread.sleep(1000);
		Element.setaLTask("Task list is modified");

		final String toastText = "Task Saved";
		Assert.assertNotEquals(Element.getaLTask().getText(), tcObjData.get("What is to be done").toString());
		Assert.assertEquals(Element.getToastMsg().getText(), toastText);

	}

	@Test
	public void tc11() throws IOException, ParseException, InterruptedException {
		Element.getPlusSign().click();
		Thread.sleep(2000);
		androidDriver.hideKeyboard();
		JSONObject tcObj = (JSONObject) newTaskObj.get(2);
		JSONObject tcObjData = (JSONObject) tcObj.get("data");
		Element.getnTWITBD().sendKeys(tcObjData.get("What is to be done").toString());
		Element.getRightSign().click();
		Thread.sleep(1000);
		Element.setaLTask(tcObjData.get("What is to be done").toString());

		androidDriver.findElementById("com.splendapps.splendo:id/checkDone").click();
		Thread.sleep(2000);
		Assert.assertEquals(Element.getToastMsg().getText(), "Task Finished");
		Element.getaLCategoryBtn().click();
		Thread.sleep(1000);
		Element.setaLCategoryBtnItem("Finished");
		Element.getaLCategoryBtnItem().click();
		Thread.sleep(2000);
		Element.setaLTask(tcObjData.get("What is to be done").toString());
		Assert.assertEquals(Element.getaLTask().getText(), tcObjData.get("What is to be done").toString());
		Thread.sleep(2000);
	}

	@Test
	public void tc12() throws IOException, ParseException, InterruptedException {
		Element.getPlusSign().click();
		Thread.sleep(2000);
		androidDriver.hideKeyboard();
		JSONObject tcObj = (JSONObject) newTaskObj.get(2);
		JSONObject tcObjData = (JSONObject) tcObj.get("data");
		Element.getnTWITBD().sendKeys(tcObjData.get("What is to be done").toString());
		Element.getRightSign().click();
		Thread.sleep(1000);
		Element.setaLTask(tcObjData.get("What is to be done").toString());
		Element.getaLTask().click();
		androidDriver.findElementById("com.splendapps.splendo:id/action_delete_task").click();
		Thread.sleep(2000);
		String msgTitle = androidDriver.findElementById("com.splendapps.splendo:id/alertTitle").getText();
		Assert.assertEquals(msgTitle, "Are you sure?");
		androidDriver.findElementById("android:id/button1").click();
		Thread.sleep(1000);
		Assert.assertEquals(Element.getToastMsg().getText(), "Task Deleted");
	}

}
