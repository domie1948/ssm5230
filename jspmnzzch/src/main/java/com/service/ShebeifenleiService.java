package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeifenleiView;


/**
 * 设备分类
 *
 * @author 
 * @email 
 * @date 2021-02-01 13:34:32
 */
public interface ShebeifenleiService extends IService<ShebeifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeifenleiVO> selectListVO(Wrapper<ShebeifenleiEntity> wrapper);
   	
   	ShebeifenleiVO selectVO(@Param("ew") Wrapper<ShebeifenleiEntity> wrapper);
   	
   	List<ShebeifenleiView> selectListView(Wrapper<ShebeifenleiEntity> wrapper);
   	
   	ShebeifenleiView selectView(@Param("ew") Wrapper<ShebeifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeifenleiEntity> wrapper);
   	
}

