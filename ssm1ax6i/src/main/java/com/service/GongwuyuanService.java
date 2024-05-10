package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongwuyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongwuyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongwuyuanView;


/**
 * 公务员
 *
 * @author 
 * @email 
 * @date 2021-03-28 16:47:14
 */
public interface GongwuyuanService extends IService<GongwuyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongwuyuanVO> selectListVO(Wrapper<GongwuyuanEntity> wrapper);
   	
   	GongwuyuanVO selectVO(@Param("ew") Wrapper<GongwuyuanEntity> wrapper);
   	
   	List<GongwuyuanView> selectListView(Wrapper<GongwuyuanEntity> wrapper);
   	
   	GongwuyuanView selectView(@Param("ew") Wrapper<GongwuyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongwuyuanEntity> wrapper);
   	
}

