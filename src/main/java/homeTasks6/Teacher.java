package homeTasks6;


class Teacher extends Human{

    private int pupilsInTheSchool;

    Teacher(String name, String surname, int age, char gender, int pupilsInTheSchool){
        super(name, surname, age, gender);
        this.pupilsInTheSchool = pupilsInTheSchool;
    }

    public int getPupilsInTheSchool ()
    {
        return pupilsInTheSchool;
    }
    public void setPupilsInTheSchool (int pupilsInTheSchool)
    {
        if (pupilsInTheSchool < 0)
        {
            System.out.println("Value of pupilsInTheSchool must be positive");        }
        else
        {
            this.pupilsInTheSchool = pupilsInTheSchool;
        }

    }

    void getInfo()
    {
        System.out.println("Teacher:"+"\n"+"name: "+name+"; surname: "+surname+"; age: "+age+"; gender: "+gender+"; pupilsInTheSchool: "+pupilsInTheSchool);

    }

}