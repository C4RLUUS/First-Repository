package NuevaRama;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PruebaSistemas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer hexString = new StringBuffer("Hola");
		MessageDigest md=null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] hash = md.digest();

		for (int i = 0; i < hash.length; i++) {
		    if ((0xff & hash[i]) < 0x10) {
		        hexString.append("0"
		                + Integer.toHexString((0xFF & hash[i])));
		    } else {
		        hexString.append(Integer.toHexString(0xFF & hash[i]));
		    }
		}
	}

}
