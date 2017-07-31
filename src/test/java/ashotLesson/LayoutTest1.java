package ashotLesson;

import core.BrowserFactory;
import core.GifSequenceWriter;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class LayoutTest1 extends BrowserFactory {

    private static String RESOURCES_LAYOUT_DIR = "C:/testScreensoots";
    private static String expectedDir = RESOURCES_LAYOUT_DIR+"/expected/";
    private static String actualDir = RESOURCES_LAYOUT_DIR+"/actual/";
    private static String diffDir = RESOURCES_LAYOUT_DIR+"/diff/";
    private static String resultGifs = RESOURCES_LAYOUT_DIR+"/gifs/";
    File folder = new File ("C:\\ImagesAshot");


    private static void createFolders(){
        createFolder(expectedDir);
        createFolder(actualDir);
        createFolder(diffDir);
        createFolder(resultGifs);
    }

    private static void createFolder(String path){
        File file = new File(path);
        if(!file.exists()){
            file.mkdirs();
        }
    }

    public int getScreenshotsDiff(Screenshot actualScreenshot, String name, int colorDistortion) throws IOException {
        File expectedFile = new File(expectedDir+name+".png");
        File actualFile = new File(actualDir+name+".png");
        ImageIO.write(actualScreenshot.getImage(), "png", actualFile);
        if(!expectedFile.exists() ){
            System.out.println("Скриншота к элементу не существует, создаю копию актуального скриншота: "+name);
            ImageIO.write(actualScreenshot.getImage(), "png", expectedFile);
        }
        Screenshot expectedScreenshot = new Screenshot(ImageIO.read(new File(expectedDir+name+".png")));
        expectedScreenshot.setIgnoredAreas(actualScreenshot.getIgnoredAreas());
        ImageDiff diff = new ImageDiffer().withColorDistortion(colorDistortion).makeDiff(expectedScreenshot, actualScreenshot);
        File diffFile = new File(diffDir+name+".png");
        ImageIO.write(diff.getMarkedImage(), "png", diffFile);
        File[] filesArray = {expectedFile, actualFile, diffFile};
        File gifFile = null;
        try {
            gifFile = GifSequenceWriter.createGIF(filesArray, resultGifs+name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return diff.getDiffSize();
    }

    @Test
    public void makeScreen() throws IOException {
        driver().manage().window().maximize();
        createFolders();

    get("https://kismia.com");
    File file1 = new File(folder.getAbsolutePath() + "\\screen.png");
    Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver());
    ImageIO.write(screenshot.getImage(), "png", file1);
    int diff1 = getScreenshotsDiff(screenshot, "screen", 15);
    System.out.println("DIFF");
    System.out.println(diff1);
    Assert.assertTrue(diff1 <= 20, "DIFF" + diff1);
    }
}