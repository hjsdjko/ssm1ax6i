package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyedanweiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyedanweiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyedanweiView;


/**
 * 事业单位
 *
 * @author 
 * @email 
 * @date 2021-03-28 16:47:14
 */
public interface ShiyedanweiService extends IService<ShiyedanweiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyedanweiVO> selectListVO(Wrapper<ShiyedanweiEntity> wrapper);
   	
   	ShiyedanweiVO selectVO(@Param("ew") Wrapper<ShiyedanweiEntity> wrapper);
   	
   	List<ShiyedanweiView> selectListView(Wrapper<ShiyedanweiEntity> wrapper);
   	
   	ShiyedanweiView selectView(@Param("ew") Wrapper<ShiyedanweiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyedanweiEntity> wrapper);
   	
}

