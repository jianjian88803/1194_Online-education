package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MingshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MingshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MingshiView;


/**
 * 名师
 *
 * @author 
 * @email 
 * @date 2021-05-10 22:50:28
 */
public interface MingshiService extends IService<MingshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MingshiVO> selectListVO(Wrapper<MingshiEntity> wrapper);
   	
   	MingshiVO selectVO(@Param("ew") Wrapper<MingshiEntity> wrapper);
   	
   	List<MingshiView> selectListView(Wrapper<MingshiEntity> wrapper);
   	
   	MingshiView selectView(@Param("ew") Wrapper<MingshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MingshiEntity> wrapper);
   	
}

