package practicePackage;

import org.testng.annotations.Test;

public class PracticeTest{

	@Test(groups = "smoke")
	public void ScriptTest1() {
		System.out.println("-- test 1 is executing --");
	}

	@Test()
	public void ScriptTest2() {
		System.out.println("-- test 2 is executing --");
	}
}
