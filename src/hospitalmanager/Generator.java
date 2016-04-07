package hospitalmanager;


import java.math.BigInteger;
import java.security.SecureRandom;

public final class Generator {

        private SecureRandom random = new SecureRandom();

        public String nextSessionId() {
            return new BigInteger(30, random).toString(32);
        }
    }