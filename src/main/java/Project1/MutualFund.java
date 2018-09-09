package Project1;

import org.openqa.selenium.WebElement;

public class MutualFund extends ProjectMethod1 {
	public Age searchmutual() throws InterruptedException{
		Thread.sleep(3000);
		WebElement SearchMu = locateElement ("linktext","Search for Mutual Funds");
	click(SearchMu);
	return new Age();
	}
}
