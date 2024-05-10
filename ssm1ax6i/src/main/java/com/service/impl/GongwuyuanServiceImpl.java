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


import com.dao.GongwuyuanDao;
import com.entity.GongwuyuanEntity;
import com.service.GongwuyuanService;
import com.entity.vo.GongwuyuanVO;
import com.entity.view.GongwuyuanView;

@Service("gongwuyuanService")
public class GongwuyuanServiceImpl extends ServiceImpl<GongwuyuanDao, GongwuyuanEntity> implements GongwuyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongwuyuanEntity> page = this.selectPage(
                new Query<GongwuyuanEntity>(params).getPage(),
                new EntityWrapper<GongwuyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongwuyuanEntity> wrapper) {
		  Page<GongwuyuanView> page =new Query<GongwuyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongwuyuanVO> selectListVO(Wrapper<GongwuyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongwuyuanVO selectVO(Wrapper<GongwuyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongwuyuanView> selectListView(Wrapper<GongwuyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongwuyuanView selectView(Wrapper<GongwuyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
