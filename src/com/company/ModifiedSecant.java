package com.company;

public class ModifiedSecant {

        // returns function(x)
        static float function(float x) {

            // x^3+x-1
            float f = (float) Math.pow(x, 3)
                    + x - 1;

            return f;
        }

        static void secant(float B, float a, float E) {

            float n = 0, xm, x0, c;
            if (function(B) * function(a) < 0) {
                do {

                    // intermediate

                    x0 = (B * function(a) - a * function(B))
                            / (function(a) - function(B));

                    // check if x0 is root of
                    c = function(B) * function(x0);

                    // update the value of interval

                    a = B;
                    B = x0;
                    // update number of iteration
                    n++;

                    // if x0 is the root of equation
                    // then break the loop
                    if (c == 0)
                        break;
                    xm = (B * function(a) - a * function(B))
                            / (function(a) - function(B));

                    // repeat the loop until the convergence
                } while (Math.abs(xm - x0) >= E);

                System.out.println("Root of the" +
                        " given equation=" + x0);

                System.out.println("No. of "
                        + "iterations = " + n);
            } else
                System.out.print("Can not find a"
                        + " root in the given inteval");
        }
    }
