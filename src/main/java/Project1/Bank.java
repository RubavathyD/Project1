package Project1;

import org.openqa.selenium.WebElement;

public class Bank extends ProjectMethod1 {
	public Details bank() {
		WebElement Branch = locateElement("xpath","//span[contains(text(),'HDFC')]");
	click(Branch);
	return new Details();
	}

}
