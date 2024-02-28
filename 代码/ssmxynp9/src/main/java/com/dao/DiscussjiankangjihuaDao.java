package com.dao;

import com.entity.DiscussjiankangjihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiankangjihuaVO;
import com.entity.view.DiscussjiankangjihuaView;


/**
 * 健康计划评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-14 22:52:44
 */
public interface DiscussjiankangjihuaDao extends BaseMapper<DiscussjiankangjihuaEntity> {
	
	List<DiscussjiankangjihuaVO> selectListVO(@Param("ew") Wrapper<DiscussjiankangjihuaEntity> wrapper);
	
	DiscussjiankangjihuaVO selectVO(@Param("ew") Wrapper<DiscussjiankangjihuaEntity> wrapper);
	
	List<DiscussjiankangjihuaView> selectListView(@Param("ew") Wrapper<DiscussjiankangjihuaEntity> wrapper);

	List<DiscussjiankangjihuaView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiankangjihuaEntity> wrapper);
	
	DiscussjiankangjihuaView selectView(@Param("ew") Wrapper<DiscussjiankangjihuaEntity> wrapper);
	
}
