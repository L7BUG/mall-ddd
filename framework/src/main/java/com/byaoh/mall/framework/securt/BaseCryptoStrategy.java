package com.byaoh.mall.framework.securt;

import java.util.Base64;

/**
 * 加密策略接口
 *
 * @author luliangyu
 * @date 2021-08-18 11:26
 */
public interface BaseCryptoStrategy {
	Base64.Encoder ENCODER = Base64.getEncoder();
	Base64.Decoder DECODER = Base64.getDecoder();

	/**
	 * 字节数组转换字符串
	 *
	 * @param bytes 字节数组
	 *
	 * @return 字符
	 */
	static String bytesToString(byte[] bytes) {
		return ENCODER.encodeToString(bytes);
	}

	/**
	 * 字符串转换字节数组
	 *
	 * @param str 字符串
	 *
	 * @return 字节数组
	 */
	static byte[] stringToBytes(String str) {
		return DECODER.decode(str);
	}

	/**
	 * 生成密钥
	 *
	 * @return 密钥对象
	 */
	Key generateKey();

    /*
    #################
    # 公钥加密 私钥解密
    ################
    */

	/**
	 * 当前模式的算法类型
	 *
	 * @return 该模式的密钥算法
	 */
	String algorithm();

	/**
	 * 使用公钥加密
	 *
	 * @param publicKey 公钥
	 * @param data      加密数据
	 *
	 * @return 密文
	 */
	byte[] encryptByPublicKey(byte[] publicKey, String data);

	/**
	 * 使用私钥解密
	 *
	 * @param privateKey      私钥
	 * @param ciphertextBytes 密文
	 *
	 * @return 原文
	 */
	String decryptByPrivateKey(byte[] privateKey, byte[] ciphertextBytes);

	/**
	 * 公钥加密
	 *
	 * @param publicKeyStr 公钥字符串
	 * @param data         原文
	 *
	 * @return 密文
	 */
	default String encryptByPublicKey(String publicKeyStr, String data) {
		byte[] encrypt = encryptByPublicKey(stringToBytes(publicKeyStr), data);
		return bytesToString(encrypt);
	}

    /*
    ################
    #私钥加密 公钥解密
    ################
     */

	/**
	 * 使用私钥解密
	 *
	 * @param privateKeyStr 私钥字符串
	 * @param ciphertext    密文
	 *
	 * @return 原文
	 */
	default String decryptByPrivateKey(String privateKeyStr, String ciphertext) {
		byte[] privateKey = stringToBytes(privateKeyStr);
		byte[] ciphertextBytes = stringToBytes(ciphertext);
		return decryptByPrivateKey(privateKey, ciphertextBytes);
	}

	/**
	 * 使用私钥加密
	 *
	 * @param privateKey 私钥
	 * @param data       待加密数据
	 *
	 * @return 密文
	 */
	byte[] encryptByPrivateKey(byte[] privateKey, String data);

	/**
	 * 使用公钥解密
	 *
	 * @param publicKey       公钥
	 * @param ciphertextBytes 密文
	 *
	 * @return 原文
	 */
	String decryptByPublicKey(byte[] publicKey, byte[] ciphertextBytes);

	/**
	 * 使用私钥加密数据
	 *
	 * @param privateKeyStr 私钥字符串
	 * @param data          原文
	 *
	 * @return 密文
	 */
	default String encryptByPrivateKey(String privateKeyStr, String data) {
		byte[] privateKey = stringToBytes(privateKeyStr);
		byte[] ciphertext = encryptByPrivateKey(privateKey, data);
		return bytesToString(ciphertext);
	}

	/**
	 * 使用公钥解密
	 *
	 * @param publicKeyStr 公钥字符串
	 * @param ciphertext   密文
	 *
	 * @return 原文
	 */
	default String decryptByPublicKey(String publicKeyStr, String ciphertext) {
		byte[] publicKey = stringToBytes(publicKeyStr);
		byte[] ciphertextBytes = stringToBytes(ciphertext);
		return decryptByPublicKey(publicKey, ciphertextBytes);
	}
}
