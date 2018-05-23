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
		String expected = "nine thousand nine handred ninety nine";
		String actual = ite.translateEng(9999);
		assertThat(actual,is(expected));
	}

}
