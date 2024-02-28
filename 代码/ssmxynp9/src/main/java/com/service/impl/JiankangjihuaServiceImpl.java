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


import com.dao.JiankangjihuaDao;
import com.entity.JiankangjihuaEntity;
import com.service.JiankangjihuaService;
import com.entity.vo.JiankangjihuaVO;
import com.entity.view.JiankangjihuaView;

@Service("jiankangjihuaService")
public class JiankangjihuaServiceImpl extends ServiceImpl<JiankangjihuaDao, JiankangjihuaEntity> implements JiankangjihuaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangjihuaEntity> page = this.selectPage(
                new Query<JiankangjihuaEntity>(params).getPage(),
                new EntityWrapper<JiankangjihuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangjihuaEntity> wrapper) {
		  Page<JiankangjihuaView> page =new Query<JiankangjihuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankangjihuaVO> selectListVO(Wrapper<JiankangjihuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankangjihuaVO selectVO(Wrapper<JiankangjihuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankangjihuaView> selectListView(Wrapper<JiankangjihuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangjihuaView selectView(Wrapper<JiankangjihuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
