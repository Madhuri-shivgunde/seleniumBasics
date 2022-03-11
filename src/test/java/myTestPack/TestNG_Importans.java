package myTestPack;

public class TestNG_Importans {
	
	//TsetNG -- Java Unit tesing Framework used by Java Automation QA Engg, to Manage TestCases
	
	
	/*
	 
	 Language ---- TestCase Management tool
	 
	 Java 			TestNG
	 Python			PyTest, UnitTest
	 php			phpUnit
	 JS				Mocha, Jasmin
	 C#				NUnit
	 */
	
	
	/*
	 Uses of TestNg
	 
	 1. To Write TestCases
	 2. To decorate TestCases
	 3. To manage TestCases
	 4. To maintain TestCases
	 5. To prioritize TestCases for execution
	 6. To pass parameteres to testCases-Parameterization
	 7. To provide data to testCases- ddataProvider
	 8. Provides Annotations
	 9. Provides Assertions- soft and hard assertions
	 10. Generates HTML reports, Xml reports
	 11. provides listerners- using can generates allure and extent reports
	 12. provide Test Runner - testng.xml
	 
	 */
	
	/*
	 -In maven project, we need to add TestNG dependency to use in pom.xml file
	 - To run TestNg testCases, need to install eclipse plugin for TestNg 
	 for that search on google--> eclipse plugin for testng, -->get the url of proper version of testng--->
	 come to eclipse --> goto Help menu---> click install new software --> in new popup window paste TestNg plugin  url
	 --> n follow steps
	 */
	
	
	/*
	 
	 TestCases need to write under  ----> 		src/test/java folder
	 
	 All Java Util, library, page classes --->  src/main/java
	 */
	
	
	/*
	 Points to remember while writing and executing testcase
	 
	 1. Testcase classes does not contain main() method
	 2. We can write preconditions, postcondition methods using annotations
	 
	  	For precondition---> we use annotations	@BeforeSuite, @BeforeTest, @BeforeClass, @BeforeMethod
	  	For post Condition--->@AfterSuite, @AfterTest, @AftereClass, @AfterMethod
	  	To write Test Methods we use ---> @Test
	  	
	 3. All Test Method Name should end With Test eg. loginTest(),homepageTest(),SearchTest()
	 
	 4. Test Methods executes in alphabetical order if no priorities are specified
	 5. If some of testcases are specified with priorities and some with non priorities , 
	 	in this case non prioritiesd test cases run in alphabetical order then prioritized testcase
	 	as all non priority testcases by default priority is set to 0.
	  	
	  	
	  5. to run TestFile --> rightclick on file in workspace --->run -->run as Testng
	  6. you can also create test runner xml file to run testcases
	 */

}
