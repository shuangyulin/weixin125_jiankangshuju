package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangjihuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangjihuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangjihuaView;


/**
 * 健康计划
 *
 * @author 
 * @email 
 * @date 2021-04-14 22:52:44
 */
public interface JiankangjihuaService extends IService<JiankangjihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangjihuaVO> selectListVO(Wrapper<JiankangjihuaEntity> wrapper);
   	
   	JiankangjihuaVO selectVO(@Param("ew") Wrapper<JiankangjihuaEntity> wrapper);
   	
   	List<JiankangjihuaView> selectListView(Wrapper<JiankangjihuaEntity> wrapper);
   	
   	JiankangjihuaView selectView(@Param("ew") Wrapper<JiankangjihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangjihuaEntity> wrapper);
   	
}

