package com.yu.answer.model;

public class QuestionItem {
	private int id;
	
	private Question question;
	
	private String content;
	
	private String result;
	
	private QuestionType type;
	
	private int orderField;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public QuestionType getType() {
		return type;
	}

	public void setType(QuestionType type) {
		this.type = type;
	}

	public int getOrderField() {
		return orderField;
	}

	public void setOrderField(int orderField) {
		this.orderField = orderField;
	}
	
	
}
