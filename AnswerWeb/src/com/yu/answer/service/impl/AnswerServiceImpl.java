package com.yu.answer.service.impl;

import java.util.Date;

import com.yu.answer.mapper.AnswerMapper;
import com.yu.answer.model.Answer;
import com.yu.answer.model.Question;
import com.yu.answer.service.AnswerService;
import com.yu.answer.service.QuestionService;

public class AnswerServiceImpl implements AnswerService {
	
	private AnswerMapper answerMapper;
	
	private QuestionService questionService;
	
	public void addAnswer(Answer answer){
		answerMapper.addAnswer(answer);
	}

	public void buildAnswer(int qid) {
		Question question = questionService.getQuestionById(qid);
		Answer answer = new Answer();
		answer.setName(question.getName()+"_"+"×÷´ð");
		answer.setQuestion(question);
		answer.setRightNum(0);
		answer.setWrongNum(0);
		answer.setCreateDate(new Date());
		System.out.println("before:"+answer.getId());
		addAnswer(answer);
		System.out.println("after:"+answer.getId());
	}

	public AnswerMapper getAnswerMapper() {
		return answerMapper;
	}

	public void setAnswerMapper(AnswerMapper answerMapper) {
		this.answerMapper = answerMapper;
	}

	public QuestionService getQuestionService() {
		return questionService;
	}

	public void setQuestionService(QuestionService questionService) {
		this.questionService = questionService;
	}

}
