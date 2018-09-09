package Project1;

import org.openqa.selenium.WebElement;

public class Details extends ProjectMethod1 {
	public Details name () throws InterruptedException {
		Thread.sleep(3000);
		WebElement Name = locateElement ("xpath","//input[@name='firstName']");
		type(Name,"Ruba");
		return this;
	}
public List view() {
	WebElement View = locateElement ("linktext","View Mutual Funds");
	click(View);
	return new List();
}
}
