package com.yu.answer.model;

import java.util.Date;

public class Answer {
	private Long id;
	
	private String name;
	
	private Question question;
	
	private User user;
	
	private Date createDate;
	
	private Date endDate;
	
	private int rightNum;
	
	private int wrongNum;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getRightNum() {
		return rightNum;
	}

	public void setRightNum(int rightNum) {
		this.rightNum = rightNum;
	}

	public int getWrongNum() {
		return wrongNum;
	}

	public void setWrongNum(int wrongNum) {
		this.wrongNum = wrongNum;
	}
}
