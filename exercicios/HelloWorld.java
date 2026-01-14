public class HelloWorld {
    public static void main(String[] args) {

        pessoa p1 = new pessoa("Ortega", 21, 1.87);
        pessoa p2 = new pessoa("Emanoele", 20, 1.86);

        p1.apresentar();
        System.out.println("---------");
        p2.apresentar();

        }
    }
