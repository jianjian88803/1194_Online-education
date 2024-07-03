package com.entity.model;

import com.entity.JiaoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 教师
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-10 22:50:28
 */
public class JiaoshiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
