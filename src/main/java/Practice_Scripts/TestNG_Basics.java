package Practice_Scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Basics {

		/* @BeforeSuite-->setup system property for chrome
	@BeforeTest-->launch chrome Browser
	@Before-->login to app
	@BeforeMethod-->enter URL
	@Test1-->Google title test
	@AfterMethod-->logout from app
	
	@BeforeMethod-->enter URL
	@Test2-->search test
	@AfterMethod-->logout from app
	@AfterClass-->close Browser
	@AfterTest-->deleteAllCookies	 */

	// Pre-Conditions annotations-- starting with @Before
	@BeforeSuite  //1
	public void setUp() {
		System.out.println("@BeforeSuite-->setup system property for chrome");

	}

	@BeforeTest  //2
	public void launchBrowser(){
		System.out.println("@BeforeTest-->launch chrome Browser");
	}

	@BeforeClass  //3
	public void login() {
		System.out.println("@Before-->login to app");

	}
					/*@BeforeMethod
					 * @Test -1
					 * @AfterMethod
					 * 
					 * @BeforeMethod
					 * @Test -2
					 * @AfterMethod
					 * 
					 * @BeforeMethod
					 * @Test -3
					 * @AfterMethod      */

	@BeforeMethod   //4
	public void enterURL(){
		System.out.println("@BeforeMethod-->enter URL");
	}



	// test cases --- starting with @Test
	// testcase: 1
	
	@Test      //5
	public void googleTitleTest(){
		System.out.println("@Test1-->Google title test");
	}
	// testcase: 2
	@Test
	public void searchTest() {
		
		System.out.println("@Test2-->search test");
	}




	// Post- conditions starting with @After
	@AfterMethod  //6
	public void logOut(){
		System.out.println("@AfterMethod-->logout from app");
	}

	@AfterTest //7
	public void deleteAllCookies(){
		System.out.println("@AfterTest-->deleteAllCookies");
	}

	@AfterClass //8
	public void closeBrowser(){
		System.out.println("@AfterClass-->close Browser");
	}


	@AfterSuite   //9
	public void genetrateTestReport(){
		System.out.println("@AfterSuite-->generateTestReport");

	}
}
