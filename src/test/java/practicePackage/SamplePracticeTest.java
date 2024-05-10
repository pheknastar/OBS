package practicePackage;

import org.testng.annotations.Test;

public class SamplePracticeTest{
	
	@Test(groups = {"smoke","regression"})
	public void ScriptTest3() {
		System.out.println("-- test 3 is executing --");
	}

	@Test(groups = "smoke")
	public void ScriptTest4() {
		System.out.println("-- test 04 is executing --");
	}
}
