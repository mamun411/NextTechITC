package StepDefinition;

import Utility.Base_Parent;
import cucumber.api.java.en.Given;

public class Login extends Base_Parent{


@Given("^MetaLaunch \"([^\"]*)\"$")
public void metalaunch(String URL) throws Throwable {
	metaLaunchURL(URL);
}
	
}
