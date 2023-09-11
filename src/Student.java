public class Student extends Student3 {
    int age;
    int rollnum;
    int section;
    String name;


    public void favsports(){
        System.out.println(name+"'s favourite sport is football");//method is overridden
    }
    public void displayinfo(){
        System.out.println("Student details\nName: "+name+"\n rollnum:"+rollnum+"\n Section:"+section);
    }//abstract class definition
    public int getAge() {//getters
        return age;
    }

    protected int getRollnum() {//getters//usage of getters here while getting age we can hava a condition
        if(rollnum<21){
            System.out.println("Invalid rollnum"+rollnum);
        }
        else{
            return rollnum;
        }
        return 0;
    }

    public String getName() {//getters
        return name;
    }
    //sum1(int age,int rollnum);
    public void sum(int age,int rollnum,int section){
        int sum=0;
        sum=age+rollnum;
        System.out.println("Methode overloaded  \n"+age+"+"+rollnum+"+"+section+"+="+sum);//method overloaded from student3

    }

    public void sum(int age,int rollnum) {
        int sum = 0;
        sum = age - rollnum;
        System.out.println("Methode overloaded  \n" + age + "-" + rollnum + "=" + sum);
    }//method is overloaded

    public void setdata(int age, int rollnum, int section,String name) {//setters
        this.age = age;
        this.rollnum = rollnum;
        this.name = name;
        this.section=section;
    }
    public static void main(String[] args){
        Student stud1=new Student();
        Student2 stud2=new Student2(35,"Rahul");//constructor
        stud1.setdata(13,20,4,"Ravi");
        System.out.println(stud1.getAge());
        stud1.getRollnum();
        stud2.displayinfo();
        stud1.sum(12,21,4);
        stud2.sum1(15,24);
        stud1.sum(12,21);
        stud1.favsports();//overridden
        stud2.favsports();//overridden
        stud1.displayinfo();
        //stud1.displayinfo();



    }
}

class Student2 extends Student3{
    int gpa;
    String name;
    public int getGpa(){//getters
        return gpa;
    }
    public  Student2(int gpa,String name){//values are set using constructor
        this.gpa=gpa;
        this.name=name;

    }
    public void displayinfo(){
        System.out.println("The name is "+name);
        System.out.println("the gpa is "+gpa);
    }
    public void favsports(){
        System.out.println(name+"'s favourite sport is basketball");
    }

}

abstract class Student3{
    public void sum1(int a,int b){//methode overloading
        int sum=0;
        sum=a+b;
        System.out.println("The sum of"+a+"+"+b+"="+sum);
    }

    public void favsports(){
        System.out.println("The students favourite sports");//method to be overridden
    }

    abstract void displayinfo();//abstract class open methode

}


interface teacher{
    public void math();
    public void science();
    public int numberOfTeachers(int a);
}

interface testscore{
    public void mathscore();
    public void sciencescore();
    public int totalscore(int a);
}

abstract class testpapaer implements teacher,testscore{
    public void math(){
        System.out.println("Maths");
    }
    public void science(){
        System.out.println("Maths");
    }
    public int numberOfTeachers(int a){
        System.out.println("The number of teachers is "+a);
        return 0;

    }
    public void mathscore(){
        System.out.println("Maths score");
    }
    public void sciencescore(){
        System.out.println("science score");
    }
    public int totalscore(int a){

        System.out.println("the total score is"+a+50);
        return 0;
    }
}



