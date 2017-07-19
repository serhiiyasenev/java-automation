package trelloApi.models;

import java.util.Comparator;

    public class ListOfCardsNameComparator implements Comparator<TrelloList> {

        @Override
        public int compare(TrelloList o1, TrelloList o2)
        {
            int number1 = new Integer(o1.name);
            int number2 = new Integer(o2.name);
            return (number1 < number2) ? -1: ((number1 == number2) ? 0 : 1);
        }
    }
