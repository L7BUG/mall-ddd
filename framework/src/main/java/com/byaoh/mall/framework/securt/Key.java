package com.byaoh.mall.framework.securt;

import lombok.Data;

import java.io.Serializable;

/**
 * 密钥
 *
 * @author luliangyu
 * @date 2021-06-25 11:39
 */
@Data
public class Key implements Serializable {

	private static final long serialVersionUID = 4637201454606182907L;
	/**
	 * 加密算法
	 */
	private String algorithm;
	/**
	 * 私钥字节文件
	 */
	private byte[] privateKey;
	/**
	 * 公钥字节文件
	 */
	private byte[] publicKey;

	public String privateKeyStr() {
		return BaseCryptoStrategy.bytesToString(privateKey);
	}

	public String publicKeyStr() {
		return BaseCryptoStrategy.bytesToString(publicKey);
	}
}
