package com.yu.base;

import java.util.List;

import com.yu.answer.fo.AnswerFo;
import com.yu.answer.model.Answer;
import com.yu.answer.model.AnswerItem;
import com.yu.base.context.Context;

public class AnswerContext implements Context {
	private static AnswerFo answerFo = new AnswerFo();
	
	private static int currentIndex = 0;
	
	private static boolean isFirst;
	
	private static boolean isEnd;
	
	public static int getCurrentIndex(){
		return currentIndex;
	}
	
	public static void set(AnswerFo fo){
		answerFo = fo;
	}
	
	public static AnswerItem first(){
		currentIndex = 0;
		isFirst = true;
		List<AnswerItem> items = getAnswerItems();
		return items.get(0);
	}
	
	public static AnswerItem next(){
		List<AnswerItem> items = getAnswerItems();
		AnswerItem item = null;
		if(currentIndex < 0){
			currentIndex = 0;
			item = items.get(++currentIndex);
		}else if(currentIndex >= items.size()-1){
			isEnd = true;
			currentIndex = items.size() - 1;
			item = items.get(currentIndex);
		}else{
			item = items.get(++currentIndex);
		}
		return item;
	}
	
	public static AnswerItem prev(){
		List<AnswerItem> items = getAnswerItems();
		AnswerItem item = null;
		if(currentIndex <= 0){
			isFirst = true;
			currentIndex = 0;
			item = items.get(currentIndex);
		}else if(currentIndex > items.size()-1){
			currentIndex = items.size() - 1;
			item = items.get(currentIndex);
		}else{
			item = items.get(--currentIndex);
		}
		buildPosition();
		return item;
	}
	
	public static AnswerItem index(int i){
		List<AnswerItem> items = getAnswerItems();
		AnswerItem item = null;
		if(i <= 0){
			currentIndex = 0;
			item = items.get(currentIndex);
		}else if(i > items.size() - 1){
			currentIndex = items.size() - 1;
			item = items.get(currentIndex);
		}else{
			currentIndex = i;
			item = items.get(currentIndex);
		}
		
		buildPosition();
		return item;
	}
	
	private static void buildPosition(){
		if(currentIndex <= 0){
			isFirst = true;
		}else{
			isFirst = false;
		}
		if(currentIndex >= getAnswerItems().size() - 1){
			isEnd = true;
		}else{
			isEnd = false;
		}
	}
	
	private static List<AnswerItem> getAnswerItems(){
		return answerFo.getAnswerItems();
	}
	
	public static Answer getAnswer(){
		return answerFo.getAnswer();
	}

	public static boolean isFirst() {
		return isFirst;
	}

	public static boolean isEnd() {
		return isEnd;
	}
}
