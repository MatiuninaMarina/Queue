import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Person> deque = new ArrayDeque<>(getPeople());
        while (!deque.isEmpty()) {
            Person s = deque.pollFirst();
            if (s.getTickets() > 0) {
                int minusTickets = s.getTickets() - 1;
                s.setTickets(minusTickets);
                System.out.println(s.getName() +" "+ s.getSurname() + "  прокатился на аттракционе " + minusTickets);
                if(minusTickets>0) {
                    deque.addLast(s);
                }
            }
        }
    }
    private static List<Person> getPeople() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person ("Kolya", "Baklushin", 3));
        personList.add(new Person ("Lena", "Vihanova", 2));
        personList.add(new Person ("Sveta", "Kirillova", 5));
        personList.add(new Person ("Andrey", "Denisov", 4));
        personList.add(new Person ("Vera", "Denisov", 6));
        return personList;
    }
}
