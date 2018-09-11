/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class Person {

//    private String name = null;
//    private char sex = ' ';
//    private int age = 0;
//    private double height = 0;
//    private double weight = 0;
//    private boolean single = true;
     private String name = "Somsak";
    private char sex = 'M';
    private int age = 52;
    private double height = 180;
    private double weight = 50;
    private boolean single = false;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, char sex, int age, double height, double weight, boolean single) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.single = single;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeightWeight(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }

    public void setInfo(String name, char sex, int age, double height, double weight, boolean single) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.single = single;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isSingle() {
        return single;
    }

    public double getBMI() {
        if (height <= 0 | weight <= 0) {
            return -1;
        }

        double bmi = weight / Math.pow((height / 100), 2);
        String str = String.format("%.1f", bmi);
        return bmi;
    }

    public int getBodyState() {
        double bmi = getBMI();
        if (bmi == -1) {
            return -1;
        }
        if (bmi < 18.5) {
            return 0;
        }
        if (bmi <= 24.9) {
            return 1;
        }
        if (bmi <= 29.9) {
            return 2;
        } else {
            return 3;
        }
    }

    public String toString() {
        if (name == null || age == 0 || sex == ' ') {
            return "Error";
        }
        String result = "";
        if (sex == 'M') {
            result += "Mr. ";
        } else if (sex == 'F') {
            result += "Ms. ";
        }
        result += name + " is " + String.valueOf(age) + "years old and ";
        if (single) {
            result += "single. ";
        } else {
            result += "married. ";
        }
        if (getBMI() != -1) {
            if (sex == 'M') {
                result += "He has ";
            } else if (sex == 'F') {
                result += "She has ";
            }
            
            if(getBodyState()==0){
                result += "underweight";
            }else if(getBodyState() == 1){
                result += "normal";
            }else if(getBodyState() == 2){
                result += "overweight";
            }else if(getBodyState() == 3){
                result += "obesity";
            }
            result+=" body (BMI="+getBMI()+").";
        }
        return result;
    }

}

/**
 *
 * @author student
 */
public class CompanyApp {
    public static void main(String[] args){
        Person p = new Person();
        System.out.println(p.toString());
    }
}
