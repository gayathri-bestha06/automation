package utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowSwitch {
	
	public  void switchToWindow(WebDriver driver) {
		String parentwindow = driver.getWindowHandle();
		
		Set<String> allwindows = driver.getWindowHandles();
		for(String window:allwindows) {
			if(!window.equals(parentwindow)) {
				driver.switchTo().window(window);
				break;
			}
		}
	}
	

}
