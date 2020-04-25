package stepDefinition;

import java.util.List;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Calculator {
    int x,y,result;
	@Given("^I have first number (\\d+)$")
	public void i_have_first_number(int arg1) throws Throwable {
		x=arg1;
	}

	@Given("^I have second number (\\d+)$")
	public void i_have_second_number(int arg1) throws Throwable {
		y=arg1;
	}

	@Then("^Add two numbers$")
	public void add_two_numbers() throws Throwable {
		result=x+y;
	}

	@Then("^Display Result$")
	public void display_Result() throws Throwable {
		System.out.println(result);
	}
	

	@Given("^I have following numbers$")
	public void i_have_following_numbers(List<Integer> list) throws Throwable {
		  for(int i=0;i<list.size();i++) {
		    	result=result+list.get(i);
		    }
	}

	@Then("^I will add all of those numbers$")
	public void i_will_add_all_of_those_numbers() throws Throwable {
		  System.out.println("Adding all elements");
	}


}
