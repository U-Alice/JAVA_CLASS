package rca.ac.rw.classEnum;

public class enumExample {
    public static void main(String[] args) {
        enum Day{
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

            public String toString(){
                return switch (this) {
                    case MONDAY -> "This is Monday";
                    case TUESDAY -> "It is valentine's day!!";
                    case WEDNESDAY -> "It is Wednesday!!";
                    case THURSDAY -> "It is Thursday";
                    case FRIDAY -> "It is Friday!!";
                    default -> "It is Zero day";
                };
            }

        };
        Day today = Day.MONDAY;

        System.out.println(today);


    }
}
