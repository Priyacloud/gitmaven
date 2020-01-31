package mavengit.jenkins;

import org.testng.annotations.Test;

public class DEmo {

	@Test
	public void launchBrowser()
	{
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("browser"));
	}
	@Test
	public void createAccount()
	{
		System.out.println("create new account");
		
	}
}
