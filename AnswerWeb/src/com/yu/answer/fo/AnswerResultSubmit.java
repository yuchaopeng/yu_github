package com.yu.answer.fo;

/**
 * 答题时提交的答案
 * @author yu
 *
 */
public class AnswerResultSubmit {
	private String answerId;
	private String answerItemId;
	private String answerResult;
	
	public String getAnswerId() {
		return answerId;
	}
	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}
	public String getAnswerItemId() {
		return answerItemId;
	}
	public void setAnswerItemId(String answerItemId) {
		this.answerItemId = answerItemId;
	}
	public String getAnswerResult() {
		return answerResult;
	}
	public void setAnswerResult(String answerResult) {
		this.answerResult = answerResult;
	}
	
	
}
