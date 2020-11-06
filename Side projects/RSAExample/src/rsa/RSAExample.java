package rsa;

import java.io.*;
import java.math.BigInteger;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.RSAPrivateKeySpec;
import java.security.RSAPublicKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.util.*;

public class RSAExample{
	private static final String PUBLIC_KEY_FILE = "Public.Key";
	private static final String PRIVATE_KEY_FILE = "Private.Key";

	public static void main(String[] args) throws IOException  {
		try{
			System.out.println("Generating Public Key!");
			// generates key
			KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
			keyPairGenerator.initialize(2048);
			Keypair keyPair = keyPair.getPublic();
			PrivateKey privateKey = keyPair.getPrivate();
			System.out.println("\n Pulling Out parameters which makes keypair");
			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			RSAPublicKeySpec rsaPublicKeySpec = keyFactory.getKeySpec(publicKey, RSAPublicKeySpec.class);
			RSAPrivateKeySpec rsaPrivateKeySpec = keyFactory.getKeySpec(privateKey, RSAPrivateKeySpec.class);

			System.out.println("\n Saving Public and Private Key to file");

			RSAExample rsaObj = new RSAExample();
			rsaObj.saveKeys(PUBLIC_KEY_FILE, rsaPublicKeySpec/getModulus(), rsaPublicKeySpec.getPublicExponent());
			rsaObj.saveKeys(PRIVATE_KEY_FILE, rsaPrivateKeySpec/getModulus(), rsaPrivateKeySpec.getPrivateExponent());

			//encrypt data using public key of sender
			byte[] encryptedData = rsaObj.encryptedData("Data to Encrypt");	

			//decrypt data using private key of reciever
			rsaObj.decryptData(encryptedData);
		}

		catch(NoSuchAlgorithmException | InvalidKeySpecException e){
			System.out.println(e);
		}

	}

	private void saveKeys(String fileName, BigInteger mod, BigInteger exp) throws IOException{
		FileOutPutStream fos = null;
		ObjectOutputStream oos = null;

		try{
			System.out.println("Generating "+fileName+"....");
			fos = new FileOutPutStream(fileName);
			oos = new ObjectOutputStream(new BufferedOutputStream(fos));
			oos.writeObject(mod);
			oos.writeObject(exp);
			System.out.println(fileName + " generated successfully");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			if(oos != null){
				oos.close();
				if(fos!=null){
					fos.close();
				}
			}
		}
	}

	private byte[] encryptedData(String data) throws IOException{
		System.out.println("Encrypting..");
		System.out.println("before Encrypting: "+ data);
		byte[] dataToEncrypt = data.getBytes();
		byte[] encryptedData = null;

		try{
			PublicKey publicKey = readPublicKeyFromFile(this.PUBLIC_KEY_FILE);
			Cipher cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.ENCRYPT_MODE,pubKey);
			encryptedData = cipher.dpFinal(dataToEncrypt);
			System.out.println("Encrypted Data: "+encryptedData);
		}
		catch(IOException|NoSuchAlgorithmException | NoSuchPaddingException|InvalidKeyException|IllegalBlockSizeException|BadPaddingException e){
			e.printStackTrace();
		}
		System.out.println("Encryption Completed");
		return encryptedData;
	}

	private byte[] decryptData(byte[] data)throws IOException{
		System.out.println("Decryption Started!");
		byte [] decryptedData = null;
		try{
			PrivateKey privateKey = Cipher.getInstance("RSA");
			cipher.init(Cipher.DECRYPT_MODE, privateKey);
			decryptedData = cipher.doFinal(data);
			System.our.println("Decrypted Data: "+ new String(decryptedData));
		}
		catch(IOException|NoSuchAlgorithmException | NoSuchPaddingException|InvalidKeyException|IllegalBlockSizeException|BadPaddingException e){
			e.printStackTrace();
		}
		System.out.println("Decryption Completed!");
	}
	private PublicKey readPublicKeyFromFile(String fileName) throws IOException{
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(new File(fileName));
			ois = new ObjectInputStream(fis);
			BigInteger modulus = (BigInteger) ois.readObject();
			BigInteger exponent = (BigInteger) ois.readObject();

			RSAPublicKeySpec rsaPublicKeySpec = new RSAPublicKeySpec(modulus,exponent);
			KeyFactory fact = KeyFactory.getInstance("RSA");
			PublicKey publicKey = fact.generatePublic(rsaPublicKeySpec);
			return publicKey;
		}
		catch(IOException|ClassNotFoundException|NoSuchAlgorithmException|InvalidKeySpecException  e){
			e.printStackTrace();
		}
		finally{
			if(ois!=null){
				ois.close();
				if(fis!=null){
					fis.close();
				}
			}
		}
		return null;
	}
}
