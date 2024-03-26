public class AverageTemperature implements Comparable{

    private String month;
    private String degree;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "AverageTemperature{" +
                "degree=" + degree +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
