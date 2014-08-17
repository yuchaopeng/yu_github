package com.yu.answer.mapper;

import com.yu.answer.fo.AnswerResultSubmit;
import com.yu.answer.model.Answer;
import com.yu.answer.model.AnswerItem;

public interface AnswerMapper {
	void addAnswer(Answer answer);
	
	void addAnswerItem(AnswerItem item);
	
	void updateAnswerItem(AnswerResultSubmit result);
	
	AnswerItem getAnswerItem(int answerItemId);
}
