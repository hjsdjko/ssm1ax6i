package com.dao;

import com.entity.ShiyedanweiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyedanweiVO;
import com.entity.view.ShiyedanweiView;


/**
 * 事业单位
 * 
 * @author 
 * @email 
 * @date 2021-03-28 16:47:14
 */
public interface ShiyedanweiDao extends BaseMapper<ShiyedanweiEntity> {
	
	List<ShiyedanweiVO> selectListVO(@Param("ew") Wrapper<ShiyedanweiEntity> wrapper);
	
	ShiyedanweiVO selectVO(@Param("ew") Wrapper<ShiyedanweiEntity> wrapper);
	
	List<ShiyedanweiView> selectListView(@Param("ew") Wrapper<ShiyedanweiEntity> wrapper);

	List<ShiyedanweiView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyedanweiEntity> wrapper);
	
	ShiyedanweiView selectView(@Param("ew") Wrapper<ShiyedanweiEntity> wrapper);
	
}
