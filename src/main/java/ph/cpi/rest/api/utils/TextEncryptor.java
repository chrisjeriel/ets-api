package ph.cpi.rest.api.utils;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jasypt.digest.PooledStringDigester;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.exceptions.EncryptionOperationNotPossibleException;
import org.jasypt.util.text.BasicTextEncryptor;

public class TextEncryptor {
	
	private static String jasyptPassword = "Geniisys";
    // bouncy Castle encryption
    private static String bcPassword = "CpiGeniisysWS";
	private static String algorithm = "PBEWITHSHA256AND256BITAES-CBC-BC";
	private static String digestAlgo = "SHA-256";
	
	public static String encryptString(String param) {
		System.out.println("Encrypting string - "+param);
		BasicTextEncryptor encryptor = new BasicTextEncryptor();
		encryptor.setPassword(jasyptPassword);
		
		String encryptedString = encryptor.encrypt(param);
		System.out.println("Encrypted String: "+encryptedString);
		return encryptedString;
	}

	public static String decryptString(String param) {
		String decryptedString = "";
		System.out.println("Decrypting String: "+param);
		try {
			BasicTextEncryptor encryptor = new BasicTextEncryptor();
			encryptor.setPassword(jasyptPassword);
			
			decryptedString = encryptor.decrypt(param);
			System.out.println("Decrypted String: "+ decryptedString);
			
		} catch (EncryptionOperationNotPossibleException e) {
			System.out.println("Encryption not possible...");
			e.printStackTrace();
		}

		return decryptedString;
	}
	
	public static String encryptByAES(String param) {
		System.out.println("Encrypting String by BC: "+param);
		
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setProvider(new BouncyCastleProvider());
		encryptor.setAlgorithm(algorithm);
		encryptor.setPassword(bcPassword);
		
		String encryptedString = encryptor.encrypt(param);
		System.out.println("BC Encrypted String: "+encryptedString);
		return encryptedString;
	}
	
	public static String decryptByAES(String encryptedStr) {
		System.out.println("Decrypting String by BC: "+encryptedStr);
		
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setProvider(new BouncyCastleProvider());
		encryptor.setAlgorithm(algorithm);
		encryptor.setPassword(bcPassword);
		
		String decryptedString = encryptor.decrypt(encryptedStr);
		System.out.println("BC Decrypted String: "+decryptedString);
		return decryptedString;
	}
	
	// password digest
	public static String encryptBySHA(String inputPassword) {
		System.out.println("Encrypting by Jasypt Digester: "+inputPassword);
		PooledStringDigester digester = new PooledStringDigester();
		digester.setPoolSize(2);
		digester.setAlgorithm(digestAlgo);
		digester.setIterations(inputPassword.length()+10); // # of iteration is input password + 10
		String digest = digester.digest(inputPassword);
		System.out.println("Encrypted Word by Jasypt Standard Digest: "+digest);
		return digest;
	}
	
	public static boolean checkPasswordBySHA(String inputPassword, String digest) {
		StringBuilder sb = new StringBuilder();
		Random rand = new Random();
		
		for (char c: inputPassword.toCharArray()) {
			int val = rand.nextInt(10);
			sb.append(c).append(val);
		}
		
		System.out.println("SHASHA: "+sb.toString()+" <?> "+digest);
		PooledStringDigester digester = new PooledStringDigester();
		digester.setPoolSize(2);
		digester.setAlgorithm(digestAlgo);
		digester.setIterations(inputPassword.length()+10); 
		
		return digester.matches(inputPassword, digest);
	}
	
	// method from Philam for decrypting the database password
	public static String decodeDBPassword(String secret)
			throws NoSuchPaddingException, NoSuchAlgorithmException,
		InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
		byte[] kbytes = "jaas is the way".getBytes();
		SecretKeySpec key = new SecretKeySpec(kbytes, "Blowfish");
		BigInteger n = new BigInteger(secret, 16);
		byte[] encoding = n.toByteArray();
		Cipher cipher = Cipher.getInstance("Blowfish");
		cipher.init(Cipher.DECRYPT_MODE, key);
		byte[] decode = cipher.doFinal(encoding);
		return new String(decode).toString();
	}
}
