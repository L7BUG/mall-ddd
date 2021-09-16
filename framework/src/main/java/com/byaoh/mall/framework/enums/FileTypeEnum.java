package com.byaoh.mall.framework.enums;


import com.byaoh.mall.framework.utils.FileUtil;

/**
 * 0 临时文件
 * 1~100 图片文件
 * 101~200 文档文件
 *
 * @author l
 * @date 2021-09-16 21:15:52
 */
public enum FileTypeEnum implements BaseEnum<Integer> {
	/**
	 * 临时文件
	 */
	TEMP(0, "*", "temp", "临时文件"),
	// 以下图片文件
	/**
	 * png图片
	 */
	PNG(1, "png", "image", "图片"),
	// 以下文档文件
	/**
	 * word文档
	 */
	WORD(101, "word", "document");

	/**
	 * 文件类型
	 */
	public final int type;
	/**
	 * 文件后缀
	 */
	public final String suffix;
	/**
	 * 存储路径
	 */
	public final String path;
	/**
	 * 说明
	 */
	public final String remark;

	FileTypeEnum(int type, String suffix, String path) {
		this(type, suffix, path, "");
	}

	FileTypeEnum(int type, String suffix, String path, String remark) {
		this.type = type;
		this.suffix = suffix;
		this.path = path;
		this.remark = remark;
		FileUtil.putType(type, this);
	}

	@Override
	public Integer getValue() {
		return type;
	}
}
