package com.entity.view;

import com.entity.ShebeilingyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 设备领用
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-01 13:34:32
 */
@TableName("shebeilingyong")
public class ShebeilingyongView  extends ShebeilingyongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShebeilingyongView(){
	}
 
 	public ShebeilingyongView(ShebeilingyongEntity shebeilingyongEntity){
 	try {
			BeanUtils.copyProperties(this, shebeilingyongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
