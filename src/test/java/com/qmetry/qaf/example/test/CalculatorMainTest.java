package com.qmetry.qaf.example.test;

import com.qmetry.qaf.example.page.CalculatorMainPage;
import org.testng.annotations.Test;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class CalculatorMainTest extends WebDriverTestCase {

	CalculatorMainPage calc = new CalculatorMainPage();

	@Test
	public void testAddition() {
		calc.getOne().click();
		calc.getPlus().click();
		calc.getTwo().click();
		calc.getEquals().click();
		assertTrue(calc.getResult().getText().equals("3"), "FAIL", "PASS");

	}

}
