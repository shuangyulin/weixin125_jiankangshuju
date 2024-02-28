package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusszhishikepuDao;
import com.entity.DiscusszhishikepuEntity;
import com.service.DiscusszhishikepuService;
import com.entity.vo.DiscusszhishikepuVO;
import com.entity.view.DiscusszhishikepuView;

@Service("discusszhishikepuService")
public class DiscusszhishikepuServiceImpl extends ServiceImpl<DiscusszhishikepuDao, DiscusszhishikepuEntity> implements DiscusszhishikepuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhishikepuEntity> page = this.selectPage(
                new Query<DiscusszhishikepuEntity>(params).getPage(),
                new EntityWrapper<DiscusszhishikepuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhishikepuEntity> wrapper) {
		  Page<DiscusszhishikepuView> page =new Query<DiscusszhishikepuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhishikepuVO> selectListVO(Wrapper<DiscusszhishikepuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhishikepuVO selectVO(Wrapper<DiscusszhishikepuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhishikepuView> selectListView(Wrapper<DiscusszhishikepuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhishikepuView selectView(Wrapper<DiscusszhishikepuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
