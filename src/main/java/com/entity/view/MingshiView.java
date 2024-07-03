package com.entity.view;

import com.entity.MingshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 名师
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-10 22:50:28
 */
@TableName("mingshi")
public class MingshiView  extends MingshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MingshiView(){
	}
 
 	public MingshiView(MingshiEntity mingshiEntity){
 	try {
			BeanUtils.copyProperties(this, mingshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
