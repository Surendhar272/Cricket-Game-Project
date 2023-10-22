package com.example.cricketgame.utils;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class CricketUtils {

//        private static List<String> TEAM_LIST = new ArrayList<>(Arrays.asList("IND", "PAK"));
//        private static final List<? super Object> POSSIBLE_DELIVERY_OUTCOME = new ArrayList<>(
//            Arrays.asList(0, 1, 2, 3, 4, 5, 6, 'W'));
        public String playMatch(){
            System.out.println("Welcome to ICC Men's T20 World Cup 2024!, " +
                    "\n Select 2 teams to start the match\n");

            int runsTeamA = simulateTeamScore(2,2);
            int runsTeamB = simulateTeamScore(2,2);

        String result =  determineWinner(runsTeamA, runsTeamB, "INDIA", "PAKISTHAN");

        System.out.println(result);
        return result;

        }
        public int simulateTeamScore(int overs, int wickets) {
            Random random = new Random();

            int runs=0,balls=overs*6,players=wickets;

            while (balls>0 && players>0) {
                int randomruns = random.nextInt(8);
                if(randomruns==7) {
                    players--;
                }else {
                    runs=randomruns+runs;
                }
                balls--;
            }

            return runs;
        }


        public String determineWinner(int runsTeamA, int runsTeamB, String team_A, String team_B) {
            if (runsTeamA > runsTeamB) {
                return team_A + " wins the match!";
            } else if (runsTeamB > runsTeamA) {
                return team_B + " wins the match!";
            } else {
                return "It's a tie!";
            }
        }

}
