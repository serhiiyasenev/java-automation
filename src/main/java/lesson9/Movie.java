package lesson9;

public class Movie implements Comparable{

    public Movie (String title, double score)
    {
        this.title = title;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", score=" + score +
                '}';
    }

    public String title;
        public double score;

        @Override
                public int compareTo(Object o)
        {
            Movie m = (Movie)o;
            return (score<m.score) ?-1 : ((score==m.score) ? 0 : 1);
        }
}