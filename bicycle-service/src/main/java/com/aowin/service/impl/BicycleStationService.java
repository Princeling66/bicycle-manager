package com.aowin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aowin.constants.PageConfig;
import com.aowin.dao.BicycleStationMapper;
import com.aowin.model.BicycleStation;
import com.aowin.service.IBicycleStationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class BicycleStationService implements IBicycleStationService{
	
	@Autowired
	private BicycleStationMapper bicycleStationMapper;
	
	@Override
	public PageInfo<BicycleStation> select(int pageNum, BicycleStation station) throws Exception{
		PageHelper.startPage(pageNum, PageConfig.PAGE_SIZE);
		List<BicycleStation> stations = bicycleStationMapper.select(station);
		return new PageInfo<BicycleStation>(stations);
		
	}

	@Override
	public BicycleStation showPile(int stationId)throws Exception {
		return bicycleStationMapper.detailForUpdate(stationId);
	}



	
}
