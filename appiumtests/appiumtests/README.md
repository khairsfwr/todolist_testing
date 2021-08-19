# Kill node service 
taskkill /F /IM node.exe
# Driver different
As you can see, the drivers and their names tie in closely with what they do. When it comes to initializing a driver, only use the Android or IOS drivers.
## RemoteWebDriver
This driver class comes directly from the upstream Selenium project. This is a pretty generic driver where initializing the driver means making network requests to a Selenium hub to start a driver session. Since Appium operates on the client-server model, Appium uses this to initialize a driver session. However, directly using the RemoteWebDriver is not recommended since there are other drivers available that offer additional features or convenience functions.
## AppiumDriver
This driver class inherits from the RemoteWebDriver class, but it adds in additional functions that are useful in the context of a mobile automation test through the Appium server.
## AndroidDriver
This driver class inherits from AppiumDriver, but it adds in additional functions that are useful in the context of a mobile automation test on Android devices through Appium. Only use this driver class if you want to start a test on an Android device or Android emulator.
## IOSDriver
This driver class inherits from AppiumDriver, but it adds in additional functions that are useful in the context of a mobile automation test on iOS devices through Appium. Only use this driver class if you want to start a test on an iOS device or iOS emulator.
# Statergy Locators
driver.FindElement(By.XPath("//android.widget.Button[@content-desc='Login']")).Click(); <br>
driver.findElementByName("Login").click(); - Login here also refer to content-desc