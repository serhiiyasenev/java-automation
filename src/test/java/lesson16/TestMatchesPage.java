package lesson16;

import core.BrowserFactory;
import org.testng.annotations.Test;
import pageObjects.MatchesPage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TestMatchesPage extends BrowserFactory {

    MatchesPage matchesPage = new MatchesPage();
    Map <String, Integer> duplicatesMap = new HashMap<>();

@Test
public void matchesPage() throws InterruptedException {
    new TestLogin().tryLogin();
    matchesPage.open();

    System.out.println(matchesPage.getCurrentUserId());
    List<String> dislikeUsersList = matchesPage.dislikeUsers(50);
    Thread.sleep(5000);

  for (String uid:dislikeUsersList){
        if (duplicatesMap.containsKey(uid)){
            duplicatesMap.put(uid, duplicatesMap.get((uid)+1));
        } else {
            duplicatesMap.put(uid, 1);
        }
    }
    System.out.println(duplicatesMap);
}
}