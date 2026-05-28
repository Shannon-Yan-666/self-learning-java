package demo05_collection_set.TreeSet_cast3;

public class Student4 implements Comparable<Student4>{
    @Override
    public int compareTo(Student4 o) {
        double sum1 = this.getChineseScore() + this.getEnglishScore() + this.MathScore;
        double sum2 = o.getChineseScore() + o.getEnglishScore() + o.MathScore;
        //比较两者的总分
        double i = sum2 - sum1;
        //如果总分一样，就按照语文成绩排序
         i = i == 0 ? this.getChineseScore() - o.getChineseScore() : i;
        //如果语文成绩一样，就按照数学成绩排序
        i = i == 0 ? this.getMathScore() - o.getMathScore() : i;
        //如果数学成绩一样，就按照英语成绩排序
        i = i == 0 ? this.getEnglishScore() - o.getEnglishScore() : i;
        //如果英语一样，就按照年龄排序
        i = i == 0 ? this.getAge() - o.getAge() : i;
        //如果年龄一样，就按照姓名的首字母排序
        i = i == 0 ? this.getName() .compareTo(o.getName()) : i;
        return (int)i;
    }

    private String name;
    private int age;
    private double ChineseScore;
    private double MathScore;
    private double EnglishScore;


    public Student4() {
    }

    public Student4(String name, int age, double ChineseScore, double MathScore, double EnglishScore) {
        this.name = name;
        this.age = age;
        this.ChineseScore = ChineseScore;
        this.MathScore = MathScore;
        this.EnglishScore = EnglishScore;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return ChineseScore
     */
    public double getChineseScore() {
        return ChineseScore;
    }

    /**
     * 设置
     * @param ChineseScore
     */
    public void setChineseScore(double ChineseScore) {
        this.ChineseScore = ChineseScore;
    }

    /**
     * 获取
     * @return MathScore
     */
    public double getMathScore() {
        return MathScore;
    }

    /**
     * 设置
     * @param MathScore
     */
    public void setMathScore(double MathScore) {
        this.MathScore = MathScore;
    }

    /**
     * 获取
     * @return EnglishScore
     */
    public double getEnglishScore() {
        return EnglishScore;
    }

    /**
     * 设置
     * @param EnglishScore
     */
    public void setEnglishScore(double EnglishScore) {
        this.EnglishScore = EnglishScore;
    }

    public String toString() {
        return "Student4{name = " + name + ", age = " + age + ", ChineseScore = " + ChineseScore + ", MathScore = " + MathScore + ", EnglishScore = " + EnglishScore +", 总分："+(this.getChineseScore() + this.getEnglishScore() + this.MathScore)+ "}";
    }
}
