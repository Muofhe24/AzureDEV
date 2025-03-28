package Testcase;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ServiceTeritorryPage;

public class TC_002 extends BaseClass{
	
	@Test
    public void login() throws InterruptedException {
    LoginPage Login = new LoginPage();
    HomePage salesForceHomePage = new HomePage();
    ServiceTeritorryPage serviceTerritoryPage = new ServiceTeritorryPage();

    Login.enterUserName().enterPassword().clickLoginButton().verify();
    salesForceHomePage.createServiceTerritory();
    serviceTerritoryPage.ClickOnNew()
    .enterName()
    .selectOperatingHours()
    .ClickActive()
    .EnterCity()
    .EnterState()
    .EnterCountry()
    .EnterZipCode()
    .ClickSave();

    }

}
