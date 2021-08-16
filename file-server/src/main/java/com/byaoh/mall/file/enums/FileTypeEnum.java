package com.byaoh.mall.file.enums;

import com.byaoh.mall.framework.enums.BaseEnum;

/**
 * <li>-1 临时文件(可以是任意类型)</li>
 * <li>0 txt文本文件</li>
 * <li>1~100 照片类型</li>
 * <li>101~200 归档文件 如zip tar</li>
 * <li>201~300 文档类型 如 word,excl,pdf</li>
 * <li>301~400 视频类型 mp4,</li>
 *
 * @author l
 * @date 2021-08-15 20:21:38
 */
public enum FileTypeEnum implements BaseEnum<Integer> {
	/**
	 * 临时文件 会定期删除
	 */
	TEMP(-1, "临时文件", "*"),
	/**
	 * txt文本文件
	 */
	TXT(0, "文本文件", "txt"),
	/**
	 * png图片
	 */
	PNG(1, "图片", "png"),
	/**
	 * jpg图片
	 */
	JPG(2, "图片", "jpg"),
	/**
	 * zip压缩文件
	 */
	ZIP(101, "压缩文件", "zip"),
	;
	private final int type;
	private final String name;
	private final String suffix;

	FileTypeEnum(int type, String name, String suffix) {
		this.type = type;
		this.name = name;
		this.suffix = suffix;
	}

	public String getName() {
		return name;
	}

	public String getSuffix() {
		return suffix;
	}

	@Override
	public Integer getValue() {
		return type;
	}
}
