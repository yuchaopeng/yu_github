package com.yu.answer.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yu.answer.fo.AnswerFo;
import com.yu.answer.fo.AnswerResultSubmit;
import com.yu.answer.model.Answer;
import com.yu.answer.model.AnswerItem;
import com.yu.answer.service.AnswerService;
import com.yu.base.AnswerContext;

@Controller
@RequestMapping(value = "/answer")
public class AnswerController {
	
	@Autowired
    @Qualifier("answerService")
	private AnswerService answerService;
	
	@RequestMapping(value="/init",method=RequestMethod.GET)
	public String query(Model model){
		Answer answer = answerService.buildAnswer(1);
		List<AnswerItem> answerItems = answerService.buildAnswerItem(answer);
		AnswerFo answerFo = new AnswerFo();
		answerFo.setAnswer(answer);
		answerFo.setAnswerItems(answerItems);
		AnswerContext.set(answerFo);
		
		AnswerItem answerItem = AnswerContext.first();
		model.addAttribute("answer", answer);
		model.addAttribute("answerItem", answerItem);
		model.addAttribute("currentIndex", AnswerContext.getCurrentIndex());
		return "answer";
	}
	
	@RequestMapping(value="/{type}",method=RequestMethod.POST)
	public String jump(@PathVariable(value="type") String type,Model model,@ModelAttribute("result") AnswerResultSubmit result){
		boolean flag = answerService.submitResult(result);
		Answer answer = AnswerContext.getAnswer();
		AnswerItem answerItem = null;
		if(flag){
			if("prev".equals(type)){
				answerItem = AnswerContext.prev();
			}else if("next".equals(type)){
				answerItem = AnswerContext.next();
			}
		}else{
			model.addAttribute("returnMsg","系统错误，请联系管理员");
		}
		model.addAttribute("answer",answer);
		model.addAttribute("answerItem", answerItem);
		model.addAttribute("currentIndex", AnswerContext.getCurrentIndex());
		
		return "answer";
	}
	@RequestMapping(value="/result",method=RequestMethod.POST)
	public String getResult(AnswerResultSubmit result){
		String answerId = result.getAnswerId();
		return null;
	}
	
	public AnswerService getAnswerService() {
		return answerService;
	}

	public void setAnswerService(AnswerService answerService) {
		this.answerService = answerService;
	}
	
	
}
