package com.jonahseguin.cse;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        System.out.println("Welcome");
        System.out.println("Options:");
        System.out.println("- [0]: Gather user input");
        System.out.println("- [1]: Iteration example");
        System.out.println("- [2]: Quit");

        Scanner s = new Scanner(System.in);

        while (true) {
            if (s.hasNext()) {
                String input = s.next();
                try {
                    int val = Integer.parseInt(input);

                    if (val == 0) {
                        System.out.println("Type anything: ");
                        while (!s.hasNext()) {}
                        String userInput = s.next();
                        System.out.println(userInput.toUpperCase() + "!");
                    }
                    else if (val == 1) {
                        System.out.println("Math time.");
                        long start = System.currentTimeMillis();
                        double total = 0;
                        for (int i = 0; i < 2000000; i++) {
                            total += i * i;
                        }
                        long finish = System.currentTimeMillis();
                        System.out.println(">> Total: " + total);
                        System.out.println("Computed in " + (finish - start) + "ms");
                    }
                    else if (val == 2) {
                        System.out.println("Bye.");
                        break;
                    }
                    else {
                        System.out.println("Unknown operation.");
                    }

                }
                catch (NumberFormatException ex) {
                    System.out.println("Please input a number between 0-2 [integer]");
                }
            }
        }

    }

}
