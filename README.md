# Programación orientada a objetos(POO)

**Uso del repositorio:**  Este repositorio sirve para mostrar mi aprendizaje en java , con notas y ejercicios .

**Que es POO?**
Es una de las paradigmas de programación , este tiene el fin de facilitar  programación  usando clases y objetos ( y otros conceptos que veré luego)

# Clases y objetos
**Que es una clase ?** 
Una clase nos funciona como plantilla que usaremos para facilitarnos  la vida, Dentro de la clase se va definir las características de la identidad y sus atributos.
**Que es un objeto?**
Un objeto seria una representación de algo

**Sintaxis de la clase**
```java
//[Modificador de acceso] [Class] [Nombre de la clase] {}
public class Main {
  int x = 5;
}
```
**Sintaxis del objeto**
```java
public class Main {
  int x = 5;

  public static void main(String[] args) {
    //[Clase][nombre del objeto] = [new][]Nombre de la clase]
    Main myObj = new Main();//Este es el objeto
    System.out.println(myObj.x);
    //out : 5
  }
}
```
 **Se puede tener diferentes objetos?**
 Claro , lo que cambia en la sintaxis es que el nombre del objeto debe ser diferente
 ```java
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj1 = new Main();  // Object 1
    Main myObj2 = new Main();  // Object 2
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}
//out
//5
//5
```
## Atributos de la clase
**Que es una atributo?** La explicación mas sencilla es que son variables de la clase, así de sencillo

```java
public class Main {
  int x = 5;
  int y = 3;
}
//Aqui esta clase tiene dos atributos x , y 
```
**Como llamamos los atributos?**
Pues muy sencillo , solamente llamaos las varibles usando el objeto
```java
public class Main {
  int x = 5;
//LLamar un atributo [Nombre del objeto].[nombre de la variable]
  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
```
Modificacion de atribtutos'
```java
public class Main {
  int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x);
  }
}
```
**Que hacer si no quiero que se modifiquen?**
Usamos *~~final~~* para que nos se modifique el acceso
```java
public class Main {
  final int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
```

## Métodos de clase
**Que es un método?** Los métodos son funciones que ejecutan códigos , sirven para separar apartados del programa y se efectúan con el objetos

**Ejemplo**
```java
public class Main {
  static void myMethod() {
    System.out.println("Hello World!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}

// Outputs "Hello World!"
```


# *Metodos Getter y Setter*
Loa métodos ***Getter*** y ***Setter*** Son métodos que permiten el acceso a los atributos de una clase , que están encapsulados de manera privada
**Metodo Getter**
El metodo get("Obtener"): accede a la clase para retornarnos  el valor por lo cual la estructura de este metodo debe contener el tipo de valor que vamos a retornar el con ese metodo
**Metodo Setter**
El metodo set("Establecer") nos sirve para asignar un valor a un atributo de nuestra la clase , esto se hace de manera directa con este metodo, como este metodo no retorna nada debe contener la palabra void en su estructura y siempre debe recibir un parametro de entrada
## Tipos de modificadores de acceso?

 - **Modificador de acceso prívate:** Este modificador es el mas restrictivo , la unica manera de acceder a los datos es mediante con la clase asociada
 - **El modificador por defecto (default):** Cuando no declaramos un modificador de acceso , java asigna el modificador default, este modificador permite  accesar los datos de la propia clase, como las clases del mismo paquete
 - **Modificador de acceso protected:** Los datos se acceden con la misma clase, clases del mismo paquete y clases heredados
 - **Modificador public:** Este es el modificador con mas libertad , podemos acceder  los datos donde sea 
 -<table>
    <tbody><tr>
        <td>Mo<wbr>di<wbr>fi<wbr>ca<wbr>dor</td>
        <td>La misma cla<wbr>se</td>
        <td>Mismo pa<wbr>que<wbr>te</td>
        <td>Sub<wbr>clase</td>
        <td>Otro pa<wbr>que<wbr>te</td>
    </tr>
    <tr>
        <td>pri<wbr>vate</td>
        <td>Sí</td>
        <td>No</td>
        <td>No</td>
        <td>No</td>
    </tr>
    <tr>
        <td>de<wbr>fault</td>
        <td>Sí</td>
        <td>Sí</td>
        <td>No</td>
        <td>No</td>
    </tr>
    <tr>
        <td>pro<wbr>tec<wbr>ted</td>
        <td>Sí</td>
        <td>Sí</td>
        <td>Sí/No</td>
        <td>No</td>
    </tr>
    <tr>
        <td>pu<wbr>blic</td>
        <td>Sí</td>
        <td>Sí</td>
        <td>Sí</td>
        <td>Sí</td>
    </tr>
</tbody></table>

## Constructores 
**Que es un constructor?** Un constructor  sirve para inicializar el objeto y establecer sus propiedades y valores predeterminados.

**Sintaxis**

```java
// Create a Main class
public class Main {
  int x;  // Create a class attribute

  // Create a class constructor for the Main class
  public Main() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}

// Outputs 5
```
## Herencia y Polimorfismo
**Que es la herencia en POO?** La herencia en poo es cuando "hederemos" Características de una clase a otra, de esta forma nos permite reutilizar atributos y métodos para otras clases

 - **Clase Base:** La clase base es la que hereda sus atributos y metodos
 - **Clase Derivada:** Esta es la clase que recibe métodos y atributos
 
Para poder hederar clases tenemos que usar la palabra **extends**

**Sintaxis de la herencia**

```java
class Vehicle {
  protected String brand = "Ford";        // Vehicle attribute
  public void honk() {                    // Vehicle method
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";    // Car attribute
  public static void main(String[] args) {

    // Create a myCar object
    Car myCar = new Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}
```

**Que es el polimorfismo en POO?** El polimorfismo es la capacidad de un objeto en ofrecer diferentes respuestas 

**Ejemplos de polimorfismo**

```java
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}

```
## Clases Abstractas
**Clases abstractas:** Es una clase especial que no puede crear objetos , se usa como base para otros clase, solo se usa para heredar
**Métodos abstractos:** Tiene como principal que no tiene cuerpo , solo tiene cuerpo cuando hederemos el método a una clase hija
**Ejemplos de uso de clases abstractas**
```java
// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
```

## Excepciones

**Que son las exepciones en java?** Las exepciones son formas que java nos da para controlar errores, son muy utiles para errores previstos y imprevistos

**Tipos de exepciones en java:** 
-   **Excepciones irrecuperables:** Hijas de  **Error**. Son errores de la propia máquina virtual de Java.
-   **Excepciones que NO es necesario gestionar:** Hijas de  **RunTimeException**. Son excepciones muy comunes, por ejemplo  **NullPointerException**,  **ArrayIndexOutOfBoundsException**.
-   **Excepciones que es necesario gestionar:** Hijas de  **Exception**. Todas las demás, por ejemplo  **IOException**.
![Diagramas de exepciones en java](https://4.bp.blogspot.com/-KH32JPEWi_s/V4QBF6yaaKI/AAAAAAAABRM/s56Y3mTNKuQ3x3TRjB8P9axzBm8zZoHjgCLcB/s640/Excepciones.png)

**Ejemplo de exepciones**
```java
public class Main {
  public static void main(String[] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    } finally {
      System.out.println("The 'try catch' is finished.");
    }
  }
}
```
 
