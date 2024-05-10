package com.entity.view;

import com.entity.ShiyedanweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 事业单位
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-28 16:47:14
 */
@TableName("shiyedanwei")
public class ShiyedanweiView  extends ShiyedanweiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiyedanweiView(){
	}
 
 	public ShiyedanweiView(ShiyedanweiEntity shiyedanweiEntity){
 	try {
			BeanUtils.copyProperties(this, shiyedanweiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
