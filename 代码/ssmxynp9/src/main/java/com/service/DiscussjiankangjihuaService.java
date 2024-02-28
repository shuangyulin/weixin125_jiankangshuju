package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiankangjihuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiankangjihuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiankangjihuaView;


/**
 * 健康计划评论表
 *
 * @author 
 * @email 
 * @date 2021-04-14 22:52:44
 */
public interface DiscussjiankangjihuaService extends IService<DiscussjiankangjihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiankangjihuaVO> selectListVO(Wrapper<DiscussjiankangjihuaEntity> wrapper);
   	
   	DiscussjiankangjihuaVO selectVO(@Param("ew") Wrapper<DiscussjiankangjihuaEntity> wrapper);
   	
   	List<DiscussjiankangjihuaView> selectListView(Wrapper<DiscussjiankangjihuaEntity> wrapper);
   	
   	DiscussjiankangjihuaView selectView(@Param("ew") Wrapper<DiscussjiankangjihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiankangjihuaEntity> wrapper);
   	
}

