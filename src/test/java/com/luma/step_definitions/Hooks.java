package com.luma.step_definitions;

import java.util.concurrent.TimeUnit;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.luma.utilities.Driver;

import cucumber.api.Scenario;


public class Hooks {
	
	@Before
	public void setUp() {
		// we put a logic that should apply to every scenario
		Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown(Scenario scenario) throws InterruptedException {
		// only takes a screenshot if the scenario fails
		if (scenario.isFailed()) {
			// taking a screenshot
			final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}

		Driver.closeDriver();
	}
	
	
	
	
	
}
