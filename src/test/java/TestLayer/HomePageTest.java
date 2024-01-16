package TestLayer;

import BaseLayer.BaseClass;
import PageLayer.HomePage;

public class HomePageTest extends BaseClass {

	public static void validateHomePageTestCase()
	{
		HomePage homePage=new HomePage();
		homePage.homePageTest();
		homePage.homePageTitle();
	}
}
