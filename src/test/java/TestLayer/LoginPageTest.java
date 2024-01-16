package TestLayer;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class LoginPageTest extends BaseClass {

	public static void ValidateLoginFun() {
		LoginPage login = new LoginPage();
		login.loginFunctionality();
		login.enterValidCredintial();
	}
}
