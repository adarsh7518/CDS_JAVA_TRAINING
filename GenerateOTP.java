package OTP;

import java.util.Random;

public class GenerateOTP {
    public static void main(String[] args) {
        Random random = new Random();
        int myOtp = random.nextInt(1000000);
        System.out.println(myOtp);

    }
}