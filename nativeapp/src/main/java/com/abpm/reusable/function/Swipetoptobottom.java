package com.abpm.reusable.function;

import com.abpm.execution.setup.AppiumDriverInit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Swipetoptobottom

{

public static void swipeTopBottom()
	
	{
		
		TouchAction ta = new TouchAction(AppiumDriverInit.getDriver());
		ta.press(PointOption.point(460,960));
		ta.moveTo(PointOption.point(460,930)).release().perform();
     }


}
