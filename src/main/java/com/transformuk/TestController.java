package com.transformuk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Autowired
	private TestDataRepository testDataRepo;

	@RequestMapping("/dump")
	public ResponseEntity<String> test() {
		String output = "<html><body><pre>test_data contains:\n";
		output += "=====================\n";
		for (TestData td : testDataRepo.findAll()) {
			output += "  " + td + "\n";
		}
		output += "=====================\n</pre></body></html>";
		return ResponseEntity.ok(output);
	}
}
