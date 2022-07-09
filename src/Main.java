import com.company.Cat;
import com.company.Dog;
import com.company.Fish;
import com.company.Parrot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Fish balyc = new Fish();
        balyc.setName("altyn balyk");
        balyc.setAge(1);
        balyc.setPoroda("forely");
        System.out.println(balyc.getName());
        System.out.println(balyc.getAge());
        System.out.println(balyc.getPoroda());
        balyc.suzot();
        System.out.println();


        Parrot popugai = new Parrot();
        popugai.setName(popugai.getName());
        popugai.setColor(popugai.getColor());
        popugai.setAge(popugai.getAge());
        popugai.setPoroda(popugai.getPoroda());
        System.out.println("sozundu kaitalap suiloi alat");
        System.out.println();

        Cat cot = new Cat();
        cot.setName(cot.getName());
        cot.setPoroda(cot.getPoroda());
        cot.setColor(cot.getColor());
        cot.setAge(cot.getAge());
        System.out.println("kechke uktait");
        System.out.println();


        Dog dog = new Dog();
        dog.setName(dog.getName());
        dog.setAge(dog.getAge());
        dog.setColor(dog.getColor());
        dog.setPoroda(dog.getPoroda());
        System.out.println("yiyndu korgoi alat ");
        System.out.println();
    }

}