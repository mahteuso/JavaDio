package domain;

import java.util.Objects;

public class Animes {
    private String title;
    private Double price;

    public Animes(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animes animes = (Animes) o;
        return Objects.equals(title, animes.title) && Objects.equals(price, animes.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "Animes{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }


}
