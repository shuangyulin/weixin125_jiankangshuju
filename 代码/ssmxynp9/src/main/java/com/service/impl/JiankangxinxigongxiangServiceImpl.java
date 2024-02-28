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


import com.dao.JiankangxinxigongxiangDao;
import com.entity.JiankangxinxigongxiangEntity;
import com.service.JiankangxinxigongxiangService;
import com.entity.vo.JiankangxinxigongxiangVO;
import com.entity.view.JiankangxinxigongxiangView;

@Service("jiankangxinxigongxiangService")
public class JiankangxinxigongxiangServiceImpl extends ServiceImpl<JiankangxinxigongxiangDao, JiankangxinxigongxiangEntity> implements JiankangxinxigongxiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangxinxigongxiangEntity> page = this.selectPage(
                new Query<JiankangxinxigongxiangEntity>(params).getPage(),
                new EntityWrapper<JiankangxinxigongxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangxinxigongxiangEntity> wrapper) {
		  Page<JiankangxinxigongxiangView> page =new Query<JiankangxinxigongxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankangxinxigongxiangVO> selectListVO(Wrapper<JiankangxinxigongxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankangxinxigongxiangVO selectVO(Wrapper<JiankangxinxigongxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankangxinxigongxiangView> selectListView(Wrapper<JiankangxinxigongxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangxinxigongxiangView selectView(Wrapper<JiankangxinxigongxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
