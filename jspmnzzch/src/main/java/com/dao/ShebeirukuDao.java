package com.dao;

import com.entity.ShebeirukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeirukuVO;
import com.entity.view.ShebeirukuView;


/**
 * 设备入库
 * 
 * @author 
 * @email 
 * @date 2021-02-01 13:34:32
 */
public interface ShebeirukuDao extends BaseMapper<ShebeirukuEntity> {
	
	List<ShebeirukuVO> selectListVO(@Param("ew") Wrapper<ShebeirukuEntity> wrapper);
	
	ShebeirukuVO selectVO(@Param("ew") Wrapper<ShebeirukuEntity> wrapper);
	
	List<ShebeirukuView> selectListView(@Param("ew") Wrapper<ShebeirukuEntity> wrapper);

	List<ShebeirukuView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeirukuEntity> wrapper);
	
	ShebeirukuView selectView(@Param("ew") Wrapper<ShebeirukuEntity> wrapper);
	
}
