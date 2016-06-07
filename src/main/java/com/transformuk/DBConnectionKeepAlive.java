package com.transformuk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DBConnectionKeepAlive {
	@Autowired
	private TestDataRepository testDataRepo;
	
	@Scheduled(fixedRate=1000)
	public void addToDB() {
		testDataRepo.save(new TestData(0, 999));		
	}

}
