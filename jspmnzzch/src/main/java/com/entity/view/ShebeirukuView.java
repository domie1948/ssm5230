package com.entity.view;

import com.entity.ShebeirukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 设备入库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-01 13:34:32
 */
@TableName("shebeiruku")
public class ShebeirukuView  extends ShebeirukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShebeirukuView(){
	}
 
 	public ShebeirukuView(ShebeirukuEntity shebeirukuEntity){
 	try {
			BeanUtils.copyProperties(this, shebeirukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
