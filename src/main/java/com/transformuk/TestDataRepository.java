package com.transformuk;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TestDataRepository extends CrudRepository<TestData, Integer> {
	List<TestData> findAll();
}
