package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhishikepuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhishikepuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhishikepuView;


/**
 * 知识科普评论表
 *
 * @author 
 * @email 
 * @date 2021-04-14 22:52:44
 */
public interface DiscusszhishikepuService extends IService<DiscusszhishikepuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhishikepuVO> selectListVO(Wrapper<DiscusszhishikepuEntity> wrapper);
   	
   	DiscusszhishikepuVO selectVO(@Param("ew") Wrapper<DiscusszhishikepuEntity> wrapper);
   	
   	List<DiscusszhishikepuView> selectListView(Wrapper<DiscusszhishikepuEntity> wrapper);
   	
   	DiscusszhishikepuView selectView(@Param("ew") Wrapper<DiscusszhishikepuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhishikepuEntity> wrapper);
   	
}

