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


import com.dao.ShebeirukuDao;
import com.entity.ShebeirukuEntity;
import com.service.ShebeirukuService;
import com.entity.vo.ShebeirukuVO;
import com.entity.view.ShebeirukuView;

@Service("shebeirukuService")
public class ShebeirukuServiceImpl extends ServiceImpl<ShebeirukuDao, ShebeirukuEntity> implements ShebeirukuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeirukuEntity> page = this.selectPage(
                new Query<ShebeirukuEntity>(params).getPage(),
                new EntityWrapper<ShebeirukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShebeirukuEntity> wrapper) {
		  Page<ShebeirukuView> page =new Query<ShebeirukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShebeirukuVO> selectListVO(Wrapper<ShebeirukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShebeirukuVO selectVO(Wrapper<ShebeirukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShebeirukuView> selectListView(Wrapper<ShebeirukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeirukuView selectView(Wrapper<ShebeirukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
