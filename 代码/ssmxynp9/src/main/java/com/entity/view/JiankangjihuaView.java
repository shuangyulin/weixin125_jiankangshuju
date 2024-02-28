package com.entity.view;

import com.entity.JiankangjihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健康计划
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 22:52:44
 */
@TableName("jiankangjihua")
public class JiankangjihuaView  extends JiankangjihuaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiankangjihuaView(){
	}
 
 	public JiankangjihuaView(JiankangjihuaEntity jiankangjihuaEntity){
 	try {
			BeanUtils.copyProperties(this, jiankangjihuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
