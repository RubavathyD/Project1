package Project1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Age extends ProjectMethod1{
	public Age clickage() throws InterruptedException {
		Thread.sleep(5000);
		Actions builder=new Actions(driver);
		WebElement age = locateElement ("xpath", "//div[@class='rangeslider__handle']");
		for (int i =0; i<8 ; i++){
		builder.dragAndDropBy(age, 5, 0).perform();
		}
		return this;
	}
public Age month() {
	WebElement Month = locateElement ("linktext","Feb 1992");
	click(Month);
	return this;
}
public Age date() {
	WebElement Date = locateElement ("xpath","//div[contains(text(),'5')]");
	click(Date);
	return this;
}
public Salary Next() {
	WebElement Con = locateElement ("linktext", "Continue");
	click(Con);
	return new Salary();
}
}
