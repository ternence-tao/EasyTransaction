package com.yiqiniu.easytrans.idempotent.exception;

import com.yiqiniu.easytrans.filter.EasyTransResult;

public class ResultWrapperException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private EasyTransResult result;
	
	public ResultWrapperException(EasyTransResult result){
		this.result = result;
	}

	public EasyTransResult getResult() {
		return result;
	}
}
