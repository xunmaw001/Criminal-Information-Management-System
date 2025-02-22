package com.entity.vo;

import com.entity.JiankangdengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 健康登记
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-07 15:52:14
 */
public class JiankangdengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 罪犯姓名
	 */
	
	private String zuifanxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private Integer nianling;
		
	/**
	 * 所在监区
	 */
	
	private String suozaijianqu;
		
	/**
	 * 体温登记
	 */
	
	private String tiwendengji;
		
	/**
	 * 既往病史
	 */
	
	private String jiwangbingshi;
		
	/**
	 * 近期状况
	 */
	
	private String jinqizhuangkuang;
		
	/**
	 * 保外就医
	 */
	
	private String baowaijiuyi;
		
	/**
	 * 是否请假
	 */
	
	private String shifouqingjia;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
		
	/**
	 * 民警账号
	 */
	
	private String minjingzhanghao;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：罪犯姓名
	 */
	 
	public void setZuifanxingming(String zuifanxingming) {
		this.zuifanxingming = zuifanxingming;
	}
	
	/**
	 * 获取：罪犯姓名
	 */
	public String getZuifanxingming() {
		return zuifanxingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：所在监区
	 */
	 
	public void setSuozaijianqu(String suozaijianqu) {
		this.suozaijianqu = suozaijianqu;
	}
	
	/**
	 * 获取：所在监区
	 */
	public String getSuozaijianqu() {
		return suozaijianqu;
	}
				
	
	/**
	 * 设置：体温登记
	 */
	 
	public void setTiwendengji(String tiwendengji) {
		this.tiwendengji = tiwendengji;
	}
	
	/**
	 * 获取：体温登记
	 */
	public String getTiwendengji() {
		return tiwendengji;
	}
				
	
	/**
	 * 设置：既往病史
	 */
	 
	public void setJiwangbingshi(String jiwangbingshi) {
		this.jiwangbingshi = jiwangbingshi;
	}
	
	/**
	 * 获取：既往病史
	 */
	public String getJiwangbingshi() {
		return jiwangbingshi;
	}
				
	
	/**
	 * 设置：近期状况
	 */
	 
	public void setJinqizhuangkuang(String jinqizhuangkuang) {
		this.jinqizhuangkuang = jinqizhuangkuang;
	}
	
	/**
	 * 获取：近期状况
	 */
	public String getJinqizhuangkuang() {
		return jinqizhuangkuang;
	}
				
	
	/**
	 * 设置：保外就医
	 */
	 
	public void setBaowaijiuyi(String baowaijiuyi) {
		this.baowaijiuyi = baowaijiuyi;
	}
	
	/**
	 * 获取：保外就医
	 */
	public String getBaowaijiuyi() {
		return baowaijiuyi;
	}
				
	
	/**
	 * 设置：是否请假
	 */
	 
	public void setShifouqingjia(String shifouqingjia) {
		this.shifouqingjia = shifouqingjia;
	}
	
	/**
	 * 获取：是否请假
	 */
	public String getShifouqingjia() {
		return shifouqingjia;
	}
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
				
	
	/**
	 * 设置：民警账号
	 */
	 
	public void setMinjingzhanghao(String minjingzhanghao) {
		this.minjingzhanghao = minjingzhanghao;
	}
	
	/**
	 * 获取：民警账号
	 */
	public String getMinjingzhanghao() {
		return minjingzhanghao;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
