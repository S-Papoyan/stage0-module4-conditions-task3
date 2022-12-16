package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        if (first % 5 == 0 && second % 25 == 0) {
            System.out.println("Aliquot");
        } else System.out.println("Not aliquot");
    }
}
