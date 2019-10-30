package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>
            (List.of("pierz", "yusuf", "tony", "kevin"));

	System.out.println("This person is a loser: "
            + list.get(random(list.size())));

    }

    public static int random(int bound) {
        Random r = new Random();
        return(r.nextInt(bound));
    }
}
