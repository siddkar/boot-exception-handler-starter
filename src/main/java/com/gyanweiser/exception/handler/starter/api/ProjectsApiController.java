package com.gyanweiser.exception.handler.starter.api;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gyanweiser.exception.handler.starter.exception.CustomApiException;
import com.gyanweiser.exception.handler.starter.model.Project;

@RestController
@RequestMapping("/projects")
public class ProjectsApiController {

	@PostMapping
	public ResponseEntity<Object> createProject(@Valid @RequestBody Project project) {
		int i = 0;
		if (i == 0)	throw new CustomApiException("Internal Server Error");
		return new ResponseEntity<>(project, HttpStatus.CREATED);
	}

	@GetMapping
	public String sayHi() {
		// TODO Auto-generated method stub
		return "Hello World!!!";
	}

}
