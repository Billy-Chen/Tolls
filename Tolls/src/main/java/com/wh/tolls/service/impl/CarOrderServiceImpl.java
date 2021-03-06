package com.wh.tolls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wh.tolls.dao.carorderMapper;
import com.wh.tolls.entity.carorder;
import com.wh.tolls.service.CarOrderService;
@Service
public class CarOrderServiceImpl implements CarOrderService{

	@Autowired
	private carorderMapper carorderMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer orderId) {
		// TODO Auto-generated method stub
		return carorderMapper.deleteByPrimaryKey(orderId);
	}

	@Override
	public int insert(carorder record) {
		// TODO Auto-generated method stub
		return carorderMapper.insert(record);
	}

	@Override
	public int insertSelective(carorder record) {
		// TODO Auto-generated method stub
		return carorderMapper.insertSelective(record);
	}

	@Override
	public carorder selectByPrimaryKey(Integer orderId) {
		// TODO Auto-generated method stub
		return carorderMapper.selectByPrimaryKey(orderId);
	}

	@Override
	public int updateByPrimaryKeySelective(carorder record) {
		// TODO Auto-generated method stub
		return carorderMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(carorder record) {
		// TODO Auto-generated method stub
		return carorderMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<carorder> selectAll() {
		// TODO Auto-generated method stub
		return carorderMapper.selectAll();
	}

}
