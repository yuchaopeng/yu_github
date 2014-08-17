package com.yu.answer.service;

import java.util.List;

import com.yu.answer.fo.AnswerResultSubmit;
import com.yu.answer.model.Answer;
import com.yu.answer.model.AnswerItem;

public interface AnswerService {
	
	void addAnswer(Answer answer);
	
	void addAnswerItem(AnswerItem item);
	
	Answer buildAnswer(int qid);
	
	List<AnswerItem> buildAnswerItem(Answer answer);
	
	void updateAnswerItem(AnswerResultSubmit result);
	
	/**
	 * Ìá½»´ð°¸
	 * @param result
	 * @return
	 */
	boolean submitResult(AnswerResultSubmit result);
}
