package uk.co.library.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchTestSteps {
    @Given("^I am on HomePage$")
    public void iAmOnHomePage() {
    }

    @When("^I enter job title \"([^\"]*)\"$")
    public void iEnterJobTitle(String title) {
     new HomePage().enterJobTitle(title);
    }

    @And("^I enter the \"([^\"]*)\"$")
    public void iEnterThe(String location)  {
        new HomePage().enterLocation(location);

    }

    @And("^I can select the \"([^\"]*)\"$")
    public void iCanSelectThe(String distance)  {
        new HomePage().selectDistance(distance);
    }

    @And("^I can click on more Search Options Link$")
    public void iCanClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("^I can enter salaryMin \"([^\"]*)\"$")
    public void iCanEnterSalaryMin(String minsalary)  {
        new HomePage().enterMinSalary(minsalary);
    }

    @And("^I can enter salaryMax \"([^\"]*)\"$")
    public void iCanEnterSalaryMax(String maxsalary)  {
        new HomePage().enterMaxSalary(maxsalary);
    }

    @And("^I can select salaryType \"([^\"]*)\"$")
    public void iCanSelectSalaryType(String salaryType)  {
        new HomePage().selectSalaryType(salaryType);
    }

    @And("^I can select jobType \"([^\"]*)\"$")
    public void iCanSelectJobType(String jobType)  {
        new HomePage().selectJobType(jobType);
    }

    @And("^I can click on 'Find Jobs' button$")
    public void iCanClickOnFindJobsButton() {
        new  HomePage().clickOnJobsButton();
    }

    @Then("^I can verify the result \"([^\"]*)\"$")
    public void iCanVerifyTheResult(String errormsg)  {
        Assert.assertEquals("Error Message not display",errormsg,new ResultPage().resultPage());

    }


}
