class Animal {
    // 멤버변수 String int double....
    String name = "동물";
    private int age = 2;
    private double weight = 3.0;
    private double height = 32;

    protected double bmi = 0.0;

    private int dnaType = 12;

    // 생성자
    Animal(String name,int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;

        this.bmi = this.weight / (this.height * this.height);

        this.run();
        this.eat(13);

        dnaType =14;

    }

    void setAge(int age){ //setter
        this.age = age;
    }
    int getAge(){ //getter
        return  this.age;
    }

    // 메소드 & 멤버함수
    void run(){
        // this
        System.out.print(this.name);
        System.out.println("Run");

    }

    void eat(int weight){
//        weight = 3; // 매개변수
//        this.weight = 5; // 멤버변수

        System.out.print(this.name);
        System.out.println("Eat");

    }

    void sleep(){
        System.out.print(this.name);
        System.out.println("Sleep");

    }
    void playWith(Animal an){
        System.out.println(this.name);
        System.out.println(an.name);
        System.out.println("둘이서 재밌게 놀고 있습니다");
    }

    void print(){
        System.out.printf("%d, %f, %s", this.age, this.weight, this.name);
    }

}


public class Main {
    public static void main(String[] args){

        Animal cat = new Animal("깜디", 2, 3.0, 100); // 클래스 생성 시 new!!
        Animal dog = new Animal("룽지", 1, 1.6, 60);
        Animal lion = new Animal("멋사", 10, 10.5, 120);


//        cat.age = 2;
//        cat.name = "깜디";
//        cat.weight = 3;

        cat.run();
        dog.eat(4);
        lion.sleep();

        dog.playWith(cat);


//        System.out.println(print);

    }
}