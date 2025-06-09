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


import com.dao.ShebeifenleiDao;
import com.entity.ShebeifenleiEntity;
import com.service.ShebeifenleiService;
import com.entity.vo.ShebeifenleiVO;
import com.entity.view.ShebeifenleiView;

@Service("shebeifenleiService")
public class ShebeifenleiServiceImpl extends ServiceImpl<ShebeifenleiDao, ShebeifenleiEntity> implements ShebeifenleiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeifenleiEntity> page = this.selectPage(
                new Query<ShebeifenleiEntity>(params).getPage(),
                new EntityWrapper<ShebeifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShebeifenleiEntity> wrapper) {
		  Page<ShebeifenleiView> page =new Query<ShebeifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShebeifenleiVO> selectListVO(Wrapper<ShebeifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShebeifenleiVO selectVO(Wrapper<ShebeifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShebeifenleiView> selectListView(Wrapper<ShebeifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeifenleiView selectView(Wrapper<ShebeifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
