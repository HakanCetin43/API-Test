import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("I am in the login page")
    public void iAmInTheLoginPage() {
    }

    @When("I type a valid username")
    public void iTypeAValidUsername() {
    }

    @And("I type a valid password")
    public void iTypeAValidPassword() {
    }

    @Then("The main page opens")
    public void theMainPageOpens() {
    }

    @And("Login menu appears")
    public void loginMenuAppears() {
        
    }

    @And("User profile appears")
    public void userProfileAppears() {
        
    }

    @And("{string} message appears")
    public void messageAppears(String arg0) {
    }

    @When("I type a {string}")
    public void iTypeA(String arg0) {
    }

    @And("Response code should be {string}")
    public void responseCodeShouldBe(String arg0) {
    }

    @And("Response message should be {string}")
    public void responseMessageShouldBe(String arg0) {
    }
}
