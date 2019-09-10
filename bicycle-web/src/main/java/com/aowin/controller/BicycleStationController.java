package com.aowin.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aowin.model.BicycleAccount;
import com.aowin.model.BicycleInfo;
import com.aowin.model.BicycleStation;
import com.aowin.service.IBicycleDispatchService;
import com.aowin.service.IBicycleStationService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/main")
public class BicycleStationController {
	
	@Autowired
	public IBicycleStationService bicycleStationService;
	
	@Autowired
	public IBicycleDispatchService bicycleDispatchServiceImpl;
	
	/**
	 * 查询车点
	 * @param pageNum
	 * @param station
	 * @return
	 */
	@RequestMapping("/select")
	public PageInfo<BicycleStation> select(@RequestParam(defaultValue = "1") int pageNum,BicycleStation station){
		try {
			return bicycleStationService.select(pageNum, station);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@RequestMapping("/showPile")
	public BicycleStation detailForUpdate(int stationId) {
		try {
			
			BicycleStation station= bicycleStationService.showPile(stationId);
			return station;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 车辆调出
	 * @param ba
	 * @return
	 */
	@RequestMapping("/from")
	public String from(@RequestBody BicycleAccount ba) {
		try {
			bicycleDispatchServiceImpl.from(ba);
			return"success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 显示车辆详情
	 * @return
	 */
	@RequestMapping("/showInfo")
	public List<BicycleInfo> showInfo(){
		try {
			return bicycleDispatchServiceImpl.select();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 车辆调入
	 * @param bicycleId
	 * @param pileId
	 * @param cardCode
	 * @return
	 */
	@RequestMapping("/saveInfo")
	public String to(@RequestBody BicycleAccount ba) {
		try {
			bicycleDispatchServiceImpl.to(ba);
			return"success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	

}
