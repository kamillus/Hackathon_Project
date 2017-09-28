package com.arcelormittal.dofasco.Hackathon.Project;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import com.arcelormittal.dofasco.Hackathon.controllers.ApplicationController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(MockitoJUnitRunner.class)
public class HackathonProjectApplicationTests {

	ApplicationController a = new ApplicationController();

	@Test
	public void exampleTest()
	{
		assertEquals("hello", a.helloAction());
	}
	
}
