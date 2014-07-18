package com.yu.answer.service.impl;

import java.util.List;

import com.yu.answer.mapper.QuestionMapper;
import com.yu.answer.model.Question;
import com.yu.answer.model.QuestionItem;
import com.yu.answer.service.QuestionService;

public class QuestionServiceImpl implements QuestionService {
	
	private QuestionMapper questionMapper;
	
	public List<Question> queryQuestion(Question question) {
		return questionMapper.queryQuestion(question);
	}
	
	public List<QuestionItem> getQuestionList(int qid) {
		return questionMapper.getQuestionList(qid);
	}
	
	public Question getQuestionById(int qid) {
		return questionMapper.getQuestionById(qid);
	}

	public void setQuestionMapper(QuestionMapper questionMapper) {
		this.questionMapper = questionMapper;
	}

	
}
