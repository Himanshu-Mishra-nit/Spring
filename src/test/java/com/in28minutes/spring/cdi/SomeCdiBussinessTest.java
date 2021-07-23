package com.in28minutes.spring.cdi;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.spring.SpringIn5StepsCdiApplication;

//Load the context
@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBussinessTest {
	
	
	//Get this bean from the contest
	@InjectMocks
	SomeCdiBussiness bussiness;
	
	@Mock
	SomeCdiDao daoMock;
	
	@Test
	public void testBasicScenario() {
		//when daoMock.getData method is called return int[]{2,4}
		when(daoMock.getData()).thenReturn(new int [] {2,4});
		int res = bussiness.findGreatest();
		assertEquals(4, res);
	}

}
