package homeTasks6;


class Worker extends Human{

    private int experience;

    Worker(String name, String surname, int age, char gender, int experience){
        super(name, surname, age, gender);
        this.experience = experience;
    }

    public int getExperience ()
    {
        return experience;
    }
    public void setExperience (int experience)
    {
        if (experience < 0)
        {
            System.out.println("Value of experience must be positive");        }
        else
        {
            this.experience = experience;
        }

    }
    void getInfo()
    {
        System.out.println("Worker:"+"\n"+"name: "+name+"; surname: "+surname+"; age: "+age+"; gender: "+gender+"; experience: "+experience);

    }

}

