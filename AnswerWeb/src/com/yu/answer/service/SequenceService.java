package com.yu.answer.service;

import com.yu.answer.model.Sequence;


public interface SequenceService {
	
	int get();
	
	void update(Sequence seq);
	
	void insert(Sequence seq);
}
