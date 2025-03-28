package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import Base.BaseClass;

public class ServiceTeritorryPage extends BaseClass{
	
	public ServiceTeritorryPage ClickOnNew() throws InterruptedException{
        getDriver().findElement(By.xpath("//div[@title='New']")).click();
        Thread.sleep(5000);
        return this;
    }

    public ServiceTeritorryPage enterName() throws InterruptedException {
        getDriver().findElement(By.xpath("//input[@name = 'Name']")).sendKeys("Muofhe");
        Thread.sleep(5000);
        return this;
    }

    public ServiceTeritorryPage selectOperatingHours() throws InterruptedException {
    	WebElement OP = getDriver().findElement(By.xpath("(//input[@type='text'])[3]"));
        OP.click();
        Thread.sleep(3000);
        OP.sendKeys(Keys.ENTER);
        
        return this;
    }
    
    public ServiceTeritorryPage ClickActive() throws InterruptedException {
    	Thread.sleep(5000);   
    	getDriver().findElement(By.xpath("//input[@name='IsActive']")).click();   
    	return this;
    }
    public ServiceTeritorryPage EnterCity() throws InterruptedException {
    	getDriver().findElement(By.xpath("//*[@id=\"input-220\"]")).sendKeys("Kempton park");
    	Thread.sleep(5000);
    	return this;
    	
    }
    
    public ServiceTeritorryPage EnterState() throws InterruptedException {
    	getDriver().findElement(By.xpath("//*[@id=\"input-224\"]")).sendKeys("Gauteng");
    	Thread.sleep(5000);
    	return this;
    	
    }
    
    public ServiceTeritorryPage EnterCountry() throws InterruptedException {
    	getDriver().findElement(By.xpath("//*[@id=\"input-226\"]")).sendKeys("South Africa");
    	Thread.sleep(5000);
    	return this;
    }
    
    public ServiceTeritorryPage EnterZipCode() throws InterruptedException {
    	getDriver().findElement(By.xpath("//*[@id=\"input-222\"]")).sendKeys("1619");
    	Thread.sleep(5000);
    	return this;
    }
    
    public ServiceTeritorryPage ClickSave() throws InterruptedException {
    	 getDriver().findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
    	 Thread.sleep(5000);
     	return this;
    	
    }

}
