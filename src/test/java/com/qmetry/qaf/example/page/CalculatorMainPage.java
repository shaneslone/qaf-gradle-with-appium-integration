package com.qmetry.qaf.example.page;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;

public class CalculatorMainPage extends WebDriverBaseTestPage<WebDriverTestPage> {

    @FindBy(locator = "id=com.google.android.calculator:id/digit_0")
    private QAFExtendedWebElement zero;

    @FindBy(locator = "id=com.google.android.calculator:id/digit_1")
    QAFExtendedWebElement one;

    @FindBy(locator = "id=com.google.android.calculator:id/digit_2")
    QAFExtendedWebElement two;

    @FindBy(locator = "id=com.google.android.calculator:id/digit_3")
    QAFExtendedWebElement three;

    @FindBy(locator = "id=com.google.android.calculator:id/digit_4")
    QAFExtendedWebElement four;

    @FindBy(locator = "id=com.google.android.calculator:id/digit_5")
    QAFExtendedWebElement five;

    @FindBy(locator = "id=com.google.android.calculator:id/digit_6")
    QAFExtendedWebElement six;

    @FindBy(locator = "id=com.google.android.calculator:id/digit_7")
    QAFExtendedWebElement seven;

    @FindBy(locator = "id=com.google.android.calculator:id/digit_8")
    QAFExtendedWebElement eight;

    @FindBy(locator = "id=com.google.android.calculator:id/digit_9")
    QAFExtendedWebElement nine;

    @FindBy(locator = "id=com.google.android.calculator:id/eq")
    QAFExtendedWebElement equals;

    @FindBy(locator = "id=com.google.android.calculator:id/op_add")
    QAFExtendedWebElement plus;

    @FindBy(locator = "id=com.google.android.calculator:id/op_sub")
    QAFExtendedWebElement minus;

    @FindBy(locator = "id=com.google.android.calculator:id/op_mul")
    QAFExtendedWebElement multiply;

    @FindBy(locator = "id=com.google.android.calculator:id/op_div")
    QAFExtendedWebElement divide;

    @FindBy(locator = "id=com.google.android.calculator:id/dec_point")
    QAFExtendedWebElement decimal;

    @FindBy(locator = "id=com.google.android.calculator:id/result_final")
    QAFExtendedWebElement result;


    @Override
    protected void openPage(PageLocator locator, Object... args) {

    }

    public QAFExtendedWebElement getZero() {
        return zero;
    }

    public QAFExtendedWebElement getOne() {
        return one;
    }

    public QAFExtendedWebElement getTwo() {
        return two;
    }

    public QAFExtendedWebElement getThree() {
        return three;
    }

    public QAFExtendedWebElement getFour() {
        return four;
    }

    public QAFExtendedWebElement getFive() {
        return five;
    }

    public QAFExtendedWebElement getSix() {
        return six;
    }

    public QAFExtendedWebElement getSeven() {
        return seven;
    }

    public QAFExtendedWebElement getEight() {
        return eight;
    }

    public QAFExtendedWebElement getNine() {
        return nine;
    }

    public QAFExtendedWebElement getEquals() {
        return equals;
    }

    public QAFExtendedWebElement getPlus() {
        return plus;
    }

    public QAFExtendedWebElement getMinus() {
        return minus;
    }

    public QAFExtendedWebElement getMultiply() {
        return multiply;
    }

    public QAFExtendedWebElement getDivide() {
        return divide;
    }

    public QAFExtendedWebElement getDecimal() {
        return decimal;
    }

    public QAFExtendedWebElement getResult() {
        return result;
    }


}
