package com.yu.answer.mapper;

import java.util.List;

import com.yu.answer.model.Sequence;

public interface SequenceMapper {
	List<Sequence> get();
	
	void update(Sequence seq);
	
	void insert(Sequence seq);
}
