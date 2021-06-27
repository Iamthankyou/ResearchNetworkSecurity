package com.example.modulo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;
import java.math.BigInteger;

public class RSA extends AppCompatActivity {

    static class rsa {
        public static void main(String args[])
        {
            int p, q, n, z, d = 0, e, i;

            int msg = 12;
            double c;
            BigInteger msgback;

            p = 3;

            q = 11;
            n = p * q;
            z = (p - 1) * (q - 1);

            for (e = 2; e < z; e++) {

                if (gcd(e, z) == 1) {
                    break;
                }
            }

            for (i = 0; i <= 9; i++) {
                int x = 1 + (i * z);

                if (x % e == 0) {
                    d = x / e;
                    break;
                }
            }

            c = (Math.pow(msg, e)) % n;

            BigInteger N = BigInteger.valueOf(n);

            BigInteger C = BigDecimal.valueOf(c).toBigInteger();
            msgback = (C.pow(d)).mod(N);
        }

        static int gcd(int e, int z)
        {
            if (e == 0)
                return z;
               else
                return gcd(z % e, e);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_s);

    }
}