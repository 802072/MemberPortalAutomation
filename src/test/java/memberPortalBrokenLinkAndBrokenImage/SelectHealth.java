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
	int colNum = 10;

	@BeforeSuite
	public void initializeReport() {
		initialiseExtentReports("MemberPortalAutomationSelectHealth_BLBI.html",
				"Member Portal: SelectHealth Plan Broken Link and Image Test Report");
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

		// Verify Member's Name is Displayed
		assertEquals("HP0101", "homePage", colNum);

		// Verify Phone Number and Operation Hours are Displayed
		assertEquals("HP0119", "homePage", colNum);

		// Verify Health Plan is Displayed
		assertEquals("HP0120", "homePage", colNum);

		testBrokenImages();
		testBrokenLinks();

		submitFeedback("HP0116");
	}

	// Benefits
	@Test(groups = "Benefits", priority = 1)
	public void benefits() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click Benefits
		clickElementJSExecute("BE0101", "benefitsMenu");
		// Click Benefits Sub-menu
		clickElementJSExecute("BE0102", "benefitsMenu");
		// Verify Title
		verifyPageTitle("BE0102", "benefitsMenu", colNum);
		Thread.sleep(3000);
		testBrokenImages();
		testBrokenLinks();
	}

	// ID Card
	@Test(groups = "Benefits")
	public void idCard() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click Benefits
		clickElementJSExecute("BE0301", "benefitsMenu");
		// Click ID Card Sub-menu
		clickElementJSExecute("BE0302", "benefitsMenu");
		Thread.sleep(3000);
		// Verify Page Title
		verifyPageTitle("BE0302", "benefitsMenu", colNum);
		testBrokenImages();
		testBrokenLinks();

	}

	// Rewards
	@Test(groups = "Benefits")
	public void rewards() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click Benefits
		clickElementJSExecute("BE0601", "benefitsMenu");
		// Click Rewards Sub-menu
		clickElementJSExecute("BE0602", "benefitsMenu");
		Thread.sleep(3000);
		// Verify Page Title
		verifyPageTitle("BE0602", "benefitsMenu", colNum);

		testBrokenImages();
		testBrokenLinks();
	}

	// Plan History
	@Test(groups = "Benefits")
	public void planHistory() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click Benefits
		clickElementJSExecute("BE0701", "benefitsMenu");
		// Click planHistory Sub-menu
		clickElementJSExecute("BE0702", "benefitsMenu");
		Thread.sleep(3000);
		// Verify Page Title
		verifyPageTitle("BE0702", "benefitsMenu", colNum);
		testBrokenImages();
		testBrokenLinks();
	}

	// My Care
	// myPCP
	@Test(groups = "My Care")
	public void myPCP() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click My Care Menu
		clickElementJSExecute("MC0101", "myCareMenu");
		// Click My PCP Sub-menu
		clickElementJSExecute("MC0102", "myCareMenu");
		Thread.sleep(3000);
		// Verify Page Title
		verifyPageTitle("MC0102", "myCareMenu", colNum);

		testBrokenImages();
		testBrokenLinks();
	}

	// myHealthPlanCareTeam
	@Test(groups = "My Care")
	public void myHealthPlanCareTeam() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click My Care Menu
		clickElementJSExecute("MC0201", "myCareMenu");
		// Click myHealthPlanCareTeam Sub-menu
		clickElementJSExecute("MC0202", "myCareMenu");
		Thread.sleep(3000);
		// Verify Page Title
		verifyPageTitle("MC0202", "myCareMenu", colNum);
		testBrokenImages();
		testBrokenLinks();

	}

	// serviceAuthorizations
	@Test(groups = "My Care")
	public void serviceAuthorizations() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click My Care Menu
		clickElementJSExecute("MC0301", "myCareMenu");
		// Click serviceAuthorizationsSub-menu
		clickElementJSExecute("MC0302", "myCareMenu");
		Thread.sleep(3000);
		// Verify Page Title
		verifyPageTitle("MC0302", "myCareMenu", colNum);
		testBrokenImages();
		testBrokenLinks();
	}

	// My Medical Supplies and Equipment
	@Test(groups = "My Care")
	public void myMedicalSupp() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click My Care Menu
		clickElementJSExecute("MC0401", "myCareMenu");
		// Click My Medica Supp Sub-menu
		clickElementJSExecute("MC0402", "myCareMenu");
		Thread.sleep(3000);
		// Verify Page Title
		verifyPageTitle("MC0402", "myCareMenu", colNum);

		testBrokenImages();
		testBrokenLinks();
	}

	// Claims
	// MyClaims
	@Test(groups = "Claims")
	public void claims() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click Claims Menu
		clickElementJSExecute("CL0101", "claimsMenu");
		// Click My Claims Sub-menu
		clickElementJSExecute("CL0102", "claimsMenu");
		Thread.sleep(3000);
		// Verify Page Title
		verifyPageTitle("CL0102", "claimsMenu", colNum);
		testBrokenImages();
		testBrokenLinks();
	}

	// Resources
	// My Plan Resources
	@Test(groups = "Resources")
	public void myPlanResources() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click Resources Menu
		clickElementJSExecute("RE0101", "resourcesMenu");
		// Click My Plan Resources Sub-menu
		clickElementJSExecute("RE0102", "resourcesMenu");
		Thread.sleep(3000);
		// Verify Page Title
		verifyPageTitle("RE0102", "resourcesMenu", colNum);
		testBrokenImages();
		testBrokenLinks();

	}

	// Benefit Partners
	@Test(groups = "Resources")
	public void benefitPartners() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click Resources Menu
		clickElementJSExecute("RE0201", "resourcesMenu");
		// Click Benefit Partners Sub-menu
		clickElementJSExecute("RE0202", "resourcesMenu");
		Thread.sleep(3000);
		// Verify Page Title
		verifyPageTitle("RE0202", "resourcesMenu", colNum);
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
		clickElementJSExecute("GA0101", "grievancesMenu");
		// Click Grievances Sub-menu
		clickElementJSExecute("GA0102", "grievancesMenu");
		Thread.sleep(3000);
		// Verify Page Title
		verifyPageTitle("GA0102", "grievancesMenu", colNum);
		testBrokenImages();
		testBrokenLinks();
	}

	// Appeals
	@Test(groups = "Grievances And Appeals")
	public void appeals() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click Grievances and Appeals Menu
		clickElementJSExecute("GA0201", "grievancesMenu");
		// Click Grievances Sub-menu
		clickElementJSExecute("GA0202", "grievancesMenu");
		Thread.sleep(3000);
		// Verify Page Title
		verifyPageTitle("GA0202", "grievancesMenu", colNum);
		testBrokenImages();
		testBrokenLinks();
	}

	// Communication Center
	@Test(groups = "Communication Center")
	public void communicationCenter() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click Communication Center Menu
		clickElementJSExecute("CC0101", "comCenterMenu");
		// Click Communication Center Sub-menu
		clickElementJSExecute("CC0102", "comCenterMenu");
		Thread.sleep(3000);
		// Verify Page Title
		verifyPageTitle("CC0102", "comCenterMenu", colNum);
		testBrokenImages();
		testBrokenLinks();
	}

	// My Account
	@Test(groups = "My Account")
	public void myAccount() throws InterruptedException, IOException {

		loginSelectHealth();
		// Click My Account Menu
		clickElementJSExecute("MA0101", "myAccountMenu");
		// Click My Account Sub Menu
		clickElementJSExecute("MA0102", "myAccountMenu");
		Thread.sleep(3000);
		// Verify Page Title
		verifyPageTitle("MA0102", "myAccountMenu", colNum);
		testBrokenImages();
		testBrokenLinks();

	}

}
