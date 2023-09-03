package paragraph06.sec6_3;

/**
 * @Author: Qihao
 * @Time: 2023/9/3 11:26
 * @Descriptions: 本类实现了一个Student类，重写了其compareTo方法
 */
public class Student implements Comparable {
    private int score1, score2, score3;
    private double pscore;
    private String id;
    private String name;

    public Student(String id, String name, int score1, int score2, int score3) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.id = id;
        this.name = name;
        this.pscore = (this.score1 + this.score2 + this.score3) / 3;
    }

    public int compareTo(Student student) {
        if (this.pscore > student.pscore) {
            return 1;
        } else {
            return -1;
        }
    }

    public int getScore1() {
        return score1;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public int getScore2() {
        return score2;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    public int getScore3() {
        return score3;
    }

    public void setScore3(int score3) {
        this.score3 = score3;
    }

    public double getPscore() {
        return pscore;
    }

    public void setPscore(double pscore) {
        this.pscore = (this.score1 + this.score2 + this.score3) / 3;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        String s = "学号： " + this.id + "; 姓名： " + this.name + "平均成绩： " + this.pscore;
        return s;
    }
}
