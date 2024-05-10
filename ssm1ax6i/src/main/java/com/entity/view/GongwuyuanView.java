package com.entity.view;

import com.entity.GongwuyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 公务员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-28 16:47:14
 */
@TableName("gongwuyuan")
public class GongwuyuanView  extends GongwuyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongwuyuanView(){
	}
 
 	public GongwuyuanView(GongwuyuanEntity gongwuyuanEntity){
 	try {
			BeanUtils.copyProperties(this, gongwuyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
