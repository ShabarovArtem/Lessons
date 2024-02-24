package clone;

import javax.management.ObjectName;

public class Runner {
    public static void main(String[] args) throws CloneNotSupportedException{
        Agent agent = new Agent("Mr Smit");
//        Object clone = (Agent) agent.clone();
//        System.out.println(agent);
//        System.out.println(clone);
        Agent[] agents = make100Clones(agent);
        for (Agent clone : agents) {
            System.out.println(clone);
            
        }


    }
    public static Agent[] make100Clones(Agent agent) throws CloneNotSupportedException {
        Agent[] agents = new Agent[1000];
        for (int i = 0; i < 1000; i++) {
            agents[i] = (Agent) agent.clone();
            
        }
        return agents;
    }
}
