package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShebeilingyongDao;
import com.entity.ShebeilingyongEntity;
import com.service.ShebeilingyongService;
import com.entity.vo.ShebeilingyongVO;
import com.entity.view.ShebeilingyongView;

@Service("shebeilingyongService")
public class ShebeilingyongServiceImpl extends ServiceImpl<ShebeilingyongDao, ShebeilingyongEntity> implements ShebeilingyongService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeilingyongEntity> page = this.selectPage(
                new Query<ShebeilingyongEntity>(params).getPage(),
                new EntityWrapper<ShebeilingyongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShebeilingyongEntity> wrapper) {
		  Page<ShebeilingyongView> page =new Query<ShebeilingyongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShebeilingyongVO> selectListVO(Wrapper<ShebeilingyongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShebeilingyongVO selectVO(Wrapper<ShebeilingyongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShebeilingyongView> selectListView(Wrapper<ShebeilingyongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeilingyongView selectView(Wrapper<ShebeilingyongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
