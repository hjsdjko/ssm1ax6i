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


import com.dao.ShiyedanweiDao;
import com.entity.ShiyedanweiEntity;
import com.service.ShiyedanweiService;
import com.entity.vo.ShiyedanweiVO;
import com.entity.view.ShiyedanweiView;

@Service("shiyedanweiService")
public class ShiyedanweiServiceImpl extends ServiceImpl<ShiyedanweiDao, ShiyedanweiEntity> implements ShiyedanweiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyedanweiEntity> page = this.selectPage(
                new Query<ShiyedanweiEntity>(params).getPage(),
                new EntityWrapper<ShiyedanweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyedanweiEntity> wrapper) {
		  Page<ShiyedanweiView> page =new Query<ShiyedanweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiyedanweiVO> selectListVO(Wrapper<ShiyedanweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyedanweiVO selectVO(Wrapper<ShiyedanweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyedanweiView> selectListView(Wrapper<ShiyedanweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyedanweiView selectView(Wrapper<ShiyedanweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
