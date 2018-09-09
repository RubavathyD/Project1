package Project1;


		import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

	public class List extends ProjectMethods {
		public List getdat() {
		
			
			 java.util.List<WebElement> li = driver.findElementsByXPath("//div[@class='offer-section-column col-same-height col-middle card']//li/span");
			for(WebElement ele:li) {
				System.out.println(ele.getText());
			}
			return this;
		}

		public List get() {
			java.util.List<WebElement> li1 = driver.findElementsByXPath("//div[@class='offer-section-column col-same-height col-middle investment-amount']/span[@class='js-title']");
			for(WebElement ele1:li1) {
				System.out.println(ele1.getText());
			}
			return this;
		}
		
}
