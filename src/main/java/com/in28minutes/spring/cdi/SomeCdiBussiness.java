package com.in28minutes.spring.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
@Named
public class SomeCdiBussiness {
	
	//@Autowired
	@Inject
	SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCdiDao() {
		return someCdiDao;
	}

	public void setSomeCdiDao(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}
public int findGreatest() {
	int[] data = someCdiDao.getData();
	int greatest = Integer.MIN_VALUE;
	for(int val : data) {
		greatest = Math.max(val, greatest);
	}
	return greatest;
}
	

}
