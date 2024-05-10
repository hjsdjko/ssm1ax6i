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


import com.dao.GonggaoDao;
import com.entity.GonggaoEntity;
import com.service.GonggaoService;
import com.entity.vo.GonggaoVO;
import com.entity.view.GonggaoView;

@Service("gonggaoService")
public class GonggaoServiceImpl extends ServiceImpl<GonggaoDao, GonggaoEntity> implements GonggaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GonggaoEntity> page = this.selectPage(
                new Query<GonggaoEntity>(params).getPage(),
                new EntityWrapper<GonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GonggaoEntity> wrapper) {
		  Page<GonggaoView> page =new Query<GonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GonggaoVO> selectListVO(Wrapper<GonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GonggaoVO selectVO(Wrapper<GonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GonggaoView> selectListView(Wrapper<GonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GonggaoView selectView(Wrapper<GonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
