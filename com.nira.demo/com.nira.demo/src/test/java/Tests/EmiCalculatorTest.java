package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.AppManagerBaseClass;
import Pages.EmiCalculatorPage;

public class EmiCalculatorTest extends AppManagerBaseClass{

    @Test
    public void testEmiCalculationDisplay() {
        EmiCalculatorPage emiPage = new EmiCalculatorPage(driver);
        emiPage.slideLoanAmount(50, 600);
        emiPage.slideTenure(50, 400);
        String emi = emiPage.getEmiValue();
        Assert.assertNotNull(emi);
    }
    @Test
    public void testMinLoanAmountEmiCalculation() {
        EmiCalculatorPage emiPage = new EmiCalculatorPage(driver);
        emiPage.slideLoanAmount(0, 10); 
        emiPage.slideTenure(0, 10);    
        String emi = emiPage.getEmiValue();
        Assert.assertNotNull(emi);
    }

    @Test
    public void testMaxLoanAmountEmiCalculation() {
        EmiCalculatorPage emiPage = new EmiCalculatorPage(driver);
        emiPage.slideLoanAmount(0, 900);
        emiPage.slideTenure(0, 900);
        String emi = emiPage.getEmiValue();
        Assert.assertNotNull(emi);
    }

    @Test
    public void testIntermediateLoanAmountEmiCalculation() {
        EmiCalculatorPage emiPage = new EmiCalculatorPage(driver);
        emiPage.slideLoanAmount(0, 400);
        emiPage.slideTenure(0, 300);
        String emi = emiPage.getEmiValue();
        Assert.assertTrue(emi.matches("\\d+(\\.\\d+)?"));
    }
}