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
		String expected = "ninety thousand ten";
		String actual = ite.translateEng(90011);
		assertThat(actual,is(expected));
	}

}
