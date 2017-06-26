package trelloApi.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TrelloList {

        public String id;
        public String name;
        public Boolean closed;
        public String idBoard;
        public Double pos;
        public Boolean subscribed;
}
