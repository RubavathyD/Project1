package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods{
	
	public FindLeads() {
		PageFactory.initElements(driver, this);
	}
@FindBy(linkText = "Find Leads" )
WebElement ClickFind ;
	public  FindLeads ClickFindLeads() {
		//WebElement ClickFind = locateElement ("linktext" , "Find Leads");
click(ClickFind);
return this;

	}
	@FindBy(xpath = "(//input[@name='firstName'])[3]")
	WebElement Fname;
public FindLeads TypeFname(String data) {
	//WebElement Fname = locateElement ("xpath" ,"(//input[@name='firstName'])[3]");
	type(Fname ,data);
	return this;
	
}
@FindBy(xpath = "//button[contains(text(),'Find Leads')]")
WebElement Fdlead;
	public FindLeads Fdlead() {
		WebElement Fdlead = locateElement ("xpath" , "//button[contains(text(),'Find Leads')]");
		click(Fdlead);
		return this;
	}
	public ViewLeads lead() {
		WebElement lead = locateElement ("linktext" , "Divya");
		click(lead);
		return new ViewLeads();
		
	}
	
}
