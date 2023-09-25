public class studentdemo {

    int rollnum;
    String name;
    int gpa;
    String college;
    String section;
    public studentdemo(){//default constructor
        rollnum=10;
        name="Aravind";
        gpa=20;
    }
    public studentdemo(int rollnum,String name,int gpa){
        this.rollnum = rollnum;
        this.name=name;
        this.gpa=gpa;
        this.college = "ABC";
        this.section = "A";
    }
    public studentdemo(int rollnum,String name,int gpa,String section){
        this.rollnum = rollnum;
        this.name=name;
        this.gpa=gpa;
        this.college = "ABC";
        this.section = section;
    }
    public int fetchRank(int roillnum){
        return gpa;
    }


}



