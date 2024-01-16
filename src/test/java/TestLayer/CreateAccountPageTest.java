package TestLayer;

import BaseLayer.BaseClass;
import PageLayer.createAccountPage;

public class CreateAccountPageTest extends BaseClass{
	public static void validateCreateAccountFun() {
		createAccountPage create= new createAccountPage();
		 create.createAccount();
		 create.createTitalPage();
	}

}
