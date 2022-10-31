package lims.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import lims.stepdef.JvmReport;



	@RunWith(Cucumber.class)
	@CucumberOptions(features= "C:\\Users\\xvd71\\eclipse-workspace\\BatchOrderEntry\\src\\test\\resources\\Batch.feature",glue= "lims.stepdef",
	dryRun=false,monochrome=true,plugin= {"json:C:\\Users\\xvd71\\eclipse-workspace\\LimsLogin\\Report\\JsonReport\\BOResult.json"})
	public class TestRunner {
		
		@AfterClass
		public static void report() {
	    JvmReport.generateJvmReport("C:\\Users\\xvd71\\eclipse-workspace\\LimsLogin\\Report\\JsonReport\\BOResult.json");

		}

}
