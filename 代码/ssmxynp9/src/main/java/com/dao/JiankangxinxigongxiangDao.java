package com.dao;

import com.entity.JiankangxinxigongxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangxinxigongxiangVO;
import com.entity.view.JiankangxinxigongxiangView;


/**
 * 健康信息共享
 * 
 * @author 
 * @email 
 * @date 2021-04-14 22:52:44
 */
public interface JiankangxinxigongxiangDao extends BaseMapper<JiankangxinxigongxiangEntity> {
	
	List<JiankangxinxigongxiangVO> selectListVO(@Param("ew") Wrapper<JiankangxinxigongxiangEntity> wrapper);
	
	JiankangxinxigongxiangVO selectVO(@Param("ew") Wrapper<JiankangxinxigongxiangEntity> wrapper);
	
	List<JiankangxinxigongxiangView> selectListView(@Param("ew") Wrapper<JiankangxinxigongxiangEntity> wrapper);

	List<JiankangxinxigongxiangView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangxinxigongxiangEntity> wrapper);
	
	JiankangxinxigongxiangView selectView(@Param("ew") Wrapper<JiankangxinxigongxiangEntity> wrapper);
	
}
