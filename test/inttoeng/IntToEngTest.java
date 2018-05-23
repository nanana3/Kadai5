package inttoeng;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import inttoeng.IntToEng;

public class IntToEngTest {

	@Test
	public void test() {
		IntToEng ite = new IntToEng();
		String expected = "one handred eleven thousand one handred";
		String actual = ite.translateEng(111100);
		assertThat(actual,is(expected));
	}

}
