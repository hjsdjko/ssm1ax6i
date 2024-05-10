package com.dao;

import com.entity.GongwuyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongwuyuanVO;
import com.entity.view.GongwuyuanView;


/**
 * 公务员
 * 
 * @author 
 * @email 
 * @date 2021-03-28 16:47:14
 */
public interface GongwuyuanDao extends BaseMapper<GongwuyuanEntity> {
	
	List<GongwuyuanVO> selectListVO(@Param("ew") Wrapper<GongwuyuanEntity> wrapper);
	
	GongwuyuanVO selectVO(@Param("ew") Wrapper<GongwuyuanEntity> wrapper);
	
	List<GongwuyuanView> selectListView(@Param("ew") Wrapper<GongwuyuanEntity> wrapper);

	List<GongwuyuanView> selectListView(Pagination page,@Param("ew") Wrapper<GongwuyuanEntity> wrapper);
	
	GongwuyuanView selectView(@Param("ew") Wrapper<GongwuyuanEntity> wrapper);
	
}
