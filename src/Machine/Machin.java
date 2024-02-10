package Machine;

public class Machin {
    public static void main(String[] args) {
        Boolean isWorkEngine = true;
        Boolean isWorkTrans = true;
        Boolean isFine1 = true;
        Boolean isFine2 = true;
        Boolean isFine3 = true;
        Boolean isFine4 = true;
        int isFine = 0;
        isFine += isFine1 ? 1 : 0;
        isFine += isFine2 ? 1 : 0;
        isFine += isFine3 ? 1 : 0;
        isFine += isFine4 ? 1 : 0;
        if (isWorkEngine && isWorkTrans && (isFine >=3)) {
            System.out.print("Машина работает");

        }else {
            System.out.print("Машина сломана");
        }
    }
}
