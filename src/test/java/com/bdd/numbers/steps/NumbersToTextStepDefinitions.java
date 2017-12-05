package com.bdd.numbers.steps;

import org.junit.Assert;

import com.numbers.assignment.ConvertNumbersToWords;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;;

public class NumbersToTextStepDefinitions {
	
	String convertedText= null;
	
	@Given("^The numbers assignment application has been installed$")
	public void the_numbers_assignment_application_has_been_installed() throws Throwable {

	}

	@When("^I pass a (\\d+) number$")
	public void i_pass_a_number(int numForConversion) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ConvertNumbersToWords objSingleDigit = new ConvertNumbersToWords();
		convertedText = objSingleDigit.convert(numForConversion).trim();
		Assert.assertNotNull(convertedText);
	}

	@Then("^The number should be converted to the following \"([^\"]*)\"$")
	public void the_number_should_be_converted_to_the_following(String expectedText) throws Throwable {
		Assert.assertEquals(expectedText, convertedText);
	}

}
