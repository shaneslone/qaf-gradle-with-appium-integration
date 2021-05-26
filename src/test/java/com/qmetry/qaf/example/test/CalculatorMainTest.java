package com.qmetry.qaf.example.test;

import com.qmetry.qaf.example.page.CalculatorMainPage;
import org.testng.annotations.Test;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class CalculatorMainTest extends WebDriverTestCase {

	@Test
	public void testTwoButtonText() {
		CalculatorMainPage page = new CalculatorMainPage();
		verifyTrue(page.getTwoText().equals("2"), "FAIL", "PASS");
	}

}
