package dataLoader;

import java.io.*;


public class FailedTestInfoLoader{

    private static final String STORAGE_ROOT_FOLDER = "/var/lib/jenkins/testData/projectsErrorsCounter/";

    public static void serializeStorage(FailedTestInfo failedProjectsTests, String fileName) {
        File folder = new File(STORAGE_ROOT_FOLDER);
        File file = new File(folder.getAbsolutePath()+"/"+fileName+".ser");
        if(!file.exists()){
            folder.mkdirs();
        }
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(file))) {

            oos.writeObject(failedProjectsTests);
            System.out.println("Object saved in storage file: "+fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

public static FailedTestInfo deserialzeStorage(String fileName) {
        File file = new File(STORAGE_ROOT_FOLDER+fileName+"/"+".ser");
        FailedTestInfo failedProjectsTests = null;
        try (ObjectInputStream ois
        = new ObjectInputStream(new FileInputStream(file))) {
        failedProjectsTests = (FailedTestInfo) ois.readObject();
        } catch (FileNotFoundException e) {
        return new FailedTestInfo();

        } catch (EOFException e){
        e.printStackTrace();
        }catch (Exception ex) {

        ex.printStackTrace();
        }
        System.out.println("Object loaded from storage file: "+fileName);
        return failedProjectsTests;

        }
}