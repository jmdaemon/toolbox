package toolbox;

import java.util.Random;
import java.security.SecureRandom;

public class RandomUtility {
  /**
    * Generate a random number between lower-upper
    * @param lower The minimum number that could be generated (inclusive).
    * @param upper The maximum number that could be generated (inclusive).
    * @return A random number inbetween lower and upper (inclusive).
    */
  public static int generateRandomNumber(int lower, int upper) {
    Random randGen = new Random();
    int result = randGen.nextInt(upper) + lower;
    return result;
  }

  /**
   * Generate an array of random bytes
   * @param len The length of the array to generate
   * @return An array filled to len of random bytes
  */
  public static byte[] generateRandomBytes(int len) {
    byte[] randomBytes = new byte[len];
    SecureRandom sr = new SecureRandom();
    sr.nextBytes(randomBytes);
    return randomBytes;
  }
}
