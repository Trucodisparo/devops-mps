package devops;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
	
	MainFunc m;
	
	String t = "Test";

	@Before
	public void setUp() throws Exception {
		m = new MainFunc();
		m.setName(t);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetName() {
		assert(m.getName().equals(t));
	}
}
