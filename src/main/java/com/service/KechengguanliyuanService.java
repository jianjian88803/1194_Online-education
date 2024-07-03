package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengguanliyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengguanliyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengguanliyuanView;


/**
 * 课程管理员
 *
 * @author 
 * @email 
 * @date 2021-05-10 22:50:28
 */
public interface KechengguanliyuanService extends IService<KechengguanliyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengguanliyuanVO> selectListVO(Wrapper<KechengguanliyuanEntity> wrapper);
   	
   	KechengguanliyuanVO selectVO(@Param("ew") Wrapper<KechengguanliyuanEntity> wrapper);
   	
   	List<KechengguanliyuanView> selectListView(Wrapper<KechengguanliyuanEntity> wrapper);
   	
   	KechengguanliyuanView selectView(@Param("ew") Wrapper<KechengguanliyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengguanliyuanEntity> wrapper);
   	
}

