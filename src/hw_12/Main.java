package hw_12;

import hw_12.Rada.Deputy;
import hw_12.Rada.Party;
import hw_12.Rada.Util;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Party> rada = new HashMap<>();
        Util util = new Util();

        Deputy deputy1 = new Deputy("Vasya", false);
        Deputy deputy2 = new Deputy("Petya", false);
        Deputy deputy3 = new Deputy("Olya", false);
        Deputy deputy4 = new Deputy("Vanya", false);
        Deputy deputy5 = new Deputy("Sasna", false);
        Deputy deputy6 = new Deputy("Kiril", false);
        Deputy deputy7 = new Deputy("Yana", false);
        Deputy deputy8 = new Deputy("Vasya2", false);

        List<Deputy> koalitionList = new ArrayList<>();
        koalitionList.add(deputy1);
        koalitionList.add(deputy2);
        koalitionList.add(deputy3);
        koalitionList.add(deputy4);

        List<Deputy> opositionList = new ArrayList<>();
        opositionList.add(deputy5);
        opositionList.add(deputy6);
        opositionList.add(deputy7);
        opositionList.add(deputy8);

        Party koalition = new Party(koalitionList);
        Party oposition = new Party(opositionList);

        rada.put("koalition", koalition);
        rada.put("oposition", oposition);

        util.giveOneBribe(rada);
        util.findtakeBribeInRada(rada);
        if (Objects.nonNull(util.findtakeBribeInRada(rada))) {
            Deputy bribeTaker = util.findtakeBribeInRada(rada);
            System.out.println("We found bribe taker! This is " + bribeTaker.getName());
            String bribeParty = util.findPartiaBribetakers(rada, bribeTaker.getName());
            System.out.println("This deputy from partia " + bribeParty);
            util.excludeFromParty(rada.get(bribeParty), bribeTaker);
            System.out.println("We execud bribe taker from our party " + rada.get(bribeParty));
        } else {
            System.out.println("There are not bribe takers");
        }

        util.giveBribeEveryone(rada);
    }
}
