package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class TC001_CreateLead extends ProjectMethods {
	
	@BeforeClass
	public void setData() {
		testCaseName = "TC001_CreateLead";
		testCaseDescription ="Create a lead";
		category = "Smoke";
		author= "Babu";
		dataSheetName="data";
	}
	@Test(dataProvider="data")
	public  void createLead(String data, String Cmpyname)   {
		new MyHomePage()
		.clickLeads()
		.ClickFindLeads()
		.TypeFname(data)
		.Fdlead()
		.lead()
		.clickedit()
		.editlead(Cmpyname)
		.update();
		
		
	}
	

}
