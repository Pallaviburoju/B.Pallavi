package com.example.pgrm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.ConvertService;

@RestController
public class Conversion {
	@Autowired
	private ConvertService convertService;
	
	
	@GetMapping("/")
	public List Hello() throws Exception {
		return convertService.result();
	}
	
	@GetMapping("/upload")
	public void upload() throws Exception {
		convertService.upload();
	}
	
	@PutMapping("/update")
		public int updateData(@RequestBody String company) throws Exception {
			return convertService.updateData(company);
		}
	
	
}
