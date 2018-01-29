package com.kiwi.kiwi.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tname;
	private String owner;
	private int due;
	private Date dueDt;

	private Date createDt;
	private Date updateDt;
	private String createUser;
	private String updateUser;
	private String tile;
	private boolean dueToday;

	private boolean completed;

	public Task() {

	}

	public Task(Long id, String tname, String owner, int due, Date dueDt, Date createDt, Date updateDt,
			String createUser, String updateUser, String tile, boolean dueToday, boolean completed) {
		super();
		this.id = id;
		this.tname = tname;
		this.owner = owner;
		this.due = due;
		this.dueDt = dueDt;
		this.createDt = createDt;
		this.updateDt = updateDt;
		this.createUser = createUser;
		this.updateUser = updateUser;
		this.tile = tile;
		this.dueToday = dueToday;
		this.completed = completed;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public Date getDueDt() {
		return dueDt;
	}

	public void setDueDt(Date dueDt) {
		this.dueDt = dueDt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getDue() {
		return due;
	}

	public void setDue(int due) {
		this.due = due;
	}

	public Date getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public Date getUpdateDt() {
		return updateDt;
	}

	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public String getTile() {
		return tile;
	}

	public void setTile(String tile) {
		this.tile = tile;
	}

	public boolean isDueToday() {
		return dueToday;
	}

	public void setDueToday(boolean dueToday) {
		this.dueToday = dueToday;
	}

}
