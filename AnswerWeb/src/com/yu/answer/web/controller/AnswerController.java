package com.yu.answer.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yu.answer.service.AnswerService;

@Controller
@RequestMapping(value = "/answer")
public class AnswerController {
	
	@Autowired
    @Qualifier("answerService")
	private AnswerService answerService;
	
	@RequestMapping(value="/init",method=RequestMethod.GET)
	public String query(Model model){
		answerService.buildAnswer(1);
		return "questions";
	}

	public AnswerService getAnswerService() {
		return answerService;
	}

	public void setAnswerService(AnswerService answerService) {
		this.answerService = answerService;
	}
	
	
}
