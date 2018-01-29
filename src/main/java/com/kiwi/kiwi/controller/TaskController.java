package com.kiwi.kiwi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kiwi.kiwi.domain.Task;
import com.kiwi.kiwi.services.TaskServices;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TaskController {

	@Autowired
	TaskServices taskServices;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Task>> findAll() {
		return new ResponseEntity<List<Task>>(taskServices.findAll(), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Task> addTask(@RequestBody Task task) {
		return new ResponseEntity<Task>(taskServices.save(task), HttpStatus.OK);
	}

}
