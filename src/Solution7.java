public class Solution7 {
    // Só pode haver UMA classe pública por arquivo, e a mesma deve ter o mesmo nome do arquivo

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat1);
        System.out.println(cat2);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(dog1);
        System.out.println(dog2);


    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    public static class Cat {
        public String toString() {
            return "I'am Cat";
        }
    }

    public static class Dog{
        public String toString() {
            return "I'am Dog";
        }
    }
}



