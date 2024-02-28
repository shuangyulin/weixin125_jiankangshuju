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


import com.dao.DiscussjiankangjihuaDao;
import com.entity.DiscussjiankangjihuaEntity;
import com.service.DiscussjiankangjihuaService;
import com.entity.vo.DiscussjiankangjihuaVO;
import com.entity.view.DiscussjiankangjihuaView;

@Service("discussjiankangjihuaService")
public class DiscussjiankangjihuaServiceImpl extends ServiceImpl<DiscussjiankangjihuaDao, DiscussjiankangjihuaEntity> implements DiscussjiankangjihuaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiankangjihuaEntity> page = this.selectPage(
                new Query<DiscussjiankangjihuaEntity>(params).getPage(),
                new EntityWrapper<DiscussjiankangjihuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiankangjihuaEntity> wrapper) {
		  Page<DiscussjiankangjihuaView> page =new Query<DiscussjiankangjihuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiankangjihuaVO> selectListVO(Wrapper<DiscussjiankangjihuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiankangjihuaVO selectVO(Wrapper<DiscussjiankangjihuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiankangjihuaView> selectListView(Wrapper<DiscussjiankangjihuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiankangjihuaView selectView(Wrapper<DiscussjiankangjihuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
