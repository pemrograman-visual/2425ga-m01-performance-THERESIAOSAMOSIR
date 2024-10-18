// 12S24055 - Theresia Oktaviani
// 12S24016 - Boy Harendy Simamora

import java.util.*;
import java.lang.Math;

public class M01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double nilaiangka, ket, performa;
        String nilaihuruf, kredit;

        do {
            kredit = input.nextLine();
            nilaihuruf = input.nextLine();
            if (kredit.equals("---") && nilaihuruf.equals("---")) {
            } else {
                if (nilaihuruf.equals("A")) {
                    ket = 4.0;
                } else {
                    if (nilaihuruf.equals("AB")) {
                        ket = 3.5;
                    } else {
                        if (nilaihuruf.equals("B")) {
                            ket = 3.0;
                        } else {
                            if (nilaihuruf.equals("BC")) {
                                ket = 2.5;
                            } else {
                                if (nilaihuruf.equals("C")) {
                                    ket = 2.0;
                                } else {
                                    if (nilaihuruf.equals("D")) {
                                        ket = 1.0;
                                    } else {
                                        if (nilaihuruf.equals("E")) {
                                            ket = 0.0;
                                        } else {
                                            ket = 0.0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                performa = Integer.parseInt(kredit) * ket;
                System.out.println(toFixed(performa,1));
            }
        } while (!kredit.equals("---") && !nilaihuruf.equals("---"));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
