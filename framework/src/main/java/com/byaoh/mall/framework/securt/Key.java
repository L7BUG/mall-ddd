package com.byaoh.mall.framework.securt;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 密钥对象
 *
 * @author luliangyu
 * @date 2021-06-25 11:39
 */
@Getter
@ToString
@EqualsAndHashCode
public class Key implements Serializable {

	private static final long serialVersionUID = 4637201454606182907L;
	/**
	 * 加密算法
	 */
	private final String algorithm;
	/**
	 * 私钥字节文件
	 */
	private final byte[] privateKey;
	/**
	 * 公钥字节文件
	 */
	private final byte[] publicKey;

	/**
	 * 创建一个密钥对象
	 *
	 * @param algorithm  加密算法
	 * @param privateKey 私钥
	 * @param publicKey  公钥
	 */
	public Key(String algorithm, byte[] privateKey, byte[] publicKey) {
		this.algorithm = algorithm;
		this.privateKey = privateKey;
		this.publicKey = publicKey;
	}

	public String privateKeyStr() {
		return BaseCryptoStrategy.bytesToString(getPrivateKey());
	}

	public String publicKeyStr() {
		return BaseCryptoStrategy.bytesToString(getPublicKey());
	}
}
