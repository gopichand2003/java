class NumberIsGreaterException extends Exception {
    NumberIsGreaterException() {
        System.out.println("User Exception ");
    }
}
class TestMain {
    public static void main(String args[]) {
        try {
            int m = Integer.parseInt(args[0]);
            if (m > 100) {
                throw new NumberIsGreaterException();
            }
        } catch (NumberIsGreaterException e) {
            System.out.println(e);
        }
        System.out.println("After try, and catch ");
    }
}