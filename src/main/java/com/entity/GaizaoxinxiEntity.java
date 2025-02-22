package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 改造信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-07 15:52:14
 */
@TableName("gaizaoxinxi")
public class GaizaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GaizaoxinxiEntity() {
		
	}
	
	public GaizaoxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 罪犯编号
	 */
					
	private String zuifanbianhao;
	
	/**
	 * 罪犯姓名
	 */
					
	private String zuifanxingming;
	
	/**
	 * 犯罪类型
	 */
					
	private String fanzuileixing;
	
	/**
	 * 所在监区
	 */
					
	private String suozaijianqu;
	
	/**
	 * 改造目标
	 */
					
	private String gaizaomubiao;
	
	/**
	 * 改造计划
	 */
					
	private String gaizaojihua;
	
	/**
	 * 改造内容
	 */
					
	private String gaizaoneirong;
	
	/**
	 * 实行时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shixingshijian;
	
	/**
	 * 结束时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jieshushijian;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：罪犯编号
	 */
	public void setZuifanbianhao(String zuifanbianhao) {
		this.zuifanbianhao = zuifanbianhao;
	}
	/**
	 * 获取：罪犯编号
	 */
	public String getZuifanbianhao() {
		return zuifanbianhao;
	}
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
	 * 设置：犯罪类型
	 */
	public void setFanzuileixing(String fanzuileixing) {
		this.fanzuileixing = fanzuileixing;
	}
	/**
	 * 获取：犯罪类型
	 */
	public String getFanzuileixing() {
		return fanzuileixing;
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
	 * 设置：改造目标
	 */
	public void setGaizaomubiao(String gaizaomubiao) {
		this.gaizaomubiao = gaizaomubiao;
	}
	/**
	 * 获取：改造目标
	 */
	public String getGaizaomubiao() {
		return gaizaomubiao;
	}
	/**
	 * 设置：改造计划
	 */
	public void setGaizaojihua(String gaizaojihua) {
		this.gaizaojihua = gaizaojihua;
	}
	/**
	 * 获取：改造计划
	 */
	public String getGaizaojihua() {
		return gaizaojihua;
	}
	/**
	 * 设置：改造内容
	 */
	public void setGaizaoneirong(String gaizaoneirong) {
		this.gaizaoneirong = gaizaoneirong;
	}
	/**
	 * 获取：改造内容
	 */
	public String getGaizaoneirong() {
		return gaizaoneirong;
	}
	/**
	 * 设置：实行时间
	 */
	public void setShixingshijian(Date shixingshijian) {
		this.shixingshijian = shixingshijian;
	}
	/**
	 * 获取：实行时间
	 */
	public Date getShixingshijian() {
		return shixingshijian;
	}
	/**
	 * 设置：结束时间
	 */
	public void setJieshushijian(Date jieshushijian) {
		this.jieshushijian = jieshushijian;
	}
	/**
	 * 获取：结束时间
	 */
	public Date getJieshushijian() {
		return jieshushijian;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
