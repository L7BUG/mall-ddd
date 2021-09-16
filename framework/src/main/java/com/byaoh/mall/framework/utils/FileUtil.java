package com.byaoh.mall.framework.utils;

import com.byaoh.mall.framework.enums.FileTypeEnum;
import com.byaoh.mall.framework.exception.ValidationException;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * FileUtil
 *
 * @author l
 * @date 2021-09-16 21:33:30
 */
public class FileUtil {
	private final static Map<Integer, FileTypeEnum> FILE_TYPE_ENUM_MAP = new ConcurrentHashMap<>();

	/**
	 * 新增一条信息
	 *
	 * @param key   文件类型
	 * @param value 文件枚举
	 */
	public static void putType(int key, FileTypeEnum value) {
		FILE_TYPE_ENUM_MAP.put(key, value);
	}

	/**
	 * 获取一条文件类型枚举
	 *
	 * @param key 文件类型
	 * @return 枚举
	 */
	public static FileTypeEnum getType(int key) {
		FileTypeEnum fileTypeEnum = FILE_TYPE_ENUM_MAP.get(key);
		return Optional.ofNullable(fileTypeEnum).orElseThrow(() -> new ValidationException("找不到该类型枚举"));
	}
}
