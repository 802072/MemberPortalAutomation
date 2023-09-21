package memberPortalBrokenLinkAndBrokenImage;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import dataDriven.dataDriven;
import extentReport.BaseTest_BLBI;

public class SelectHealth extends BaseTest_BLBI {
	dataDriven d = new dataDriven();

	@BeforeSuite
	public void initializeReport() {
	initialiseExtentReports("MemberPortalAutomationSelectHealth_BLBI.html", 
			"Member Portal: Select Health Plan Automation Report");
	}

	public void loginSelectHealth() throws IOException, InterruptedException {
		ArrayList V80041737 = d.getData("V80041737", "loginCred");
		String healthPlan = (String) V80041737.get(5);
		String uname = (String) V80041737.get(1);
		String pswd = (String) V80041737.get(2);

		login(uname, pswd, healthPlan);
	}

	// Homepage
	@Test(groups = "Homepage")
	public void homePage() throws InterruptedException, IOException {

		loginSelectHealth();
		Thread.sleep(3000);
		testBrokenImages();
		testBrokenLinks();

	}

	// Benefits
	@Test(groups = "Benefits", priority = 1)
	public void benefits() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click Benefits
		clickElement("BE0101", "benefitsMenu");
		// Click Benefits Sub-menu
		clickElement("BE0102", "benefitsMenu");
		Thread.sleep(3000);
		testBrokenImages();
		testBrokenLinks();
	}

	// ID Card
	@Test(groups = "Benefits")
	public void idCard() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click Benefits
		clickElement("BE0301", "benefitsMenu");
		// Click ID Card Sub-menu
		clickElement("BE0302", "benefitsMenu");
		Thread.sleep(3000);
		testBrokenImages();
		testBrokenLinks();

	}

	// Rewards
	@Test(groups = "Benefits")
	public void rewards() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click Benefits
		clickElement("BE0601", "benefitsMenu");
		// Click Rewards Sub-menu
		clickElement("BE0602", "benefitsMenu");
		Thread.sleep(3000);
		testBrokenImages();
		testBrokenLinks();
	}

	// Plan History
	@Test(groups = "Benefits")
	public void planHistory() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click Benefits
		clickElement("BE0701", "benefitsMenu");
		// Click planHistory Sub-menu
		clickElement("BE0702", "benefitsMenu");
		Thread.sleep(3000);
		testBrokenImages();
		testBrokenLinks();
	}

	// My Care
	// myPCP
	@Test(groups = "My Care")
	public void myPCP() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click My Care Menu
		clickElement("MC0101", "myCareMenu");
		// Click My PCP Sub-menu
		clickElement("MC0102", "myCareMenu");
		Thread.sleep(3000);
		testBrokenImages();
		testBrokenLinks();
	}

	// myHealthPlanCareTeam
	@Test(groups = "My Care")
	public void myHealthPlanCareTeam() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click My Care Menu
		clickElement("MC0201", "myCareMenu");
		// Click myHealthPlanCareTeam Sub-menu
		clickElement("MC0202", "myCareMenu");
		Thread.sleep(3000);
		testBrokenImages();
		testBrokenLinks();

	}

	// serviceAuthorizations
	@Test(groups = "My Care")
	public void serviceAuthorizations() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click My Care Menu
		clickElement("MC0301", "myCareMenu");
		// Click serviceAuthorizationsSub-menu
		clickElement("MC0302", "myCareMenu");
		Thread.sleep(3000);
		testBrokenImages();
		testBrokenLinks();
	}

	// My Medical Supplies and Equipment
	@Test(groups = "My Care")
	public void myMedicalSupp() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click My Care Menu
		clickElement("MC0401", "myCareMenu");
		// Click My Medica Supp Sub-menu
		clickElement("MC0402", "myCareMenu");
		Thread.sleep(3000);
		testBrokenImages();
		testBrokenLinks();
	}

	// Claims
	// MyClaims
	@Test(groups = "Claims")
	public void claims() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click Claims Menu
		clickElement("CL0101", "claimsMenu");
		// Click My Claims Sub-menu
		clickElement("CL0102", "claimsMenu");
		Thread.sleep(3000);
		testBrokenImages();
		testBrokenLinks();
	}

	// Resources
	// My Plan Resources
	@Test(groups = "Resources")
	public void myPlanResources() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click Resources Menu
		clickElement("RE0101", "resourcesMenu");
		// Click My Plan Resources Sub-menu
		clickElement("RE0102", "resourcesMenu");
		Thread.sleep(3000);
		testBrokenImages();
		testBrokenLinks();

	}

	// Benefit Partners
	@Test(groups = "Resources")
	public void benefitPartners() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click Resources Menu
		clickElement("RE0201", "resourcesMenu");
		// Click Benefit Partners Sub-menu
		clickElement("RE0202", "resourcesMenu");
		Thread.sleep(3000);
		testBrokenImages();
		testBrokenLinks();
	}

	// Grievances and Appeals
	// Grievances
	@Test(groups = "Grievances And Appeals")
	public void grievances() throws InterruptedException, IOException {
		ArrayList<String> V80041737 = d.getData("V80041737", "loginCred");

		loginSelectHealth();
		// Click Grievances and Appeals Menu
		clickElement("GA0101", "grievancesMenu");
		// Click Grievances Sub-menu
		clickElement("GA0102", "grievancesMenu");
		Thread.sleep(3000);
		testBrokenImages();
		testBrokenLinks();
	}

	// Appeals
	@Test(groups = "Grievances And Appeals")
	public void appeals() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click Grievances and Appeals Menu
		clickElement("GA0201", "grievancesMenu");
		// Click Grievances Sub-menu
		clickElement("GA0202", "grievancesMenu");
		Thread.sleep(3000);
		testBrokenImages();
		testBrokenLinks();
	}

	// Communication Center
	@Test(groups = "Communication Center")
	public void communicationCenter() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click Communication Center Menu
		clickElement("CC0101", "comCenterMenu");
		// Click Communication Center Sub-menu
		clickElement("CC0102", "comCenterMenu");
		Thread.sleep(3000);
		testBrokenImages();
		testBrokenLinks();
	}

	// My Account
	@Test(groups = "My Account")
	public void myAccount() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click My Account Menu
		clickElement("MA0101", "myAccountMenu");
		// Click My Account Sub Menu
		clickElement("MA0102", "myAccountMenu");
		Thread.sleep(3000);
		testBrokenImages();
		testBrokenLinks();

	}

	@AfterTest(alwaysRun = true)
	public void tearUp() {
		driver.close();
	}
}
