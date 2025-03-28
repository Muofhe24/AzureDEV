package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BaseClass;

public class HomePage extends BaseClass {
	
	public HomePage createServiceTerritory() throws InterruptedException {
        Thread.sleep(5000);
        getDriver().findElement(By.xpath("//div[@class= 'slds-icon-waffle']")).click();

        Thread.sleep(5000);
        getDriver().findElement(By.xpath("//button[normalize-space()='View All']")).click();

        Thread.sleep(5000);
        WebElement Search = getDriver().findElement(By.xpath("//div[@type='search']"));
        Search.sendKeys("Service Territories");

        Thread.sleep(5000);
        WebElement CLK = getDriver().findElement(By.xpath("//mark[contains(text(),'Service Territories')]"));
        CLK.click();
        Thread.sleep(5000);

        return this;
    }

}
