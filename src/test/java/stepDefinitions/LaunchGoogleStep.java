package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LaunchGoogle;

public class LaunchGoogleStep {

    LaunchGoogle launchGoogle=new LaunchGoogle();

    @Given("user launches the google {string}")
    public void userLaunchesTheGoogle(String url) {
       launchGoogle.LaunchGoogle(url,"Selenium is good");
    }

    @When("I enter the text {string}")
    public void iEnterTheText(String searchText) {
        launchGoogle.searchGivenText(searchText);
    }


    @Then("Click on the {int}st Link contains {string}")
    public void clickOnTheStLinkContains(int link, String text) throws InterruptedException {
        launchGoogle.navigateToLink(link,text);
    }
}
