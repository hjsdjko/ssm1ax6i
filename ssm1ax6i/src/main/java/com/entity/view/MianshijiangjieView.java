package com.entity.view;

import com.entity.MianshijiangjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 面试讲解
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-28 16:47:14
 */
@TableName("mianshijiangjie")
public class MianshijiangjieView  extends MianshijiangjieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MianshijiangjieView(){
	}
 
 	public MianshijiangjieView(MianshijiangjieEntity mianshijiangjieEntity){
 	try {
			BeanUtils.copyProperties(this, mianshijiangjieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
