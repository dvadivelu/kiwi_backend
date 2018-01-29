package com.kiwi.kiwi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kiwi.kiwi.domain.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

	@Query("select t from Task t where t.completed= false order by due_dt asc")
	List<Task> findAllTasks();

}
