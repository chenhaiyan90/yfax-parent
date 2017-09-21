package com.yfax.webapi.ytt.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yfax.webapi.ytt.dao.RateSetDao;
import com.yfax.webapi.ytt.vo.RateSetVo;

/**
 * 汇率配置数据
 * @author Minbo
 */
@Service
public class RateSetService{
	
	protected static Logger logger = LoggerFactory.getLogger(RateSetService.class);
	
	@Autowired
	private RateSetDao dao;
	
	public RateSetVo selectRateSet() {
		return this.dao.selectRateSet();
	}

}
