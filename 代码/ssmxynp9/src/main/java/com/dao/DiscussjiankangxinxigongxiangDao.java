package com.dao;

import com.entity.DiscussjiankangxinxigongxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiankangxinxigongxiangVO;
import com.entity.view.DiscussjiankangxinxigongxiangView;


/**
 * 健康信息共享评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-14 22:52:44
 */
public interface DiscussjiankangxinxigongxiangDao extends BaseMapper<DiscussjiankangxinxigongxiangEntity> {
	
	List<DiscussjiankangxinxigongxiangVO> selectListVO(@Param("ew") Wrapper<DiscussjiankangxinxigongxiangEntity> wrapper);
	
	DiscussjiankangxinxigongxiangVO selectVO(@Param("ew") Wrapper<DiscussjiankangxinxigongxiangEntity> wrapper);
	
	List<DiscussjiankangxinxigongxiangView> selectListView(@Param("ew") Wrapper<DiscussjiankangxinxigongxiangEntity> wrapper);

	List<DiscussjiankangxinxigongxiangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiankangxinxigongxiangEntity> wrapper);
	
	DiscussjiankangxinxigongxiangView selectView(@Param("ew") Wrapper<DiscussjiankangxinxigongxiangEntity> wrapper);
	
}
