package com.dao;

import com.entity.ZhishikepuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhishikepuVO;
import com.entity.view.ZhishikepuView;


/**
 * 知识科普
 * 
 * @author 
 * @email 
 * @date 2021-04-14 22:52:44
 */
public interface ZhishikepuDao extends BaseMapper<ZhishikepuEntity> {
	
	List<ZhishikepuVO> selectListVO(@Param("ew") Wrapper<ZhishikepuEntity> wrapper);
	
	ZhishikepuVO selectVO(@Param("ew") Wrapper<ZhishikepuEntity> wrapper);
	
	List<ZhishikepuView> selectListView(@Param("ew") Wrapper<ZhishikepuEntity> wrapper);

	List<ZhishikepuView> selectListView(Pagination page,@Param("ew") Wrapper<ZhishikepuEntity> wrapper);
	
	ZhishikepuView selectView(@Param("ew") Wrapper<ZhishikepuEntity> wrapper);
	
}
