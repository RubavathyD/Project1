package Project1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Salary extends ProjectMethod1{
	public Salary income() throws InterruptedException {
	Thread.sleep(5000);
	Actions builder=new Actions(driver);
	WebElement Sal = locateElement ("xpath", "//div[@class='rangeslider__handle-label']");
	for (int i =0; i<5 ; i++){
	builder.dragAndDropBy(Sal, 5, 0).perform();
	}
	return this;
}
	public Bank next01() {
	WebElement Nex1 = locateElement ("linktext", "Continue");
	click(Nex1);
	return new Bank();
}
}