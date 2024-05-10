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


import com.dao.JiaoshizigezhengDao;
import com.entity.JiaoshizigezhengEntity;
import com.service.JiaoshizigezhengService;
import com.entity.vo.JiaoshizigezhengVO;
import com.entity.view.JiaoshizigezhengView;

@Service("jiaoshizigezhengService")
public class JiaoshizigezhengServiceImpl extends ServiceImpl<JiaoshizigezhengDao, JiaoshizigezhengEntity> implements JiaoshizigezhengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshizigezhengEntity> page = this.selectPage(
                new Query<JiaoshizigezhengEntity>(params).getPage(),
                new EntityWrapper<JiaoshizigezhengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshizigezhengEntity> wrapper) {
		  Page<JiaoshizigezhengView> page =new Query<JiaoshizigezhengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshizigezhengVO> selectListVO(Wrapper<JiaoshizigezhengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshizigezhengVO selectVO(Wrapper<JiaoshizigezhengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshizigezhengView> selectListView(Wrapper<JiaoshizigezhengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshizigezhengView selectView(Wrapper<JiaoshizigezhengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
