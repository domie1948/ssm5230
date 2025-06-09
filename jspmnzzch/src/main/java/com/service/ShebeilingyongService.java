package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeilingyongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeilingyongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeilingyongView;


/**
 * 设备领用
 *
 * @author 
 * @email 
 * @date 2021-02-01 13:34:32
 */
public interface ShebeilingyongService extends IService<ShebeilingyongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeilingyongVO> selectListVO(Wrapper<ShebeilingyongEntity> wrapper);
   	
   	ShebeilingyongVO selectVO(@Param("ew") Wrapper<ShebeilingyongEntity> wrapper);
   	
   	List<ShebeilingyongView> selectListView(Wrapper<ShebeilingyongEntity> wrapper);
   	
   	ShebeilingyongView selectView(@Param("ew") Wrapper<ShebeilingyongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeilingyongEntity> wrapper);
   	
}

