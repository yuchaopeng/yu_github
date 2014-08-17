package com.yu.answer.service.impl;

import java.util.List;

import com.yu.answer.mapper.SequenceMapper;
import com.yu.answer.model.Sequence;
import com.yu.answer.service.SequenceService;

public class SequenceServiceImpl implements SequenceService {
	
	private SequenceMapper sequenceMapper;

	public int get() {
		List<Sequence> seqs = sequenceMapper.get();
		int resultVal = 0;
		Sequence seq = null;
		if(seqs == null || seqs.size() == 0){
			seq = new Sequence();
			seq.setVal(1);
			insert(seq);
		}else{
			seq = seqs.get(0);
			resultVal = seq.getVal();
			seq.setVal(++resultVal);
			update(seq);
		}
		return resultVal;
	}
	
	public void update(Sequence seq){
		sequenceMapper.update(seq);
	}
	
	public void insert(Sequence seq){
		sequenceMapper.insert(seq);
	}

	public SequenceMapper getSequenceMapper() {
		return sequenceMapper;
	}

	public void setSequenceMapper(SequenceMapper sequenceMapper) {
		this.sequenceMapper = sequenceMapper;
	}
	
	
}
