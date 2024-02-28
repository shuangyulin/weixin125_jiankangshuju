package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiankangxinxigongxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiankangxinxigongxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiankangxinxigongxiangView;


/**
 * 健康信息共享评论表
 *
 * @author 
 * @email 
 * @date 2021-04-14 22:52:44
 */
public interface DiscussjiankangxinxigongxiangService extends IService<DiscussjiankangxinxigongxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiankangxinxigongxiangVO> selectListVO(Wrapper<DiscussjiankangxinxigongxiangEntity> wrapper);
   	
   	DiscussjiankangxinxigongxiangVO selectVO(@Param("ew") Wrapper<DiscussjiankangxinxigongxiangEntity> wrapper);
   	
   	List<DiscussjiankangxinxigongxiangView> selectListView(Wrapper<DiscussjiankangxinxigongxiangEntity> wrapper);
   	
   	DiscussjiankangxinxigongxiangView selectView(@Param("ew") Wrapper<DiscussjiankangxinxigongxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiankangxinxigongxiangEntity> wrapper);
   	
}

