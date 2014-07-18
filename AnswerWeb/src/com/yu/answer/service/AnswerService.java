package com.yu.answer.service;

import com.yu.answer.model.Answer;

public interface AnswerService {
	
	void addAnswer(Answer answer);
	
	void buildAnswer(int qid);
}
