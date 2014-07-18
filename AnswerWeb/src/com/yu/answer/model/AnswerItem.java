package com.yu.answer.model;

public class AnswerItem {
	private int id;
	
	private Answer answer;
	
	private QuestionItem questionItem;

	private String reply;
	
	private String result;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public QuestionItem getQuestionItem() {
		return questionItem;
	}

	public void setQuestionItem(QuestionItem questionItem) {
		this.questionItem = questionItem;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}
}
