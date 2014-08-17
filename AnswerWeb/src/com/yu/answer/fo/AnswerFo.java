package com.yu.answer.fo;

import java.util.List;

import com.yu.answer.model.Answer;
import com.yu.answer.model.AnswerItem;

public class AnswerFo {
	private Answer answer;
	
	private List<AnswerItem> answerItems;

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public List<AnswerItem> getAnswerItems() {
		return answerItems;
	}

	public void setAnswerItems(List<AnswerItem> answerItems) {
		this.answerItems = answerItems;
	}

	
}
