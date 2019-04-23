package hw_12.Rada;

import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;


public class Util {

    public void giveOneBribe(Map<String, Party> rada) {
        int count = 0;
        int random = new Random().nextInt(8);
        Set<Map.Entry<String, Party>> entry = rada.entrySet();
        for (Map.Entry<String, Party> nameOfDeputy : entry) {
            for (Deputy deputy : nameOfDeputy.getValue().getDeputies()) {
                count++;
                if (count == random) {
                    deputy.setBribeTaker(true);
                    System.out.println("News! Someone from deputy took bribe");
                    break;
                }
            }
        }
    }

    public void giveBribeEveryone(Map<String, Party> rada) {
        Set<Map.Entry<String, Party>> entry = rada.entrySet();
        for (Map.Entry<String, Party> nameOfDeputy : entry) {
            for (Deputy deputy : nameOfDeputy.getValue().getDeputies()) {
                deputy.setBribeTaker(true);
            }
        }
        System.out.println("We bribed everyone...");
    }

    public Deputy findtakeBribeInRada(Map<String, Party> rada) {
        Set<Map.Entry<String, Party>> entry = rada.entrySet();
        for (Map.Entry<String, Party> nameOfDeputy : entry) {
            for (Deputy deputy : nameOfDeputy.getValue().getDeputies()) {
                if (deputy.isBribeTaker()) {
                    return deputy;
                }
            }
        }
        return null;
    }


    public String findPartiaBribetakers(Map<String, Party> rada, String bribetaker) {
        Set<Map.Entry<String, Party>> entry = rada.entrySet();
        for (Map.Entry<String, Party> nameOfDeputy : entry) {
            for (Deputy deputy : nameOfDeputy.getValue().getDeputies()) {
                if (Objects.equals(deputy.getName(), bribetaker)) {
                    return nameOfDeputy.getKey();
                }
            }
        }
        return null;
    }

    public boolean excludeFromParty(Party party, Deputy deputy) {
        return party.getDeputies().remove(deputy);
    }
}