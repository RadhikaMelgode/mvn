package com.vildaris.testscripts.Operations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateOperation {

	@Test
	public void createOp() {
		Reporter.log("Campaign created", true);
		Reporter.log("campaign modified", true);
	}
}
