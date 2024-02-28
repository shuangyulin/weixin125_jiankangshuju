package com.entity.view;

import com.entity.DiscussjiankangxinxigongxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健康信息共享评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 22:52:44
 */
@TableName("discussjiankangxinxigongxiang")
public class DiscussjiankangxinxigongxiangView  extends DiscussjiankangxinxigongxiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiankangxinxigongxiangView(){
	}
 
 	public DiscussjiankangxinxigongxiangView(DiscussjiankangxinxigongxiangEntity discussjiankangxinxigongxiangEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiankangxinxigongxiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
