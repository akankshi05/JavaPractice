package javapractice;

import java.util.Scanner;

public class minAndMaxOccuringCharsInAString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] test = input.split("");


        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int E = 0;
        int F = 0;
        int G = 0;
        int H = 0;
        int I = 0;
        int J = 0;
        int K = 0;
        int L = 0;
        int M = 0;
        int N = 0;
        int O = 0;
        int P = 0;
        int Q = 0;
        int R = 0;
        int S = 0;
        int T = 0;
        int U = 0;
        int V = 0;
        int W = 0;
        int X = 0;
        int Y = 0;
        int Z = 0;

        for (String i : test) {

            if (i.equalsIgnoreCase("a")) {
                A++;
            } else if (i.equalsIgnoreCase("b")) {
                B++;
            } else if (i.equalsIgnoreCase("c")) {
                C++;
            } else if (i.equalsIgnoreCase("d")) {
                D++;
            } else if (i.equalsIgnoreCase("e")) {
                E++;
            } else if (i.equalsIgnoreCase("f")) {
                F++;
            } else if (i.equalsIgnoreCase("g")) {
                G++;
            } else if (i.equalsIgnoreCase("h")) {
                H++;
            } else if (i.equalsIgnoreCase("I")) {
                I++;
            } else if (i.equalsIgnoreCase("J")) {
                J++;
            } else if (i.equalsIgnoreCase("K")) {
                K++;
            } else if (i.equalsIgnoreCase("L")) {
                L++;
            } else if (i.equalsIgnoreCase("m")) {
                M++;
            } else if (i.equalsIgnoreCase("n")) {
                N++;
            } else if (i.equalsIgnoreCase("o")) {
                O++;
            } else if (i.equalsIgnoreCase("p")) {
                P++;
            } else if (i.equalsIgnoreCase("q")) {
                Q++;
            } else if (i.equalsIgnoreCase("R")) {
                R++;
            } else if (i.equalsIgnoreCase("S")) {
                 S++;
            } else if (i.equalsIgnoreCase("T")) {
                T++;
            } else if (i.equalsIgnoreCase("U")) {
                U++;
            } else if (i.equalsIgnoreCase("V")) {
                 V++;
            } else if (i.equalsIgnoreCase("W")) {
                 W++;
            } else if (i.equalsIgnoreCase("X")) {
                 X++;
            } else if (i.equalsIgnoreCase("Y")) {
                Y++;
            } else if (i.equalsIgnoreCase("Z")) {
                Z++;
            }

        }

        System.out.println(A);
        int max = A;

        if (B > max)
        {
            max = B;
        }

        else if (C > max)
        {
            max = C;
        }
       else if (D > max)
        {
            max = D;
        }

        else if (E > max)
        {
            max = E;
        }

        else if (F > max)
        {
            max = F;
        }

       else if (G > max)
        {
            max = G;
        }

        else if (H > max)
        {
            max = H;
        }

        else if (I > max)
        {
            max = I;
        }

        else if (J > max)
        {
            max = J;
        }

        else if (K > max)
        {
            max = K;
        }

        else if (L > max)
        {
            max = L;
        }
        else if (M > max)
        {
            max = M;
        }

        else if (N > max)
        {
            max = N;
        }

        else if (O > max)
        {
            max = O;
        }
        else if (P > max)
        {
            max = P;
        }

        else if (Q > max)
        {
            max = Q;
        }

        else if (R > max)
        {
            max = R;
        }
        else if (S > max)
        {
            max = S;
        }

        else if (T > max)
        {
            max = T;
        }

        else if (U > max)
        {
            max = U;
        }
       else  if (V > max)
        {
            max = V;
        }

        else if (W > max)
        {
            max = W;
        }
        else if (X > max)
        {
            max = X;
        }

        else if (Y > max)
        {
            max = Y;
        }

        else if (Z > max)
        {
            max = Z;
        }

        System.out.println(max);

    }


}
