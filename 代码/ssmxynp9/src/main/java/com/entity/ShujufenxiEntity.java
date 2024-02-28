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
 * 数据分析
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-14 22:52:44
 */
@TableName("shujufenxi")
public class ShujufenxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShujufenxiEntity() {
		
	}
	
	public ShujufenxiEntity(T t) {
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
	 * 编号
	 */
					
	private String bianhao;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 发布时间
	 */
					
	private String fabushijian;
	
	/**
	 * 分析结果
	 */
					
	private String fenxijieguo;
	
	/**
	 * 健康建议
	 */
					
	private String jiankangjianyi;
	
	/**
	 * 客观图像
	 */
					
	private String keguantuxiang;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
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
	 * 设置：编号
	 */
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	/**
	 * 获取：编号
	 */
	public String getBianhao() {
		return bianhao;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(String fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public String getFabushijian() {
		return fabushijian;
	}
	/**
	 * 设置：分析结果
	 */
	public void setFenxijieguo(String fenxijieguo) {
		this.fenxijieguo = fenxijieguo;
	}
	/**
	 * 获取：分析结果
	 */
	public String getFenxijieguo() {
		return fenxijieguo;
	}
	/**
	 * 设置：健康建议
	 */
	public void setJiankangjianyi(String jiankangjianyi) {
		this.jiankangjianyi = jiankangjianyi;
	}
	/**
	 * 获取：健康建议
	 */
	public String getJiankangjianyi() {
		return jiankangjianyi;
	}
	/**
	 * 设置：客观图像
	 */
	public void setKeguantuxiang(String keguantuxiang) {
		this.keguantuxiang = keguantuxiang;
	}
	/**
	 * 获取：客观图像
	 */
	public String getKeguantuxiang() {
		return keguantuxiang;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
