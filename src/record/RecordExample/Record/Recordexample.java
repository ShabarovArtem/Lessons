package record.RecordExample.Record;

import java.lang.constant.DynamicCallSiteDesc;

public class Recordexample {
    public static void main(String[] args) {
        Human human = new Human(1992, "Ivan", "Ivanich", "Ivanov");
        System.out.println(human);
        HumanRecord humanRecord = new HumanRecord(1992, "Ivan", "Ivanich", "Ivanov");
        System.out.println(humanRecord);

    }

}
