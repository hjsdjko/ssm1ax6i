package com.dao;

import com.entity.MianshijiangjieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MianshijiangjieVO;
import com.entity.view.MianshijiangjieView;


/**
 * 面试讲解
 * 
 * @author 
 * @email 
 * @date 2021-03-28 16:47:14
 */
public interface MianshijiangjieDao extends BaseMapper<MianshijiangjieEntity> {
	
	List<MianshijiangjieVO> selectListVO(@Param("ew") Wrapper<MianshijiangjieEntity> wrapper);
	
	MianshijiangjieVO selectVO(@Param("ew") Wrapper<MianshijiangjieEntity> wrapper);
	
	List<MianshijiangjieView> selectListView(@Param("ew") Wrapper<MianshijiangjieEntity> wrapper);

	List<MianshijiangjieView> selectListView(Pagination page,@Param("ew") Wrapper<MianshijiangjieEntity> wrapper);
	
	MianshijiangjieView selectView(@Param("ew") Wrapper<MianshijiangjieEntity> wrapper);
	
}
