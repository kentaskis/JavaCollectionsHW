package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
public class Bee implements Comparable<Bee> {
    private Integer id;
    private String name;
    private Date birthday;
    private Float size;
    private Boolean isInHouse;


    @Override
    public int compareTo(Bee anotherBee) {
        int res;
        return (res = this.size.compareTo(anotherBee.size)) == 0 ? this.birthday.compareTo(anotherBee.birthday) : res;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "name:'" + name + "', size:" + size +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bee bee = (Bee) o;
        return Objects.equals(id, bee.id) && Objects.equals(name, bee.name) && Objects.equals(birthday, bee.birthday)
                && Objects.equals(size, bee.size) && Objects.equals(isInHouse, bee.isInHouse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthday, size, isInHouse);
    }
}