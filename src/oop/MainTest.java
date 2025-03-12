package oop;

import java.net.URLEncoder;

class HttpBuffer {
    char[] buffer;
    HttpBuffer(int size) {
        buffer = new char[size];
    }
    void setBuffer(String argMsg) {
        buffer = argMsg.toCharArray();
    }
    // encoding
    String encode() {
        return URLEncoder.encode(new String(buffer));
    }
}

public class MainTest {
    public static void main(String[] args) {
        HttpBuffer test = new HttpBuffer(1024);
        test.setBuffer("http://www.naver.com/?name='test'");
        System.out.println(test.encode());
    }
}
