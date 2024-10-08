package chapter_3;

class BitSet {
    int state = 0;  // 기본값

    /**
     * 비트 설정 메서드
     * @param position  설정할 자리수
     * @param value 설정할 값 (true || false)
     */
    void setBit(int position, boolean value) {
        int mask;

        if (value) {
            mask = 1 << position;
            state |= mask;
        } else {
            mask = ~(1 << position);
            state &= mask;
        }

    }

    /**
     * 비트 조회 메서드
     * @param position  가져올 자리수
     * @return  1인 경우 true, 0인 경우 false
     */
    boolean getBit(int position) {

        int mask = 1 << position;

        int result = state &= mask;

        return result != 0; // 0이 아니면 true, 0이면 false

    }
}

public class OperatorLab1 {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        bitSet.setBit(5, true);
        System.out.println(bitSet.getBit(5));
        System.out.println(bitSet.getBit(3));
    }
}
