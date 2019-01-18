[Referenicias](https://www.tutorialspoint.com/design_pattern)

# **Patrones de diseño creacionales**
Se centran en automatizar los problemas al crear instancias de las clases de nuestra aplicacion.
## **Singleton**
Su proposito es asegurar que solo exista un instancia de una clase.Este es patron de diseño mas simple que se puede utilizar al momento del desarrollo de software.
Hay veces en las que necitaremos de una sola instacia de una conexion a una base de datos , ahora imagines que multiples usarios se conecten entonces tendremos multiples conexiones , para facilitar este es mejor crear una sola instacia de esta conexion y que los usarios consuman de esta sola instacia.
### **Implementación :**
Se debe crear una clase SingleObject . Donde su constructor sea privado para que no pueda ser instaciada y debe tener una instacia estatica de si misma .

```java
    public class Singleton{
        private static Singleton obj ;

        private Singleton(){

        }

        public static Singleton getInstance(){
            if(obj==null){
                obj = new Singleton();
            }
            return obj;
        }
    }
```

### PLUS(Control de doble bloqueo) : 
> Este es un patron de diseño utilizado para reducir la sobrecarga de adquirir un bloqueo al probar el criterio del bloqueo<br>
>El bloqueo se produce solo si la verificación del criterio de bloqueo indica que se requiere un bloqueo



Forma eficiente usando el doble control de bloqueo :

```java
    public class Singleton{
        private volatile static Singleton obj ;//La palabra volatile garantizará varios subprocesos manejen la isntacia de singleton correctamente
        private Singleton(){

        }
        public static Singleton getInstance(){
            if(obj==null){
                synchronized (Singleton.class){
                    if(obj==null){
                        obj=new Singleton();
                    }
                }
            }
            return obj;
        }
    }
```

## **Factory**
Este es el patron mas usando al desarrollar software en java . Este tipo de patron de diseño se incluye en el patron de creación, ya que este patron proporciona una de las mejores formas de crear un objeto.
En este patron se crea un objeto sin exponer la logica de creacion al cliente y nos referimos al nuevo objeto creado usando lainterfaz comun.
Este objeto lo que permitirá es construir un objeto cada ves que necesitemos.por eso el nombre de fabrica
### **Intención**
Define una interfaz para crear un objeto,pero deja que las subclases decidan que clase crear una instacia.
```java
    interface IAuto{
        void arrancar();
    }

    class Toyota implements IAuto{
        @Override
        public void arrancar(){
            System.out.println("Arrancando Toyota");
        }
    }
    class Nisan implements IAuto{
        @Override
        public void arrancar(){
            System.out.println("Arrancando Nisan");
        }
    }
    class Fabrica{
        public IAuto getAuto(String marca){
            if(marca.equalsIgnoreCase("TOYOTA")){
                return new Toyota();
            }else{
                return new Nisan();
            }
        }
    }

    class Main{
        public static void main(String[] args){
            Fabrica fabrica=new Fabrica();
            IAuto toy = fabrica.getAuto("toyota");
            toy.arrancar();
            IAuto nis = fabrica.getAuto("nisan");
            nis.arrancar();
        }
    }
```


## **Prototype**
Este patron lo que permite es ocultar la complejidad de crear nuevas instancias del cliente.El concepto es copiar un objeto existente en lugar de crear una nueva instacias desde cero .El objeto existente acutara como un prototipo y contiene el estado del objeto. El objeto recien copiado podra cambiar o modificar las propiedades si es necesario.Este patron o enfoque reducirá recuersos y tiempo en lugar de crear desde cero un objeto.