package com.chmnu_ki_123.k3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StringFilter {
    public static List<String> filterStringsByRegex(List<String> strings, String regex) {
        List<String> filteredStrings = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        for (String str : strings) {
            if (pattern.matcher(str).matches()) {
                filteredStrings.add(str);
            }
        }
        return filteredStrings;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter strings (one per line, empty line to finish):");
        List<String> strings = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) break;
            strings.add(input);
        }

        System.out.print("Enter a regular expression: ");
        String regex = scanner.nextLine();

        List<String> filteredStrings = filterStringsByRegex(strings, regex);

        System.out.println("Filtered strings:");
        for (String str : filteredStrings) {
            System.out.println(str);
        }
    }
}

