package com.transformuk;

import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cucumber.api.java.en.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class TestDataSteps {
	@Given("something$")
	public void step1() {
		System.out.println("something step 1...");
	}

	@When("something else")
	public void step2() {
		System.out.println("something step 2...");
	}
	
	@When("something bad happens")
	public void badStep() {
		System.out.println("something bad...");
	}

	@Then("amazing")
	public void step3() {
		System.out.println("something step 3...");
	}

	@Then("we say ouch")
	public void ouch() {
		System.out.println("ouch");
	}

}
