package com.yu.answer.service;

import java.util.List;

import com.yu.answer.model.Question;
import com.yu.answer.model.QuestionItem;

public interface QuestionService {
	
	List<Question> queryQuestion(Question question);
	
	Question getQuestionById(int qid);
	
	List<QuestionItem> getQuestionList(int qid);
}
