package com.mycompany.main1;

class ContestStat{
    
    int[] scores ={85, 95, 95};
    
    void printFirstScore(){
        System.out.println("First Score: " + scores[0]);
    }
}
public class Main1 {
    public static void main(String[] args) {
        ContestStat contest = new ContestStat();
        
        contest.printFirstScore();
    }
}
