package com.transformuk;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="data", path="data")
public interface TestDataRepository extends PagingAndSortingRepository<TestData, Integer> {
	List<TestData> findAll();
	TestData findByI(@Param("i") int i);
	List<TestData> findByJ(@Param("j") int j);
}
