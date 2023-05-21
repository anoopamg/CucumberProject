package stepdefs;

import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PurchaseTotalStepDef {

	Map<String, Integer> prices;
	int totalBill = 0;

	@Given("I want to buy given items")
	public void i_want_to_buy_below_items(Map<String, Integer> priceList) {
		this.prices = priceList;
	}

	@When("I buy them")
	public void i_buy_them() {
		for (String key : prices.keySet()) {
			totalBill = totalBill + prices.get(key);
		}
	}

	@Then("I should get total amount as {int}")
	public void i_should_get_total_amount_as(int expRes) {
		Assert.assertEquals(expRes, totalBill);
	}

	@Given("I want to buy given quantity of items")
	public void i_want_to_buy_given_quantity_of_items(io.cucumber.datatable.DataTable dataTable) {
		int rows = dataTable.height();
		for (int i = 0; i < rows; i++) {
			String item = dataTable.cell(i, 0);
			int quan = Integer.parseInt(dataTable.cell(i, 1));
			int value = Integer.parseInt(dataTable.cell(i, 2));
			totalBill = totalBill + (quan * value);
		}
	}

}
