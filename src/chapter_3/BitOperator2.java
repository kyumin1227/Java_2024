package chapter_3;

public class BitOperator2 {
    public static void main(String[] args) {

        int addr1 = 210;    // 1101 0010
        int addr2 = 101;    // 0110 0101
        int addr3 = 236;    // 1110 1100
        int addr4 = 164;    // 1010 0100

        int mask1 = 255;    // 1111 1111
        int mask2 = 255;    // 1111 1111
        int mask3 = 255;    // 1111 1111
        int mask4 = 0;      // 0000 0000

        int subnet1 = addr1 & mask1;
        int subnet2 = addr2 & mask2;
        int subnet3 = addr3 & mask3;
        int subnet4 = addr4 & mask4;
        System.out.println(subnet1 + "." + subnet2 + "." + subnet3 + "." + subnet4);

        int bar = 1;
        int foo = 16;

        System.out.println(bar << 1);
        System.out.println(bar << 2);
        System.out.println(bar << 3);
        System.out.println(bar << 4);

        System.out.println(foo >> 1);
        System.out.println(foo >> 2);
        System.out.println(foo >> 3);
        System.out.println(foo >> 4);

        int myIpAddr = 0xD265ECA4;

        int ipAddr0 = (myIpAddr & 0xFF000000) >>> 24;   // 부호를 무시하고 땡기기 위해서 >>> 사용
        int ipAddr1 = myIpAddr >> 24 & 0xFF;
        int ipAddr2 = (myIpAddr & 0x00FF0000) >> 16;
        int ipAddr3 = (myIpAddr & 0x0000FF00) >> 8;
        int ipAddr4 = myIpAddr & 0x000000FF;

        System.out.println(ipAddr1 + "." + ipAddr2 + "." + ipAddr3 + "." + ipAddr4);
        System.out.println(ipAddr0);
    }
}
