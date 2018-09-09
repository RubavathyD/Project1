package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Project1.HomePage;
import Project1.ProjectMethod1;


public class Testcase extends ProjectMethod1{
	@BeforeTest
	public void setData() {
		testCaseName = "TC001_CreateLead";
		testCaseDescription ="Create a lead";
		category = "Smoke";
		author= "Babu";		
}
@Test
public void test() throws InterruptedException {
	new HomePage()
	.mouse()
	.mutualclick()
	.searchmutual()
	.clickage()	
	.month()
	.date()
	.Next()
	.income()
	.next01()
	.bank()
	.name()
	.view();
}
}
