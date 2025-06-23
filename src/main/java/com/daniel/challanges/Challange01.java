package com.daniel.challanges;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Challange01 {
    public static void main(String[] args) {
        System.out.println(getNoRepeatCharacter("aabccnn"));
    }

    public static char getNoRepeatCharacter(String content) {
        Map<Character, Integer> counter = new HashMap<>();
        LinkedList<Character> order = new LinkedList<>();

        for (char c : content.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
            if (!order.contains(c)) {
                order.add(c);
            }
        }

        for (char c : order) {
            if (counter.get(c) == 1) {
                return c;
            }
        }

        return '\0'; // character nulo se não encontrar nenhum
    }
}
