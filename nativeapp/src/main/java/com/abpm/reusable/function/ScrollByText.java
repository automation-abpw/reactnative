package com.abpm.reusable.function;

import com.abpm.execution.setup.AppiumDriverInit;

import io.appium.java_client.MobileBy;

public class ScrollByText

{
	public static void scrollByText(String menuText) {

        try {

        	AppiumDriverInit.getDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + menuText + "\").instance(0));")); 
        } catch (Exception e) {
           e.printStackTrace();
        }

}
	
}
	
