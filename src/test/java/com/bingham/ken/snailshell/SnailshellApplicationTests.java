package com.bingham.ken.snailshell;

import com.bingham.ken.snailshell.model.Shell;
import com.bingham.ken.snailshell.service.ShellService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SnailshellApplicationTests {

	@Autowired
	private ShellService shellService;

	@Test
	public void testListOfAngles(){

		Shell shell = shellService.getListOfAngles();

		assertTrue( shell.getListOfXAngles().size() == 99);
		assertTrue( shell.getListOfXAngles().get(0).doubleValue() == 0.0);
		assertTrue( shell.getListOfXAngles().get(1).doubleValue() == 0.03173685957207765);
	}
}
