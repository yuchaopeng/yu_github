package com.yu.answer.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.yu.answer.fo.AnswerResultSubmit;
import com.yu.answer.mapper.AnswerMapper;
import com.yu.answer.model.Answer;
import com.yu.answer.model.AnswerItem;
import com.yu.answer.model.Question;
import com.yu.answer.model.QuestionItem;
import com.yu.answer.service.AnswerService;
import com.yu.answer.service.QuestionService;
import com.yu.answer.service.SequenceService;

public class AnswerServiceImpl implements AnswerService {
	
	private AnswerMapper answerMapper;
	
	private QuestionService questionService;
	
	private SequenceService sequenceService;
	
	public void addAnswer(Answer answer){
		answerMapper.addAnswer(answer);
	}
	
	public void updateAnswerItem(AnswerResultSubmit result) {
		answerMapper.updateAnswerItem(result);
	}
	
	public void addAnswerItem(AnswerItem item){
		answerMapper.addAnswerItem(item);
	}
	

	public Answer buildAnswer(int qid) {
		Question question = questionService.getQuestionById(qid);
		Answer answer = new Answer();
		int id = sequenceService.get();
		answer.setId(id);
		answer.setName(question.getName()+"_"+"×÷´ð");
		answer.setQuestion(question);
		answer.setRightNum(0);
		answer.setWrongNum(0);
		answer.setCreateDate(new Date());
		addAnswer(answer);
		
		return answer;
	}
	
	public List<AnswerItem> buildAnswerItem(Answer answer){
		List<QuestionItem> questionItems = questionService.getQuestionList(answer.getQuestion().getId());
		List<AnswerItem> answerItems = new ArrayList<AnswerItem>();
		for(QuestionItem item : questionItems){
			AnswerItem answerItem = new AnswerItem();
			int id = sequenceService.get();
			answerItem.setId(id);
			answerItem.setAnswer(answer);
			answerItem.setQuestionItem(item);
			addAnswerItem(answerItem);
			
			answerItems.add(answerItem);
		}
		return answerItems;
	}
	
	public boolean submitResult(AnswerResultSubmit result) {
		boolean flag = true;
		try {
			answerMapper.updateAnswerItem(result);
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
		}
		return flag;
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

	public SequenceService getSequenceService() {
		return sequenceService;
	}

	public void setSequenceService(SequenceService sequenceService) {
		this.sequenceService = sequenceService;
	}

}
