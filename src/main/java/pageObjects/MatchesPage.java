package pageObjects;

import core.Elem;
import core.MethodsFactory;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;


public class MatchesPage extends MethodsFactory {

    public Elem likeBtn = new Elem(By.cssSelector(".icon--matches-like"), "Like button");
    public Elem dislikeBtn = new Elem(By.cssSelector(".icon--matches-dislike"), "Dislike button");

    private Elem userIdElem = new Elem(By.cssSelector(".matches-carousel [data-uid]"), "User ID elem");

    public void open() {
        get("http://kismia.com");
    }

    public String getCurrentUserId() {
        return userIdElem.getAttribute("data-uid");
    }

    public List<String> dislikeUsers(int count) {
        List<String> userIdList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String currentUserId = getCurrentUserId();
            userIdList.add(currentUserId);
            dislikeBtn.click();
        }
        return userIdList;
    }
}