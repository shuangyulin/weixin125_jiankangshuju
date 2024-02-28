package com.dao;

import com.entity.ShujufenxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShujufenxiVO;
import com.entity.view.ShujufenxiView;


/**
 * 数据分析
 * 
 * @author 
 * @email 
 * @date 2021-04-14 22:52:44
 */
public interface ShujufenxiDao extends BaseMapper<ShujufenxiEntity> {
	
	List<ShujufenxiVO> selectListVO(@Param("ew") Wrapper<ShujufenxiEntity> wrapper);
	
	ShujufenxiVO selectVO(@Param("ew") Wrapper<ShujufenxiEntity> wrapper);
	
	List<ShujufenxiView> selectListView(@Param("ew") Wrapper<ShujufenxiEntity> wrapper);

	List<ShujufenxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShujufenxiEntity> wrapper);
	
	ShujufenxiView selectView(@Param("ew") Wrapper<ShujufenxiEntity> wrapper);
	
}
