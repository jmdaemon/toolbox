package toolbox;

import java.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Toolbox {
  public static byte[] stringToBytes(String plaintext) {
    return plaintext.getBytes(StandardCharsets.UTF_8);
  }

  public static String bytesToString(byte[] hash) {
    String result = new String(hash, StandardCharsets.UTF_8);
    return result;
  }

  public static String b64encode(byte[] ciphertext) {
    String result = Base64.getEncoder().encodeToString(ciphertext);
    return result;
  }

  public static byte[] b64decode(String ciphertext) {
    byte[] result = Base64.getDecoder().decode(ciphertext.getBytes(StandardCharsets.UTF_8));
    return result;
  }
}
