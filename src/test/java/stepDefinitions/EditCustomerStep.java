package stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.bankguru.actions.CreateCustomerPage;
import com.bankguru.actions.EditCustomerPage;
import com.bankguru.actions.HomePage;
import com.bankguru.actions.LoginPage;
import com.bankguru.actions.RegisterPage;

import commons.CommonTestCase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditCustomerStep extends CommonTestCase {

	WebDriver driver;
	String username, password;
	HomePage homePage;
	RegisterPage registerPage;
	LoginPage loginPage;
	CreateCustomerPage createCustomerPage;
	EditCustomerPage editCustomerPage;

	public EditCustomerStep() {
		driver = CommonTestCase.driver;
		editCustomerPage = PageFactory.initElements(driver, EditCustomerPage.class);
	}

	@When("^I input key tab to customer id$")
	public void i_input_key_tab_to_customer_id() {
		editCustomerPage.pressKeyTabCustomerId(Keys.TAB);

	}

	@When("^I input data \"([^\"]*)\" to customer id$")
	public void i_input_data_to_customer_id(String value) {
		editCustomerPage.inputCustomerId(value);

	}

	@When("^I input customer id$")
	public void i_input_customer_id() {
		editCustomerPage.inputCustomerId(CreateCustomerStep.customerId);
	}

	@When("^I click to submit button$")
	public void i_click_to_submit_button() {
		editCustomerPage.clickSummit();

	}

	@When("^I update key tab to address$")
	public void i_update_key_tab_to_address() {
		editCustomerPage.pressKeyTabAddress(Keys.TAB);

	}

	@When("^I update key tab to city$")
	public void i_update_key_tab_to_city() {
		editCustomerPage.pressKeyTabCity(Keys.TAB);
	}

	@When("^I update data \"([^\"]*)\" to city$")
	public void i_update_data_to_city(String value) {
		editCustomerPage.inputNumberCity(value);
	}

	@When("^I update key tab to state$")
	public void i_update_key_tab_to_state() {

	}

	@When("^I update data \"([^\"]*)\" to state$")
	public void i_update_data_to_state(String value) {

	}

	@When("^I update data \"([^\"]*)\" to pin$")
	public void i_update_data_to_pin(String value) {

	}

	@When("^I update key tab to pin$")
	public void i_update_key_tab_to_pin() {

	}

	@When("^I update key tab to phone$")
	public void i_update_key_tab_to_phone() {

	}

	@When("^I update data \"([^\"]*)\" to phone$")
	public void i_update_data_to_phone(String value) {

	}

	@When("^I update key tab to email$")
	public void i_update_key_tab_to_email() {

	}

	@When("^I update data \"([^\"]*)\" to email$")
	public void i_update_data_to_email(String value) {

	}

	@When("^I update key space to email$")
	public void i_update_key_space_to_email() {

	}

	@Then("^Close browser$")
	public void close_browser() {

	}

}