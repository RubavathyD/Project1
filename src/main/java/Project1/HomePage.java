package Project1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends ProjectMethod1 {
	public HomePage mouse() {
		Actions builder=new Actions(driver);
		WebElement Investment = locateElement ("linktext", "INVESTMENTS");
		builder.moveToElement(Investment);
		return this;
	}
	public MutualFund mutualclick() {
		WebElement Mutualfund = locateElement ("linktext","Mutual Fund");
		click(Mutualfund);
		return new MutualFund();
	}
}
