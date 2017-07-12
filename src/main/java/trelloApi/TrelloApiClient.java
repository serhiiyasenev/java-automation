package trelloApi;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.testng.annotations.Test;
import trelloApi.models.Board;
import trelloApi.models.ListOfCards;
import trelloApi.models.TrelloList;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class TrelloApiClient {

    public Gson gson = new Gson();
    public OkHttpClient okHttpClient = new OkHttpClient();
    public static final String KEY = "438afea6a66904072dabb8eb8df01de2";
    public static final String TOKEN = "705b8099d7182363cfaada712062dcd63d762da306700901a097256dd5c46096";
    public static final String BASE_URL = "https://api.trello.com/1/";
    public String boardId = "LVo8S7fH";
    public String listId = "59610fbe1310a8e951dea740"; // "595a7acfb7545e26d758c0e9"



    public Board getBoard() throws IOException{
        String url = BASE_URL+"boards/"+boardId+"?key="+KEY+"&token="+TOKEN;
        Request request = new Request.Builder().url(url).build();
        String respJson = okHttpClient.newCall(request).execute().body().string();
        return gson.fromJson(respJson, Board.class);
    }
    public ListOfCards getList() throws IOException{
        String url = BASE_URL+"lists/"+listId+"?key="+KEY+"&token="+TOKEN;
        Request request = new Request.Builder().url(url).build();
        String respJson = okHttpClient.newCall(request).execute().body().string();
        return gson.fromJson(respJson, ListOfCards.class);
    }
    public String createList (String boardId, String name) throws IOException{
        String url = BASE_URL+"lists"+"?key="+KEY+"&token="+TOKEN;
        RequestBody requestBody = new FormBody.Builder()
                .add("name", name)
                .add("idBoard", boardId).build();
        Request request = new Request.Builder().post(requestBody).url(url).build();
        return okHttpClient.newCall(request).execute().body().string();
    }
    public List<TrelloList> getBoardLists(String boardId) throws IOException {
        String url = BASE_URL + "boards/" + boardId + "/lists" + "?key=" + KEY + "&token=" + TOKEN;
        Request request = new Request.Builder().url(url).build();
        String json = okHttpClient.newCall(request).execute().body().string();
        Type type = new TypeToken<List<TrelloList>>(){}.getType();
        return gson.fromJson(json, type);
    }
    public List<TrelloList> getCardsFromLists(String listId) throws IOException {
        String url = BASE_URL + "lists/" + listId + "/cards" + "?key=" + KEY + "&token=" + TOKEN;
        Request request = new Request.Builder().url(url).build();
        String json = okHttpClient.newCall(request).execute().body().string();
        Type type = new TypeToken<List<TrelloList>>(){}.getType();
        return gson.fromJson(json, type);
    }
    public String getCardsOnBoard() throws IOException{
        String url = BASE_URL+"boards/"+boardId+"/cards"+"?key="+KEY+"&token="+TOKEN;
        Request request = new Request.Builder().url(url).build();
        return okHttpClient.newCall(request).execute().body().string();
    }
    public String getCardsOnList(int listIndex) throws IOException{
        String url = BASE_URL+"lists/"+getBoardLists(boardId).get(listIndex).id+"/cards"+"?key="+KEY+"&token="+TOKEN;
        Request request = new Request.Builder().url(url).build();
        return okHttpClient.newCall(request).execute().body().string();
    }
    public String createCard (String idList, String name) throws IOException{
        String url = BASE_URL+"cards"+"?key="+KEY+"&token="+TOKEN;
        RequestBody requestBody = new FormBody.Builder()
                .add("name", name)
                .add("idList", idList).build();
        Request request = new Request.Builder().post(requestBody).url(url).build();
        return okHttpClient.newCall(request).execute().body().string();
    }

    /*
Получение информации о карточке
Комментирование карточки
     */


    @Test
    public void alala() throws IOException, InterruptedException {
        Board board = getBoard();
        ListOfCards list = getList();
        //System.out.println(createList(board.id, "TEST 2048 LIST"));
        //System.out.println(getBoard());
        //System.out.println(getBoardLists(board.id));
        //System.out.println(createCard("595a7acfb7545e26d758c0e9", "TestCard1"));
        //System.out.println(getCardsOnBoard());
        //System.out.println(getCardsOnList(1));
        List<TrelloList> boardList = getBoardLists(board.id);
       /*  for (TrelloList trelloList : boardList) {
             System.out.println(createCard(trelloList.id, "TestCardInList"));
         }
         */

       List<TrelloList> trelloListList = getCardsFromLists(list.id);
        for (TrelloList trelloList : trelloListList) {
            if (trelloList.name.length()>4) {
                System.out.println(trelloList.name.substring(0, 3));
            }
            else {
                System.out.println(trelloList.name);
            }
        }
    }
}

