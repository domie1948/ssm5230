package com.entity.view;

import com.entity.ShebeifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 设备分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-01 13:34:32
 */
@TableName("shebeifenlei")
public class ShebeifenleiView  extends ShebeifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShebeifenleiView(){
	}
 
 	public ShebeifenleiView(ShebeifenleiEntity shebeifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, shebeifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
