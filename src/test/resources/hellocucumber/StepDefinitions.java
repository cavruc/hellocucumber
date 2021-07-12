@Given("today is Sunday")
public void today_is_Sunday() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
        }

@When("I ask whether it's Friday yet")
public void i_ask_whether_it_s_Friday_yet() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
        }

@Then("I should be told {string}")
public void i_should_be_told(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
        }
        Copy each of the three snippets for the undefined steps and paste them into src/test/java/hellocucumber/StepDefinitions.java .

        See scenario reported as pending
        Run Cucumber again. This time the output is a little different:

        -------------------------------------------------------
        T E S T S
        -------------------------------------------------------
        Running hellocucumber.RunCucumberTest
        Feature: Is it Friday yet?
        Everybody wants to know when it's Friday

        Scenario: Sunday isn't Friday        # hellocucumber/is_it_friday_yet.feature:4
        Given today is Sunday              # Stepdefs.today_is_Sunday()
        io.cucumber.java.PendingException: TODO: implement me
        at hellocucumber.Stepdefs.today_is_Sunday(StepDefinitions.java:14)
        at ?.today is Sunday(classpath:hellocucumber/is_it_friday_yet.feature:5)

        When I ask whether it's Friday yet # Stepdefs.i_ask_whether_it_s_Friday_yet()
        Then I should be told "Nope"       # Stepdefs.i_should_be_told(String)

        Pending scenarios:
        hellocucumber/is_it_friday_yet.feature:4 # Sunday isn't Friday

        1 Scenarios (1 pending)
        3 Steps (2 skipped, 1 pending)
        0m0.188s

        io.cucumber.java.PendingException: TODO: implement me
        at hellocucumber.Stepdefs.today_is_Sunday(StepDefinitions.java:13)
        at ?.today is Sunday(classpath:hellocucumber/is_it_friday_yet.feature:5)