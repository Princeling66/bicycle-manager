package com.aowin.controller;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aowin.model.Card;
import com.aowin.model.CardAccount;
import com.aowin.model.CardInfoRecord;
import com.aowin.model.CardMoney;
import com.aowin.model.CardRecord;
import com.aowin.model.SingleCard;
import com.aowin.model.Syuser;
import com.aowin.model.Time;
import com.aowin.model.YearCard;
import com.aowin.service.ICardService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/main")
public class CardController {
	@Autowired
	private ICardService cardServiceImpl;
	/**
	 * 显示卡片页面
	 * @param pageNum
	 * @param card
	 * @return
	 */
	
	@RequestMapping("/showCard")
	public PageInfo<Card> select(@RequestParam(defaultValue = "1") int pageNum,Card card){
				try {
			return cardServiceImpl.select(pageNum, card);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 新增卡片
	 * @param card
	 * @param session
	 * @return
	 */
	@RequestMapping("/addCard")
	public String addCard(@RequestBody Card card,HttpSession session) {
	Syuser	user = (Syuser) session.getAttribute("syuser");
		try {
			cardServiceImpl.insert(card, user.getUserId());
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 修改卡片
	 * @param card
	 * @return
	 */
	@RequestMapping("/updCard")
	public String update(@RequestBody Card card) {
		try {
			cardServiceImpl.update(card);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@RequestMapping("/updatePage")
	public Card showUpd(String 	cardCode) {
		try {
			return cardServiceImpl.showUpd(cardCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 注销卡片
	 * @param cardCode
	 * @param record
	 * @param session
	 * @return
	 */
	@RequestMapping("/delCard")
	public String delCard(String cardCode,CardRecord record,HttpSession session) {
		Syuser	user = (Syuser) session.getAttribute("syuser");
		try {
			cardServiceImpl.del(cardCode, record, user.getUserId());
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 挂失卡片
	 * @param card
	 * @param session
	 * @return
	 */
	@RequestMapping("/repCard")
	public String repCard(@RequestBody Card card,HttpSession session) {
		Syuser	user = (Syuser) session.getAttribute("syuser");
		try {
			cardServiceImpl.repCard(card, user.getUserId());
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	/**
	 * 充值卡片 
	 * @param ca
	 * @param cardId
	 * @param session
	 * @return
	 */
	@RequestMapping("/recCard")
	public String recCard(CardAccount ca,int cardId,HttpSession session) {
		Syuser	user = (Syuser) session.getAttribute("syuser");
		try {
			cardServiceImpl.recCard(ca, cardId, user.getUserId());
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 显示卡费用流水
	 * @param cardId
	 * @return
	 */
	@RequestMapping("/showCardRecode")
	public List<CardRecord> showCardRecode(int cardId) {
		try {
			return cardServiceImpl.showCardRecode(cardId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 统计所有卡
	 * @return
	 */
	@RequestMapping("/showDetails")
	public CardMoney staCard() {
		try {
			return cardServiceImpl.staCard();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 统计单张卡
	 * @param cardId
	 * @return
	 */
	@RequestMapping("/showSingleCard")
	public SingleCard SingleCard(int cardId) {
		try {
			return cardServiceImpl.singleCard(cardId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 统计月度内，年度内所有的租车卡
	 * @param tm
	 * @return
	 */
	@RequestMapping("/showYear")
	public YearCard getYMCard(Time tm) {
		return cardServiceImpl.getYearCard(tm);
	}
	/**
	 * 统计月度内，年度内单张租车卡
	 * @param tm
	 * @return
	 */
	@RequestMapping("/showYearSingleCard")
	public YearCard getYearSingleCard(Time tm){
		return cardServiceImpl.getYearSingleCard(tm);
	}
	
	
}
