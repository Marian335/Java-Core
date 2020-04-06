package logos.hometask;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws NoSuchMethodException  {
        Animal animal = new Animal("Dog",21,"Bobik");

        String cClass = animal.getClass().getSimpleName();



        Class myClass = animal.getClass();

        System.out.println("Simple name of class : " +cClass);

        int modifier = myClass.getModifiers();

        String modifierText = Modifier.toString(modifier);

        System.out.println("Class modifier = " + modifierText + " count of modifier = " + modifier);



        System.out.println("is static = " + Modifier.isStatic(modifier));

        System.out.println("is public = " + Modifier.isPublic(modifier));

        System.out.println("is abstract = " + Modifier.isAbstract(modifier));



        System.out.println("simple name of super class : " +

                myClass.getSuperclass().getSimpleName());



        System.out.println(myClass.getPackage());



        Class[] interfaces = myClass.getInterfaces();

        System.out.println("Interfaces =  " + Arrays.toString(interfaces));



        Method [] methods = myClass.getMethods();

        for (int i = 0; i < methods.length; i++) {

            Method method = methods[i];

            System.out.println( "Method : " + method);

        }



        Constructor<Animal>[] constructors = myClass.getConstructors();



        for (int i = 0; i < constructors.length; i++) {

            Constructor<Animal> constructor = constructors[i];

            System.out.println("Constructor = " + constructor);

        }



        Field[] classFields = myClass.getFields();

        for (int i = 0; i < classFields.length; i++) {

            Field field = classFields[i];

            System.out.println(field);

        }

        System.out.println();

        classFields = myClass.getDeclaredFields();

        for (int i = 0; i < classFields.length; i++) {

            Field field = classFields[i];

            System.out.println(field);

        }

    }
}
