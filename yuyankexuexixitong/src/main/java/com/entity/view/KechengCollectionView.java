package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.KechengCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 课程收藏
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("kecheng_collection")
public class KechengCollectionView extends KechengCollectionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 类型的值
	*/
	@ColumnInfo(comment="类型的字典表值",type="varchar(200)")
	private String kechengCollectionValue;

	//级联表 课程
					 
		/**
		* 课程 的 教师
		*/
		@ColumnInfo(comment="教师",type="int(11)")
		private Integer kechengJiaoshiId;
		/**
		* 课程编号
		*/

		@ColumnInfo(comment="课程编号",type="varchar(200)")
		private String kechengUuidNumber;
		/**
		* 课程名称
		*/

		@ColumnInfo(comment="课程名称",type="varchar(200)")
		private String kechengName;
		/**
		* 课程照片
		*/

		@ColumnInfo(comment="课程照片",type="varchar(200)")
		private String kechengPhoto;
		/**
		* 学习视频
		*/

		@ColumnInfo(comment="学习视频",type="varchar(200)")
		private String kechengVideo;
		/**
		* 课程类型
		*/
		@ColumnInfo(comment="课程类型",type="int(11)")
		private Integer kechengTypes;
			/**
			* 课程类型的值
			*/
			@ColumnInfo(comment="课程类型的字典表值",type="varchar(200)")
			private String kechengValue;
		/**
		* 参考价格
		*/
		@ColumnInfo(comment="参考价格",type="decimal(10,2)")
		private Double kechengOldMoney;
		/**
		* 课程热度
		*/

		@ColumnInfo(comment="课程热度",type="int(11)")
		private Integer kechengClicknum;
		/**
		* 赞
		*/

		@ColumnInfo(comment="赞",type="int(11)")
		private Integer zanNumber;
		/**
		* 踩
		*/

		@ColumnInfo(comment="踩",type="int(11)")
		private Integer caiNumber;
		/**
		* 课程介绍
		*/

		@ColumnInfo(comment="课程介绍",type="text")
		private String kechengContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer kechengDelete;
	//级联表 用户
		/**
		* 用户名称
		*/

		@ColumnInfo(comment="用户名称",type="varchar(200)")
		private String yonghuName;
		/**
		* 头像
		*/

		@ColumnInfo(comment="头像",type="varchar(255)")
		private String yonghuPhoto;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 邮箱
		*/

		@ColumnInfo(comment="邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 学习时长
		*/

		@ColumnInfo(comment="学习时长",type="int(11)")
		private Integer xuexiNumber;
		/**
		* 假删
		*/

		@ColumnInfo(comment="假删",type="int(11)")
		private Integer yonghuDelete;



	public KechengCollectionView() {

	}

	public KechengCollectionView(KechengCollectionEntity kechengCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, kechengCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 类型的值
	*/
	public String getKechengCollectionValue() {
		return kechengCollectionValue;
	}
	/**
	* 设置： 类型的值
	*/
	public void setKechengCollectionValue(String kechengCollectionValue) {
		this.kechengCollectionValue = kechengCollectionValue;
	}


	//级联表的get和set 课程
		/**
		* 获取：课程 的 教师
		*/
		public Integer getKechengJiaoshiId() {
			return kechengJiaoshiId;
		}
		/**
		* 设置：课程 的 教师
		*/
		public void setKechengJiaoshiId(Integer kechengJiaoshiId) {
			this.kechengJiaoshiId = kechengJiaoshiId;
		}

		/**
		* 获取： 课程编号
		*/
		public String getKechengUuidNumber() {
			return kechengUuidNumber;
		}
		/**
		* 设置： 课程编号
		*/
		public void setKechengUuidNumber(String kechengUuidNumber) {
			this.kechengUuidNumber = kechengUuidNumber;
		}

		/**
		* 获取： 课程名称
		*/
		public String getKechengName() {
			return kechengName;
		}
		/**
		* 设置： 课程名称
		*/
		public void setKechengName(String kechengName) {
			this.kechengName = kechengName;
		}

		/**
		* 获取： 课程照片
		*/
		public String getKechengPhoto() {
			return kechengPhoto;
		}
		/**
		* 设置： 课程照片
		*/
		public void setKechengPhoto(String kechengPhoto) {
			this.kechengPhoto = kechengPhoto;
		}

		/**
		* 获取： 学习视频
		*/
		public String getKechengVideo() {
			return kechengVideo;
		}
		/**
		* 设置： 学习视频
		*/
		public void setKechengVideo(String kechengVideo) {
			this.kechengVideo = kechengVideo;
		}
		/**
		* 获取： 课程类型
		*/
		public Integer getKechengTypes() {
			return kechengTypes;
		}
		/**
		* 设置： 课程类型
		*/
		public void setKechengTypes(Integer kechengTypes) {
			this.kechengTypes = kechengTypes;
		}


			/**
			* 获取： 课程类型的值
			*/
			public String getKechengValue() {
				return kechengValue;
			}
			/**
			* 设置： 课程类型的值
			*/
			public void setKechengValue(String kechengValue) {
				this.kechengValue = kechengValue;
			}

		/**
		* 获取： 参考价格
		*/
		public Double getKechengOldMoney() {
			return kechengOldMoney;
		}
		/**
		* 设置： 参考价格
		*/
		public void setKechengOldMoney(Double kechengOldMoney) {
			this.kechengOldMoney = kechengOldMoney;
		}

		/**
		* 获取： 课程热度
		*/
		public Integer getKechengClicknum() {
			return kechengClicknum;
		}
		/**
		* 设置： 课程热度
		*/
		public void setKechengClicknum(Integer kechengClicknum) {
			this.kechengClicknum = kechengClicknum;
		}

		/**
		* 获取： 赞
		*/
		public Integer getZanNumber() {
			return zanNumber;
		}
		/**
		* 设置： 赞
		*/
		public void setZanNumber(Integer zanNumber) {
			this.zanNumber = zanNumber;
		}

		/**
		* 获取： 踩
		*/
		public Integer getCaiNumber() {
			return caiNumber;
		}
		/**
		* 设置： 踩
		*/
		public void setCaiNumber(Integer caiNumber) {
			this.caiNumber = caiNumber;
		}

		/**
		* 获取： 课程介绍
		*/
		public String getKechengContent() {
			return kechengContent;
		}
		/**
		* 设置： 课程介绍
		*/
		public void setKechengContent(String kechengContent) {
			this.kechengContent = kechengContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getKechengDelete() {
			return kechengDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setKechengDelete(Integer kechengDelete) {
			this.kechengDelete = kechengDelete;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户名称
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户名称
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}

		/**
		* 获取： 学习时长
		*/
		public Integer getXuexiNumber() {
			return xuexiNumber;
		}
		/**
		* 设置： 学习时长
		*/
		public void setXuexiNumber(Integer xuexiNumber) {
			this.xuexiNumber = xuexiNumber;
		}

		/**
		* 获取： 假删
		*/
		public Integer getYonghuDelete() {
			return yonghuDelete;
		}
		/**
		* 设置： 假删
		*/
		public void setYonghuDelete(Integer yonghuDelete) {
			this.yonghuDelete = yonghuDelete;
		}


	@Override
	public String toString() {
		return "KechengCollectionView{" +
			", kechengCollectionValue=" + kechengCollectionValue +
			", yonghuName=" + yonghuName +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuEmail=" + yonghuEmail +
			", xuexiNumber=" + xuexiNumber +
			", yonghuDelete=" + yonghuDelete +
			", kechengUuidNumber=" + kechengUuidNumber +
			", kechengName=" + kechengName +
			", kechengPhoto=" + kechengPhoto +
			", kechengVideo=" + kechengVideo +
			", kechengOldMoney=" + kechengOldMoney +
			", kechengClicknum=" + kechengClicknum +
			", zanNumber=" + zanNumber +
			", caiNumber=" + caiNumber +
			", kechengContent=" + kechengContent +
			", kechengDelete=" + kechengDelete +
			"} " + super.toString();
	}
}
