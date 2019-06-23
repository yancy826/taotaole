package com.taotaole.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.taotaole.db.DButil;
import com.taotaole.model.Trade;
/**
 *
 * 为Trade类提供增删改查方法
 * @author 刘畅
 * @version 2019/5/24
 *
 */
public class TradeService {
	/**
	 *
	 * @param trade 商品
	 * @author liuc144
	 * @exception Exception 抛出异常
	 */
	public void addTrade(Trade trade) throws Exception {
		Connection conn = DButil.getConnection();
		String sql ="insert into trade"+ 
					"(bookName,sellerName,buyerName,amount,time)"+
					"value(?,?,?,?,current_date())";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1, trade.getBookName());
		ptmt.setString(2, trade.getSellerName());
		ptmt.setString(3, trade.getBuyerName());
		ptmt.setDouble(4, trade.getAmount());
		ptmt.execute();
	}
	/**
	 *
	 * @param buyerName 购买者用户名
 	 * @return 返回商人集合
	 * @author liuc144
	 * @exception Exception 抛出异常
	 */
	public List<Trade> serchTrade(String buyerName) throws Exception{
		Connection conn = DButil.getConnection();
		StringBuilder sb =new StringBuilder();
		sb.append("select * from trade");
		sb.append(" where buyername = ?");
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		ptmt.setString(1,buyerName);
		ResultSet rs = ptmt.executeQuery();
		
		List<Trade> trades=new ArrayList<Trade>();
		Trade trade=null;
		while(rs.next()){
			trade = new Trade();
			trade.setId(rs.getInt("id"));
			trade.setBuyerName(rs.getString("buyerName"));
			trade.setSellerName(rs.getString("SellerName"));
			trade.setAmount(rs.getDouble("amount"));
			trade.setBookName(rs.getString("bookName"));
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date d = sdf.parse(rs.getDate("time").toString());
			trade.setTime(d);
			trades.add(trade) ;
		}
		return trades;
	}
	/**
	 *
	 * @param id 用户id
	 * @author liuc144
	 * @exception Exception 抛出异常
	 */
	public void deleteTrade(int id) throws Exception {
		Connection conn = DButil.getConnection();
		String sql = "delete from trade where id = ?";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setInt(1, id);
		ptmt.execute();
	}
}
