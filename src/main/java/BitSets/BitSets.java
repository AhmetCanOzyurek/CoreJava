package BitSets;

import java.util.BitSet;

public class BitSets {
    public static void main(String[] args) {
        BitSet b1 = new BitSet(4);
        BitSet b2 = new BitSet(4);

        b1.set(0,true);
        b1.set(1,true);
        b1.set(2,true);
        b1.set(3,true);

        b2.set(0,false);
        b2.set(1,true);
        b2.set(2,false);
        b2.set(3,true);

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        //b1.and(b2);
//        b1.xor(b2);

        b1.set(6);
        System.out.println("b1 = " + b1);

        System.out.println(b1.get(0,2));
    }
}
