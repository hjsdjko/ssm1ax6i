package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MianshijiangjieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MianshijiangjieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MianshijiangjieView;


/**
 * 面试讲解
 *
 * @author 
 * @email 
 * @date 2021-03-28 16:47:14
 */
public interface MianshijiangjieService extends IService<MianshijiangjieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MianshijiangjieVO> selectListVO(Wrapper<MianshijiangjieEntity> wrapper);
   	
   	MianshijiangjieVO selectVO(@Param("ew") Wrapper<MianshijiangjieEntity> wrapper);
   	
   	List<MianshijiangjieView> selectListView(Wrapper<MianshijiangjieEntity> wrapper);
   	
   	MianshijiangjieView selectView(@Param("ew") Wrapper<MianshijiangjieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MianshijiangjieEntity> wrapper);
   	
}

