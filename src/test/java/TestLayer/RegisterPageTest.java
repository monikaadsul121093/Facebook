package TestLayer;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;

public class RegisterPageTest extends BaseClass{
	
	
	public static void validateRegisterFuncionality()
	{
		RegisterPage register= new RegisterPage();
		
		register.registerPageFunctionality();
	}

}
