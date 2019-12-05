package mapzooclub;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ZooClub {
    private Map<Person, List<Pet>> map;

    ZooClub() {
        map = new HashMap<>();
    }

    Map<Person, List<Pet>> getMap() {
        return map;
    }

}
