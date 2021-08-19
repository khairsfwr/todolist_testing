package todolist;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import todolist.CapabilitiesReaderSimple;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	static AppiumDriver<MobileElement> appiumDriver;

	static AndroidDriver<MobileElement> androidDriver;

	static WebDriverWait wait;

	static ArrayList<JSONObject> newTaskObj;
	
	static ArrayList<JSONObject> searchObj;

	static ArrayList<MobileElement> eleList;

	@BeforeSuite
	public void setup() {
		String contentRootLocation = "/src/test/resources/DesiredCapabilities.json";
		String testDevice = "device3";
		try {
			androidDriver = new AndroidDriver<MobileElement>(
					CapabilitiesReaderSimple.getDesiredCapabilities(testDevice, contentRootLocation));
			wait = new WebDriverWait(androidDriver, 10);
			System.out.println("Test Started...");
			getNewTaskObj();
			getSearchObj();
		} catch (Exception e) {
			e.getCause();
			e.getMessage();
			e.printStackTrace();
		}
	}

	public void getNewTaskObj() throws IOException, ParseException {
		String contentRootLocation = "/src/test/resources/NewTask.json";
		JSONParser jsonParser = new JSONParser();
		String jsonLocation = System.getProperty("user.dir") + "/" + contentRootLocation;
		FileReader reader = new FileReader(jsonLocation);
		newTaskObj = (ArrayList<JSONObject>) jsonParser.parse(reader);
	}
	
	public void getSearchObj() throws IOException, ParseException {
		String contentRootLocation = "/src/test/resources/SearchTask.json";
		JSONParser jsonParser = new JSONParser();
		String jsonLocation = System.getProperty("user.dir") + "/" + contentRootLocation;
		FileReader reader = new FileReader(jsonLocation);
		searchObj = (ArrayList<JSONObject>) jsonParser.parse(reader);
	}

	@AfterSuite
	public void teardownEnd() throws IOException {
		androidDriver.closeApp();
		// androidDriver.terminateApp();
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		System.out.println("Test End...");
	}

	@BeforeTest
	public void openApp() throws IOException {
		System.out.println("@BeforeTest");
	}

	@AfterTest
	public void closeApp() throws IOException {
		System.out.println("@AfterTest");
	}

	@BeforeMethod
	public void beforeMethod() throws IOException {
		System.out.println("@BeforeMethod");
		androidDriver.launchApp();
	}

	@AfterMethod
	public void afterMethod() throws IOException {
		System.out.println("@AfterMethod");
		androidDriver.closeApp();
	}

	/** screenshot and extract image */
	public void capture() {
      //File scrFile = ((TakesScreenshot) androidDriver).getScreenshotAs(OutputType.FILE);
	}

}
