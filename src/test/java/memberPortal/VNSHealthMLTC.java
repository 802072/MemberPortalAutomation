package memberPortal;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import dataDriven.dataDriven;
import extentReport.BaseTest_AllLinks;
import extentReport.BaseTest_BLBI;

public class VNSHealthMLTC extends BaseTest_AllLinks  {
	dataDriven d = new dataDriven();
	int colNum= 7;
	
	@BeforeSuite
	public void initializeReport() {
	initialiseExtentReports("MemberPortalAutomationMLTC.html", "Member Portal: VNS Health MLTC Plan Automation Report");
	}

	public void loginMLTC() throws IOException, InterruptedException {
		ArrayList V80209467 = d.getData("V80209467", "loginCred");
		String uname = (String) V80209467.get(1);
		String pswd = (String) V80209467.get(2);
		String healthPlan = (String) V80209467.get(5);
		login(uname, pswd, healthPlan);
	}

	// Homepage
	@Test(groups = "Homepage")
	public void homePage() throws InterruptedException, IOException {

		loginMLTC();
		
		// Verify Member's Name is Displayed
		assertEquals("HP0101", "homePage", colNum);

		// Verify Phone Number and Operation Hours are Displayed
		assertEquals("HP0119", "homePage", colNum);

		// Verify Health Plan is Displayed
		assertEquals("HP0120", "homePage", colNum);
		
		// Click Name
		clickElementJSExecute("HP0101", "homePage");
		driver.navigate().back();
		
		// Click View And Print ID Card
		clickElementJSExecute("HP0102", "homePage");
		verifyPageTitle("HP0102", "homePage", colNum);
		driver.navigate().back();
		
		// Click Check My Benefits
		clickElementJSExecute("HP0103", "homePage");
		verifyPageTitle("HP0103", "homePage", colNum);
		driver.navigate().back();
		
		// Click View My Care Team
		clickElementJSExecute("HP0104", "homePage");
		verifyPageTitle("HP0104", "homePage", colNum);
		driver.navigate().back();
		
		// Click Review My Medical Supplies
		clickElementJSExecute("HP0105", "homePage");
		verifyPageTitle("HP0105", "homePage", colNum);
		driver.navigate().back();
		
		// Click My Action Items
		clickElementJSExecute("HP0106", "homePage");
		verifyPageTitle("HP0106", "homePage", colNum);
		driver.navigate().back();
		
		// Click View Claims
		clickElementJSExecute("HP0107", "homePage");
		verifyPageTitle("HP0107", "homePage", colNum);
		driver.navigate().back();
		
		// Click View Service Authorizations
		clickElementJSExecute("HP0108", "homePage");
		verifyPageTitle("HP0108", "homePage", colNum);
		
		// Click Technical Support Link
		clickElementJSExecute("HP0109", "homePage");
		verifyPageTitle("HP0109", "homePage", colNum);
		driver.navigate().back();
		
		// Click Terms of Use Link
		openChildWindowVerifyTitle("HP0110", "homePage", colNum);
		// Click Privacy Policy Link
		openChildWindowVerifyTitle("HP0111", "homePage", colNum);

		//Submit Feedback
		submitFeedback("HP0114");
		
		// Click View 2024 Benefits Link
		//openChildWindowVerifyTitle("HP0121", "homePage", colNum);
	}

	// Benefits
	@Test(groups = "Benefits", priority = 1)
	public void benefits() throws InterruptedException, IOException {

		loginMLTC();
		// Click Benefits
		clickElementJSExecute("BE0101", "benefitsMenu");
		// Click Benefits Sub-menu
		clickElementJSExecute("BE0102", "benefitsMenu");
		// Verify Page Title
		verifyPageTitle("BE0102", "benefitsMenu", colNum);
		
		// Click View Member Handbook
		openChildWindowVerifyTitle("BE0103", "benefitsMenu", colNum);
		// Click Member Handbook link
		openChildWindowVerifyTitle("BE0104", "benefitsMenu", colNum);
		// Click Healthplex
		openChildWindowVerifyTitle("BE0105", "benefitsMenu", colNum);
		// Click Superior Vision
		openChildWindowVerifyTitle("BE0106", "benefitsMenu", colNum);
		// Click Click Modivcare
		openChildWindowVerifyTitle("BE0107", "benefitsMenu", colNum);
	}

	// ID Card
	@Test(groups = "Benefits")
	public void idCard() throws InterruptedException, IOException {

		loginMLTC();
		// Click Benefits
		clickElementJSExecute("BE0301", "benefitsMenu");
		// Click ID Card Sub-menu
		clickElementJSExecute("BE0302", "benefitsMenu");
		Thread.sleep(5000);
		// Verify Page Title
		verifyPageTitle("BE0302", "benefitsMenu", colNum);
		
		// Click Communication Center
		clickElementJSExecute("BE0303", "benefitsMenu");
		verifyPageTitle("BE0303", "benefitsMenu", colNum);
		driver.navigate().back();
		// Click Return to Home
		clickElementJSExecute("BE0304", "benefitsMenu");

	}

	// Plan History
	@Test(groups = "Benefits")
	public void planHistory() throws InterruptedException, IOException {

		loginMLTC();
		// Click Benefits
		clickElementJSExecute("BE0701", "benefitsMenu");
		// Click planHistory Sub-menu
		clickElementJSExecute("BE0702", "benefitsMenu");
		// Verify Page Title
		verifyPageTitle("BE0702", "benefitsMenu", colNum);
	}

	// My Care
	// myHealthPlanCareTeam
	@Test(groups = "My Care")
	public void myHealthPlanCareTeam() throws InterruptedException, IOException {

		loginMLTC();
		// Click My Care Menu
		clickElementJSExecute("MC0201", "myCareMenu");
		// Click myHealthPlanCareTeam Sub-menu
		clickElementJSExecute("MC0202", "myCareMenu");
		// Verify Page Title
		verifyPageTitle("MC0202", "myCareMenu", colNum);
		
		// Click Communication Center
		openChildWindowVerifyTitle("MC0203", "myCareMenu", colNum);

	}

	// serviceAuthorizations
	@Test(groups = "My Care")
	public void serviceAuthorizations() throws InterruptedException, IOException {

		loginMLTC();
		// Click My Care Menu
		clickElementJSExecute("MC0301", "myCareMenu");
		// Click serviceAuthorizationsSub-menu
		clickElementJSExecute("MC0302", "myCareMenu");
		// Verify Page Title
		verifyPageTitle("MC0302", "myCareMenu", colNum);
	}

	// My Medical Supplies and Equipment
	@Test(groups = "My Care")
	public void myMedicalSupp() throws InterruptedException, IOException {

		loginMLTC();
		// Click My Care Menu
		clickElementJSExecute("MC0401", "myCareMenu");
		// Click My Medica Supp Sub-menu
		clickElementJSExecute("MC0402", "myCareMenu");
		// Verify Page Title
		verifyPageTitle("MC0402", "myCareMenu", colNum);
	}

	// Claims
	// MyClaims
	@Test(groups = "Claims")
	public void claims() throws InterruptedException, IOException {

		loginMLTC();
		// Click Claims Menu
		clickElementJSExecute("CL0101", "claimsMenu");
		// Click My Claims Sub-menu
		clickElementJSExecute("CL0102", "claimsMenu");
		// Verify Page Title
		verifyPageTitle("CL0102", "claimsMenu", colNum);
		
		// Click Submit Reimbursement Request Link
		clickElementJSExecute("CL0103", "claimsMenu");
	}

	// Resources
	// My Plan Resources
	@Test(groups = "Resources")
	public void myPlanResources() throws InterruptedException, IOException {

		loginMLTC();
		// Click Resources Menu
		clickElementJSExecute("RE0101", "resourcesMenu");
		// Click My Plan Resources Sub-menu
		clickElementJSExecute("RE0102", "resourcesMenu");
		// Verify Page Title
		verifyPageTitle("RE0102", "resourcesMenu", colNum);
		
		// Click View All Resources Link
		openChildWindowVerifyTitle("RE0103", "resourcesMenu", colNum);
		// Click Transportation Link
		openChildWindowVerifyTitle("RE0104", "resourcesMenu", colNum);
		// Click Ordering Medical Supplies Link
		openChildWindowVerifyTitle("RE0105", "resourcesMenu", colNum);
		// Click Member Materials and Forms Link
		openChildWindowVerifyTitle("RE0106", "resourcesMenu", colNum);
		// Click Frequently Asked Questions Link
		openChildWindowVerifyTitle("RE0107", "resourcesMenu", colNum);
	}

	// Benefit Partners
	@Test(groups = "Resources")
	public void benefitPartners() throws InterruptedException, IOException {

		loginMLTC();
		// Click Resources Menu
		clickElementJSExecute("RE0201", "resourcesMenu");
		// Click Benefit Partners Sub-menu
		clickElementJSExecute("RE0202", "resourcesMenu");
		// Verify Page Title
		verifyPageTitle("RE0202", "resourcesMenu", colNum);
		
		// Click Healthplex
		openChildWindowVerifyTitle("RE0203", "resourcesMenu", colNum);
		// Click Superior Vision
		openChildWindowVerifyTitle("RE0204", "resourcesMenu", colNum);
		// Click Click Modivcare
		openChildWindowVerifyTitle("RE0205", "resourcesMenu", colNum);
	}

	// Grievances and Appeals
	// Grievances
	@Test(groups = "Grievances and Appeals")
	public void grievances() throws InterruptedException, IOException {

		loginMLTC();
		// Click Grievances and Appeals Menu
		clickElementJSExecute("GA0101", "grievancesMenu");
		// Click Grievances Sub-menu
		clickElementJSExecute("GA0102", "grievancesMenu");
		// Verify Page Title
		verifyPageTitle("GA0102", "grievancesMenu", colNum);
		
		// Click Learn About Complaints
		openChildWindowVerifyTitle("GA0103", "grievancesMenu", colNum);
	}

	// Appeals
	@Test(groups = "Grievances and Appeals")
	public void appeals() throws InterruptedException, IOException {

		loginMLTC();
		// Click Grievances and Appeals Menu
		clickElementJSExecute("GA0201", "grievancesMenu");
		// Click Grievances Sub-menu
		clickElementJSExecute("GA0202", "grievancesMenu");
		// Verify Page Title
		verifyPageTitle("GA0202", "grievancesMenu", colNum);
		
		// Click Learn About Appeals
		openChildWindowVerifyTitle("GA0203", "grievancesMenu", colNum);
	}

	// Communication Center
	@Test(groups = "Communication Center")
	public void communicationCenter() throws InterruptedException, IOException {

		loginMLTC();
		// Click Communication Center Menu
		clickElementJSExecute("CC0101", "comCenterMenu");
		// Click Communication Center Sub-menu
		clickElementJSExecute("CC0102", "comCenterMenu");
		// Verify Page Title
		verifyPageTitle("CC0102", "comCenterMenu", colNum);
		
		// Click Learn About Complaints
		clickElementJSExecute("CC0103", "comCenterMenu");

		driver.navigate().back();
		// Click Send a Message
		clickElementJSExecute("CC0104", "comCenterMenu");
	}

	// My Account
	@Test(groups = "My Account")
	public void myAccount() throws InterruptedException, IOException {

		loginMLTC();
		// Click My Account Menu
		clickElementJSExecute("MA0101", "myAccountMenu");
		// Click My Account Sub Menu
		clickElementJSExecute("MA0102", "myAccountMenu");
		// Verify Page Title
		verifyPageTitle("MA0102", "myAccountMenu", colNum);
		
		// Click Request Change
		clickElementJSExecute("MA0103", "myAccountMenu");
		// Click Cancel
		clickElementJSExecute("MA0104", "myAccountMenu");
		// Click Change Password
		clickElementJSExecute("MA0105", "myAccountMenu");

	}

}
