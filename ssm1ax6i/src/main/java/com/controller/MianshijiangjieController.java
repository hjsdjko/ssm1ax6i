package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.MianshijiangjieEntity;
import com.entity.view.MianshijiangjieView;

import com.service.MianshijiangjieService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 面试讲解
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-28 16:47:14
 */
@RestController
@RequestMapping("/mianshijiangjie")
public class MianshijiangjieController {
    @Autowired
    private MianshijiangjieService mianshijiangjieService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,MianshijiangjieEntity mianshijiangjie, 
		HttpServletRequest request){

        EntityWrapper<MianshijiangjieEntity> ew = new EntityWrapper<MianshijiangjieEntity>();
		PageUtils page = mianshijiangjieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, mianshijiangjie), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,MianshijiangjieEntity mianshijiangjie, HttpServletRequest request){
        EntityWrapper<MianshijiangjieEntity> ew = new EntityWrapper<MianshijiangjieEntity>();
		PageUtils page = mianshijiangjieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, mianshijiangjie), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( MianshijiangjieEntity mianshijiangjie){
       	EntityWrapper<MianshijiangjieEntity> ew = new EntityWrapper<MianshijiangjieEntity>();
      	ew.allEq(MPUtil.allEQMapPre( mianshijiangjie, "mianshijiangjie")); 
        return R.ok().put("data", mianshijiangjieService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(MianshijiangjieEntity mianshijiangjie){
        EntityWrapper< MianshijiangjieEntity> ew = new EntityWrapper< MianshijiangjieEntity>();
 		ew.allEq(MPUtil.allEQMapPre( mianshijiangjie, "mianshijiangjie")); 
		MianshijiangjieView mianshijiangjieView =  mianshijiangjieService.selectView(ew);
		return R.ok("查询面试讲解成功").put("data", mianshijiangjieView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        MianshijiangjieEntity mianshijiangjie = mianshijiangjieService.selectById(id);
        return R.ok().put("data", mianshijiangjie);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        MianshijiangjieEntity mianshijiangjie = mianshijiangjieService.selectById(id);
        return R.ok().put("data", mianshijiangjie);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MianshijiangjieEntity mianshijiangjie, HttpServletRequest request){
    	mianshijiangjie.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(mianshijiangjie);

        mianshijiangjieService.insert(mianshijiangjie);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody MianshijiangjieEntity mianshijiangjie, HttpServletRequest request){
    	mianshijiangjie.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(mianshijiangjie);

        mianshijiangjieService.insert(mianshijiangjie);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MianshijiangjieEntity mianshijiangjie, HttpServletRequest request){
        //ValidatorUtils.validateEntity(mianshijiangjie);
        mianshijiangjieService.updateById(mianshijiangjie);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        mianshijiangjieService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<MianshijiangjieEntity> wrapper = new EntityWrapper<MianshijiangjieEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = mianshijiangjieService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
