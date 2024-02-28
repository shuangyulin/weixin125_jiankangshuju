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


import com.dao.ZhishikepuDao;
import com.entity.ZhishikepuEntity;
import com.service.ZhishikepuService;
import com.entity.vo.ZhishikepuVO;
import com.entity.view.ZhishikepuView;

@Service("zhishikepuService")
public class ZhishikepuServiceImpl extends ServiceImpl<ZhishikepuDao, ZhishikepuEntity> implements ZhishikepuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhishikepuEntity> page = this.selectPage(
                new Query<ZhishikepuEntity>(params).getPage(),
                new EntityWrapper<ZhishikepuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhishikepuEntity> wrapper) {
		  Page<ZhishikepuView> page =new Query<ZhishikepuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhishikepuVO> selectListVO(Wrapper<ZhishikepuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhishikepuVO selectVO(Wrapper<ZhishikepuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhishikepuView> selectListView(Wrapper<ZhishikepuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhishikepuView selectView(Wrapper<ZhishikepuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
