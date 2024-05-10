package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshizigezhengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshizigezhengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshizigezhengView;


/**
 * 教师资格证
 *
 * @author 
 * @email 
 * @date 2021-03-28 16:47:14
 */
public interface JiaoshizigezhengService extends IService<JiaoshizigezhengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshizigezhengVO> selectListVO(Wrapper<JiaoshizigezhengEntity> wrapper);
   	
   	JiaoshizigezhengVO selectVO(@Param("ew") Wrapper<JiaoshizigezhengEntity> wrapper);
   	
   	List<JiaoshizigezhengView> selectListView(Wrapper<JiaoshizigezhengEntity> wrapper);
   	
   	JiaoshizigezhengView selectView(@Param("ew") Wrapper<JiaoshizigezhengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshizigezhengEntity> wrapper);
   	
}

