package com.dao;

import com.entity.JiaoshizigezhengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshizigezhengVO;
import com.entity.view.JiaoshizigezhengView;


/**
 * 教师资格证
 * 
 * @author 
 * @email 
 * @date 2021-03-28 16:47:14
 */
public interface JiaoshizigezhengDao extends BaseMapper<JiaoshizigezhengEntity> {
	
	List<JiaoshizigezhengVO> selectListVO(@Param("ew") Wrapper<JiaoshizigezhengEntity> wrapper);
	
	JiaoshizigezhengVO selectVO(@Param("ew") Wrapper<JiaoshizigezhengEntity> wrapper);
	
	List<JiaoshizigezhengView> selectListView(@Param("ew") Wrapper<JiaoshizigezhengEntity> wrapper);

	List<JiaoshizigezhengView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshizigezhengEntity> wrapper);
	
	JiaoshizigezhengView selectView(@Param("ew") Wrapper<JiaoshizigezhengEntity> wrapper);
	
}
