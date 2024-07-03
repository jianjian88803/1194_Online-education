package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 教师
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-10 22:50:28
 */
@TableName("jiaoshi")
public class JiaoshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoshiEntity() {
		
	}
	
	public JiaoshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 讲师工号
	 */
					
	private String jiangshigonghao;
	
	/**
	 * 讲师姓名
	 */
					
	private String jiangshixingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 头像
	 */
					
	private String touxiang;
	
	/**
	 * 获奖证书
	 */
					
	private String huojiangzhengshu;
	
	/**
	 * 所属单位
	 */
					
	private String suoshudanwei;
	
	/**
	 * 教授课程
	 */
					
	private String jiaoshoukecheng;
	
	/**
	 * 详细信息
	 */
					
	private String xiangxixinxi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：讲师工号
	 */
	public void setJiangshigonghao(String jiangshigonghao) {
		this.jiangshigonghao = jiangshigonghao;
	}
	/**
	 * 获取：讲师工号
	 */
	public String getJiangshigonghao() {
		return jiangshigonghao;
	}
	/**
	 * 设置：讲师姓名
	 */
	public void setJiangshixingming(String jiangshixingming) {
		this.jiangshixingming = jiangshixingming;
	}
	/**
	 * 获取：讲师姓名
	 */
	public String getJiangshixingming() {
		return jiangshixingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：头像
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
	/**
	 * 设置：获奖证书
	 */
	public void setHuojiangzhengshu(String huojiangzhengshu) {
		this.huojiangzhengshu = huojiangzhengshu;
	}
	/**
	 * 获取：获奖证书
	 */
	public String getHuojiangzhengshu() {
		return huojiangzhengshu;
	}
	/**
	 * 设置：所属单位
	 */
	public void setSuoshudanwei(String suoshudanwei) {
		this.suoshudanwei = suoshudanwei;
	}
	/**
	 * 获取：所属单位
	 */
	public String getSuoshudanwei() {
		return suoshudanwei;
	}
	/**
	 * 设置：教授课程
	 */
	public void setJiaoshoukecheng(String jiaoshoukecheng) {
		this.jiaoshoukecheng = jiaoshoukecheng;
	}
	/**
	 * 获取：教授课程
	 */
	public String getJiaoshoukecheng() {
		return jiaoshoukecheng;
	}
	/**
	 * 设置：详细信息
	 */
	public void setXiangxixinxi(String xiangxixinxi) {
		this.xiangxixinxi = xiangxixinxi;
	}
	/**
	 * 获取：详细信息
	 */
	public String getXiangxixinxi() {
		return xiangxixinxi;
	}

}
