package practicePackage;

import org.testng.annotations.Test;

public class SamplePracticeTest{
	
	@Test(groups = {"smoke","regression"})
	public void ScriptTest3() {
		System.out.println("-- paneer handi--");
	}

	@Test(groups = "smoke")
	public void ScriptTest4() {
		System.out.println("-- test 4 is executing --");
	}
}
