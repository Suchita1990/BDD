package stepDefinition;

import java.util.List;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Calculator1 {
	int x, y, result ;

	@Given("^I have a number (\\d+)$")
	public void m1(int arg1) throws Throwable {
		//x = arg1;
		result=result+arg1;
	}

	/*@And("^I have another number (\\\\d+)$")
	public void m2(int arg1) throws Throwable {
		y = arg1;
	}*/

	@Then("^Adding two numbers$")
	public void adding_two_numbers() throws Throwable {
		//result = x + y;
		 System.out.println("Adding two numbers: ");
	}

	@Then("^Display Addition$")
	public void display_Addition() throws Throwable {
		System.out.println("Result :" +new SignInStep().result);
	}

	/*@Given("^I have following numbers$")
	public void i_have_following_numbers(List<Integer> list) throws Throwable {
	    for(int i=0;i<list.size();i++) {
	    	result=result+list.get(i);
	    }
	}

	@Then("^I will add all of those numbers$")
	public void i_will_add_all_of_those_numbers() throws Throwable {
	  System.out.println("Adding all elements");
	   
	}*/

}
