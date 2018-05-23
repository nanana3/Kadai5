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
		String expected = "nineteen";
		String actual = ite.translateEng(19);
		assertThat(actual,is(expected));
	}

}
