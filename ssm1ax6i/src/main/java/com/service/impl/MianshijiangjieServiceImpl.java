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


import com.dao.MianshijiangjieDao;
import com.entity.MianshijiangjieEntity;
import com.service.MianshijiangjieService;
import com.entity.vo.MianshijiangjieVO;
import com.entity.view.MianshijiangjieView;

@Service("mianshijiangjieService")
public class MianshijiangjieServiceImpl extends ServiceImpl<MianshijiangjieDao, MianshijiangjieEntity> implements MianshijiangjieService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MianshijiangjieEntity> page = this.selectPage(
                new Query<MianshijiangjieEntity>(params).getPage(),
                new EntityWrapper<MianshijiangjieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MianshijiangjieEntity> wrapper) {
		  Page<MianshijiangjieView> page =new Query<MianshijiangjieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MianshijiangjieVO> selectListVO(Wrapper<MianshijiangjieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MianshijiangjieVO selectVO(Wrapper<MianshijiangjieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MianshijiangjieView> selectListView(Wrapper<MianshijiangjieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MianshijiangjieView selectView(Wrapper<MianshijiangjieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
