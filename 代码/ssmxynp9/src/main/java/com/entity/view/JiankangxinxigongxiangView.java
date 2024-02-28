package com.entity.view;

import com.entity.JiankangxinxigongxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健康信息共享
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 22:52:44
 */
@TableName("jiankangxinxigongxiang")
public class JiankangxinxigongxiangView  extends JiankangxinxigongxiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiankangxinxigongxiangView(){
	}
 
 	public JiankangxinxigongxiangView(JiankangxinxigongxiangEntity jiankangxinxigongxiangEntity){
 	try {
			BeanUtils.copyProperties(this, jiankangxinxigongxiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
