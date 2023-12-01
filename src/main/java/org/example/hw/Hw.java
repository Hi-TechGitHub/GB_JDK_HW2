package org.example.hw;

import java.util.ArrayList;

public class Hw {
    private final ArrayList<Developer> developers = new ArrayList<>();
    public void Hw() {

        developers.add(new FrontEnder()); // 1
        developers.add(new BackEnder());
        developers.add(new FullStack());
        developers.add(new FrontEnder()); // 2

        for (int i = 0; i < developers.size(); i++) {
            if (developers.get(i) instanceof FrontEnder) {
                (developers.get(i)).developGUI(); // Вывод: FrontEnder GUI method FrontEnder GUI method

            }
        }
    }
}