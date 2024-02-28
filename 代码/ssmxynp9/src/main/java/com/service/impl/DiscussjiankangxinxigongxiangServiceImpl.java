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


import com.dao.DiscussjiankangxinxigongxiangDao;
import com.entity.DiscussjiankangxinxigongxiangEntity;
import com.service.DiscussjiankangxinxigongxiangService;
import com.entity.vo.DiscussjiankangxinxigongxiangVO;
import com.entity.view.DiscussjiankangxinxigongxiangView;

@Service("discussjiankangxinxigongxiangService")
public class DiscussjiankangxinxigongxiangServiceImpl extends ServiceImpl<DiscussjiankangxinxigongxiangDao, DiscussjiankangxinxigongxiangEntity> implements DiscussjiankangxinxigongxiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiankangxinxigongxiangEntity> page = this.selectPage(
                new Query<DiscussjiankangxinxigongxiangEntity>(params).getPage(),
                new EntityWrapper<DiscussjiankangxinxigongxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiankangxinxigongxiangEntity> wrapper) {
		  Page<DiscussjiankangxinxigongxiangView> page =new Query<DiscussjiankangxinxigongxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiankangxinxigongxiangVO> selectListVO(Wrapper<DiscussjiankangxinxigongxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiankangxinxigongxiangVO selectVO(Wrapper<DiscussjiankangxinxigongxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiankangxinxigongxiangView> selectListView(Wrapper<DiscussjiankangxinxigongxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiankangxinxigongxiangView selectView(Wrapper<DiscussjiankangxinxigongxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
