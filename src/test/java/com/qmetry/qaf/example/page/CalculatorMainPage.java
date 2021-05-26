package com.qmetry.qaf.example.page;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import org.openqa.selenium.By;

public class CalculatorMainPage extends WebDriverBaseTestPage<WebDriverTestPage> {

    QAFExtendedWebElement two = driver.findElement(By.id("com.google.android.calculator:id/digit_2"));


    @Override
    protected void openPage(PageLocator locator, Object... args) {

    }

    public String getTwoText() {
        return two.getText();
    }
}
