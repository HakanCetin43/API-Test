import io.cucumber.java.en.*;
import org.junit.Assert;

public class FizzBuzzStepDefinitions {
    FizzBuzzGame game;
    String result;
    @Given("Game starts")
    public void game_starts() {
        game=new FizzBuzzGame();
    }
    @When("User add a number {int}")
    public void user_add_a_number(int number) {
        result=game.play(number);
    }
    @Then("Waiting Fizz")
    public void waiting_Fizz() {
        Assert.assertEquals(result,"Fizz");
    }
    @Then("Waiting {string}")
    public void waiting(String string) {
        Assert.assertEquals(string,result);
    }
}

