package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeirukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeirukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeirukuView;


/**
 * 设备入库
 *
 * @author 
 * @email 
 * @date 2021-02-01 13:34:32
 */
public interface ShebeirukuService extends IService<ShebeirukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeirukuVO> selectListVO(Wrapper<ShebeirukuEntity> wrapper);
   	
   	ShebeirukuVO selectVO(@Param("ew") Wrapper<ShebeirukuEntity> wrapper);
   	
   	List<ShebeirukuView> selectListView(Wrapper<ShebeirukuEntity> wrapper);
   	
   	ShebeirukuView selectView(@Param("ew") Wrapper<ShebeirukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeirukuEntity> wrapper);
   	
}

