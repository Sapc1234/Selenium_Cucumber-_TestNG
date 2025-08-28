package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks

{
	@Before("@NetBanking")
	public void netBankingSetup()

	{
		System.out.println("***********");
		System.out.println("SetUp the entries in NetBanking database");
	}
	
	@After
	
	public void tearDown()
	
	{
		System.out.println("Clear the entries");
	}

	@Before("@Mortgage")
	public void mortgageSetup()

	{
		System.out.println("SetUp the entries in Mortgage database");
	}
	
	//Before->Background->Scenario->After
}
