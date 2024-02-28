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


import com.dao.ShujufenxiDao;
import com.entity.ShujufenxiEntity;
import com.service.ShujufenxiService;
import com.entity.vo.ShujufenxiVO;
import com.entity.view.ShujufenxiView;

@Service("shujufenxiService")
public class ShujufenxiServiceImpl extends ServiceImpl<ShujufenxiDao, ShujufenxiEntity> implements ShujufenxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShujufenxiEntity> page = this.selectPage(
                new Query<ShujufenxiEntity>(params).getPage(),
                new EntityWrapper<ShujufenxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShujufenxiEntity> wrapper) {
		  Page<ShujufenxiView> page =new Query<ShujufenxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShujufenxiVO> selectListVO(Wrapper<ShujufenxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShujufenxiVO selectVO(Wrapper<ShujufenxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShujufenxiView> selectListView(Wrapper<ShujufenxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShujufenxiView selectView(Wrapper<ShujufenxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
