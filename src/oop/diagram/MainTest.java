package oop.diagram;

class SubjectInfo {
    String title;
    int score;
    SubjectInfo(String argTitle, int argScore) {
        title = argTitle;
        score = argScore;
    }
    SubjectInfo() {}
}

class Student {
    int id = 2;
    String name = "Student";
    int age = 30;
    private static String university = "영진";
    SubjectInfo[] subList;
    int sum;
    float avg;

//    Student(int subNum, String argName, int argId) {
//        subList = new SubjectInfo[subNum];
//        for(int i = 0; i < subNum; i++) {
//            subList[i] = new SubjectInfo();
//        }
//
//        name = argName;
//        id = argId;
//    }

    int getSum() {
        sum = 0;
        for(SubjectInfo temp:subList){
            sum += temp.score;
        }
        return sum;
    }

    float getAvg() {
        avg = getSum() / subList.length;
        return avg;
    }
    static void prtUniversity() { System.out.println(university); }
    void setName(String argName) { name = argName; }
}

class GscStudent extends Student {
    int id = 20;
    String name = "GscStudent";

    GscStudent() {
        System.out.println("id" + this.id + "name" + super.name);
    }
}

public class MainTest {
    public static void main(String[] args) {

        GscStudent s1 = new GscStudent();
        System.out.println("s1.name = " + s1.name);
        System.out.println("s1.id = " + s1.id);
        System.out.println("s1.age = " + s1.age);

        Student s2 = new GscStudent();
        System.out.println("s2.name = " + s2.name);
        System.out.println("s2.id = " + s2.id);
        System.out.println("s2.age = " + s2.age);

    }
}
