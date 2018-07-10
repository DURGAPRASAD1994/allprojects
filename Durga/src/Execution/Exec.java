package Execution;

import org.testng.annotations.Test;

import Actions.Login_Actions;
import Repository.InspectElements;
import Repository.InvokeBrowser;

public class Exec 
{
	@Test
 public void Execution()
 {
	 InvokeBrowser.browser();
	 InspectElements.mail();
	 InspectElements.pwd();
	 Login_Actions.login();
	 InvokeBrowser.clo();
 }
}
