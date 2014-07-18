package com.yu.answer.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yu.answer.model.Question;
import com.yu.answer.model.QuestionItem;
import com.yu.answer.service.QuestionService;

@Controller
@RequestMapping(value = "/question")
public class QuestionController {
	@Autowired
    @Qualifier("questionService")
	private QuestionService questionService;
	
	@RequestMapping(value="/query",method=RequestMethod.GET)
	public String query(Model model){
		List<Question> questions = questionService.queryQuestion(null);
		model.addAttribute("questions", questions);
		return "questions";
	}
	
	@RequestMapping(value="/{qid}",method=RequestMethod.GET)
	public String getQuestionList(@PathVariable(value="qid") int qid,Model model){
		List<QuestionItem> questionItems = questionService.getQuestionList(qid);
		model.addAttribute("questionItems", questionItems);
		return "questionItems";
	}

	public void setQuestionService(QuestionService questionService) {
		this.questionService = questionService;
	}
	
}
