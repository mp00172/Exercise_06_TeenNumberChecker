public class TeenNumberChecker {

    public static boolean hasTeen(int person1age, int person2age, int person3age) {
        return (person1age >= 13 && person1age <= 19) || (person2age >= 13 && person2age <= 19) || (person3age >= 13 && person3age <= 19);
    }

    public static boolean isTeen(int age) {
        return (age >= 13 && age <= 19);

    }
}
