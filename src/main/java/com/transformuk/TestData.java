package com.transformuk;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class TestData {
	@Id
        @GeneratedValue(strategy=GenerationType.AUTO)
	private int i;
	private int j;
	
	protected TestData() {}
	
	public TestData(int i, int j) {
            this.i = i;
            this.j = j;
        }
	
	@Override
	public String toString() {
		return "i = " + i + ", j = " + j;
	}

}
