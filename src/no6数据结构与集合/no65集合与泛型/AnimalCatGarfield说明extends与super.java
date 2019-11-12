package no6数据结构与集合.no65集合与泛型;

import java.util.ArrayList;
import java.util.List;

class Animal {}
class Cat extends Animal {}
class Garfield extends Cat {}



public class AnimalCatGarfield说明extends与super {
    // 用动物的猫科与加菲猫的继承关系说明extends与super在集合中的意又
    public static void main(String[] args) {
        // 第1段:声明三个依次继承的类的集合: Object>动物>猫>加尊貓
        List<Animal> animal = new ArrayList<Animal>();
        List<Cat> cat = new ArrayList<Cat>();
        List<Garfield> garfield = new ArrayList<Garfield>();
        animal.add(new Animal());
        cat.add(new Cat());
        garfield.add(new Garfield());

        // 第2段:测试赋值操作
        // 下行编译出错。只能赋值Cat或Cat子类的集合
//        List<? extends Cat> extendsCatFromAnimal = animal;
        List<? super Cat> superCatFromAnimal = animal;

        List<? extends Cat> extendsCatFromCat = cat;
        List<? super Cat> superCatFromCat = cat;

        List<? extends Cat> extendsCatFromGarfield = garfield;
        // 下行编承出错。只能赋值Cat或cat父，的集合
//        List<? super Cat> superCatFromGarfield = garfield;

        // 第3段:测武add方法
        // 下面三行中所有的<2 extends T>都无法进行add操作。编译均出错
//        extendsCatFromCat.add(new Animal()) ;
//        extendsCatFromCat.add(new Cat());
//        extendsCatFromCat.add(new Garfield()) ;
        // 下行编译出错。只能添加Cat或Cat子类的集会
//        superCatFromCat.add(new Animal()) ;

        superCatFromCat.add(new Cat());
        superCatFromCat.add(new Garfield());

        // 第4段:测试get方法
        // 所有的super操作能够返回元素，但是泛型丢失，只能返回object对象
        // 以下extends操作能够返回元素
        Object catExtends2= extendsCatFromCat.get(0) ;
        Cat catExtendsl = extendsCatFromCat.get (0) ;
        // 下行编译出错。虽然Cat集合从Garfield赋值而来，但类型擦除后，是不知道的
//        Garfield garfieldl = extendsCatFromGarfield.get(0);
    }
}
