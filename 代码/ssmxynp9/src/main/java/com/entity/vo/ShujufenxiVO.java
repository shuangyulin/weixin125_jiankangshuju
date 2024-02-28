package com.entity.vo;

import com.entity.ShujufenxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 数据分析
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-14 22:52:44
 */
public class ShujufenxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
