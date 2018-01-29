package com.kiwi.kiwi.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiwi.kiwi.domain.Task;
import com.kiwi.kiwi.repo.TaskRepository;

@Service
public class TaskServices {

	@Autowired
	private TaskRepository taskRepository;

	public Task save(Task task) {
		if (task != null) {
			if (task.getId() == null) {
				LocalDate localDate = LocalDate.now();
				LocalDate dueDate = localDate.plusDays(task.getDue());
				task.setDueDt(Date.valueOf(dueDate));
				task.setCreateDt(Date.valueOf(localDate));
			} else {
				task.setUpdateDt(Date.valueOf(LocalDate.now()));
			}
		}
		return taskRepository.saveAndFlush(task);

	}

	public List<Task> findAll() {
		return taskRepository.findAllTasks();
	}

}
