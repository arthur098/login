package br.com.log.util;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DigestUtil {

	public static String encrypt(String stringToEncrypt) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		digest.reset();
		
		digest.update(stringToEncrypt.getBytes("utf8"));
		
		return String.format("%064x", new BigInteger(1, digest.digest()));
	}
}
