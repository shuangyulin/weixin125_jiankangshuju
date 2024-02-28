package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangxinxigongxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangxinxigongxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangxinxigongxiangView;


/**
 * 健康信息共享
 *
 * @author 
 * @email 
 * @date 2021-04-14 22:52:44
 */
public interface JiankangxinxigongxiangService extends IService<JiankangxinxigongxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangxinxigongxiangVO> selectListVO(Wrapper<JiankangxinxigongxiangEntity> wrapper);
   	
   	JiankangxinxigongxiangVO selectVO(@Param("ew") Wrapper<JiankangxinxigongxiangEntity> wrapper);
   	
   	List<JiankangxinxigongxiangView> selectListView(Wrapper<JiankangxinxigongxiangEntity> wrapper);
   	
   	JiankangxinxigongxiangView selectView(@Param("ew") Wrapper<JiankangxinxigongxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangxinxigongxiangEntity> wrapper);
   	
}

