package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhishikepuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhishikepuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhishikepuView;


/**
 * 知识科普
 *
 * @author 
 * @email 
 * @date 2021-04-14 22:52:44
 */
public interface ZhishikepuService extends IService<ZhishikepuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhishikepuVO> selectListVO(Wrapper<ZhishikepuEntity> wrapper);
   	
   	ZhishikepuVO selectVO(@Param("ew") Wrapper<ZhishikepuEntity> wrapper);
   	
   	List<ZhishikepuView> selectListView(Wrapper<ZhishikepuEntity> wrapper);
   	
   	ZhishikepuView selectView(@Param("ew") Wrapper<ZhishikepuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhishikepuEntity> wrapper);
   	
}

