package com.dao;

import com.entity.ShebeilingyongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeilingyongVO;
import com.entity.view.ShebeilingyongView;


/**
 * 设备领用
 * 
 * @author 
 * @email 
 * @date 2021-02-01 13:34:32
 */
public interface ShebeilingyongDao extends BaseMapper<ShebeilingyongEntity> {
	
	List<ShebeilingyongVO> selectListVO(@Param("ew") Wrapper<ShebeilingyongEntity> wrapper);
	
	ShebeilingyongVO selectVO(@Param("ew") Wrapper<ShebeilingyongEntity> wrapper);
	
	List<ShebeilingyongView> selectListView(@Param("ew") Wrapper<ShebeilingyongEntity> wrapper);

	List<ShebeilingyongView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeilingyongEntity> wrapper);
	
	ShebeilingyongView selectView(@Param("ew") Wrapper<ShebeilingyongEntity> wrapper);
	
}
