package homeTasks6;



public class Examples {


    public static void main(String[] args) throws InterruptedException {

        Worker worker = new Worker("Ivan", "Petrov", 35, 'M', 11);
        worker.getInfo();
        System.out.println("-----------");
        Teacher teacher = new Teacher("Mariia", "Ivanevko", 45, 'F', 150);
        teacher.getInfo();
        System.out.println("-----------");
        worker.setExperience(45);
        System.out.println("Worker.Experience with getter and setter: "+worker.getExperience());
        System.out.println("-----------");
        teacher.setPupilsInTheSchool(245);
        System.out.println("Teacher.PupilsInTheSchool with getter and setter: "+teacher.getPupilsInTheSchool());
    }

}